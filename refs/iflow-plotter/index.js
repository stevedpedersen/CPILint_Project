'use strict';

var AdmZip = require('adm-zip'),
	fs = require("fs"),
	xml2js = require("xml2js"),
	chalk = require('chalk'),
	path = require('path');
	
	const {
	  convertAll
	} = require('bpmn-to-image');

var iflowInfo = {
	name: null,
	diagrams: []
}
var debug = false

function sleep(ms) {
  return new Promise((resolve) => {
    setTimeout(resolve, ms);
  });
} 

function dbg(msg, indexer){
	if (debug){
		if (indexer === undefined){
			console.log(chalk.yellow(msg))
		} else {
			console.log(chalk.yellow(chalk.bold(`${indexer}: `) + msg))
		}
	}
}

function log(msg){
	console.log(msg)
}

function err(msg){
	console.error(chalk.red(msg))
}

function findNode(data, name){
	if (!data) {
		return [];
	}
	
	var objs = []
	try {
		Object.entries(data).forEach(([key, value]) => {
			if (key == name){
				objs.push(value)
				return objs
			}
			if (typeof value == "object" && value !== null){
				var tmp = findNode(value, name)
				if (tmp && tmp.length > 0){
					objs = [...objs, ...tmp]
				}
			}
		});
	} catch (e) {
		err(`Error in findNode: ${e.message || e}`);
		dbg(e.stack, "Stack trace");
	}
	return objs
}

async function renderDiagram(diagPath, diagName, targetFormats, scaleFactor, outDir){
	await convertAll([
	{
		input: diagPath,
		outputs: targetFormats.map(tf => path.join(outDir,`${diagName}.${tf}`))
	  }
	], {
	  minDimensions: { width: 400, height: 300 },
	  title: false,
	  footer: false,
	  deviceScaleFactor: scaleFactor
	});
	log(chalk.greenBright("Rendered successfully"))
	fs.unlinkSync(diagPath)
}

async function plotIFlow(iFlowZipFile, targetFormats, scaleFactor, outputDir, debugFlag){	
	debug = !(debugFlag === undefined) && debugFlag != false
	dbg(debugFlag, "$debugFlag")
	dbg(debug, "$debug")
	try {
		//Unzip iflow
		log("Unzipping IFlow...")
		const flowFile = new AdmZip(iFlowZipFile);
				
		//Read .project file
		log("Parsing .project file...")
		var pFileContent = flowFile.readAsText(flowFile.getEntry(".project"))	
		xml2js.parseString(pFileContent, function(ex, result) {
			if (ex) err(ex)
			iflowInfo.name = result.projectDescription.name[0]
			log(`Found IFlow with name: ${iflowInfo.name}`)
		})
		
		//Read diagrams/BPMN-xmls
		log("Reading BPMN diagram file(s)...")
		var diagFiles = flowFile.getEntries().filter(entry => entry.entryName.startsWith("src/main/resources/scenarioflows/integrationflow"))
		dbg(diagFiles.length, "Number .iflw-diagrams")
		if (diagFiles.length < 1) throw "IFlow doesn't contain any diagrams!"
		
		diagFiles.forEach(diagEntry => {
			try {
				const filenameMatch = diagEntry.name ? diagEntry.name.match(/(.*?).iflw$/) : null;
				const diagramName = filenameMatch && filenameMatch[1] ? filenameMatch[1] : diagEntry.name;
				
				iflowInfo.diagrams.push({
					name: diagramName,
					filename: diagEntry.name,
					content: flowFile.readAsText(diagEntry)
				})
				log(`Found IFlow diagram with name: ${iflowInfo.diagrams.slice(-1)[0].filename}`)
			} catch (e) {
				err(`Error processing diagram file: ${e.message || e}`)
				dbg(e.stack, "Stack trace")
			}
		})
		
		//Patch XMLDocument and render
		log("Patching SAP BPMN diagrams...")	
		iflowInfo.diagrams.forEach(diag => {
			xml2js.parseString(diag.content, function(ex, result) {
				if (ex) {
					err(ex);
					return;
				}
				
				if (!result) {
					err("XML parsing returned null result");
					return;
				}
				
				var json = result;
				// Add null checks for the findNode result
				var res = findNode(json, "bpmn2:subProcess") || [];
				dbg(JSON.stringify(res, null, 2), "subProcess result");
								
				//Foreach BPMN subprocess...
				if (!Array.isArray(res)) {
					dbg("subProcess result is not an array, converting", "WARNING");
					res = [res].filter(Boolean); // Convert to array and filter out nulls
				}
				
				res.forEach(sp => {
					// Add null checks to prevent "Cannot read properties of null (reading '1')" error
					if (!sp || !Array.isArray(sp) || sp.length === 0 || !sp[0] || !sp[0].$) {
						dbg("Skipping subprocess due to unexpected format", "WARNING");
						return; // Skip this iteration
					}
					
					var sid = sp[0].$.id;
					dbg(sid, "Subprocess ID")
					dbg(sp[0].$.name, "Subprocess Name")
					
					//...find the matching BPMN shape via its id...
					var shapes = findNode(json, "bpmndi:BPMNShape");
					if (!shapes || !Array.isArray(shapes) || shapes.length === 0) {
						dbg("No BPMNShapes found", "WARNING");
						return;
					}
					
					var shape = shapes[0].find(shape => {
						return shape && shape.$ && shape.$.bpmnElement == sid;
					});
					
					// Add null check before trying to set isExpanded
					if (shape && shape.$) {
						//...and expand shape (=subprocess)
						shape.$['isExpanded'] = true
						dbg(JSON.stringify(shape, null, 2), "Patched shape")
					} else {
						dbg(`No matching shape found for subprocess ID: ${sid}`, "WARNING");
					}
				});

				try {
					// Check if json is valid before attempting to build XML
					if (!json) {
						dbg("JSON object is null or undefined, cannot build XML", "ERROR");
						err("Cannot build XML from invalid JSON object");
						return;
					}
					
					var builder = new xml2js.Builder();
					var xml = builder.buildObject(json);

					const tmpDiagName = `${diag.filename}.patched`
					fs.writeFile(tmpDiagName, xml, function(ex, data) {
					  if (ex) err(ex)
					  log("Successfully written patched diagram to file")
					});
					
					if (targetFormats.includes("bpmn")){
						log("Write out BPMN format")					
						let outPath = path.join(outputDir,`${diag.name}.bpmn`)
						dbg(outPath, "outPath")	
						fs.writeFile(outPath, xml, function(ex, data) {
						  if (ex) err(ex)
						  log(`Wrote BPMN.io compatible XML to: ${outPath}`)
						});					
					}
					
					log("Start rendering")
					renderDiagram(tmpDiagName, diag.name, targetFormats.filter(f =>  f != "bpmn"), scaleFactor, outputDir)
				} catch (ex) {
					err(`Error building or writing XML: ${ex.message || ex}`);
					dbg(ex.stack, "Stack trace");
				}
			});
		});
	} catch (ex){
		var msg = ex
		if (ex.message !== undefined) msg = ex.message
		if (debug && ex.stack !== undefined) msg = ex.stack.toString()		
		err(msg)
	}	
}

module.exports = plotIFlow