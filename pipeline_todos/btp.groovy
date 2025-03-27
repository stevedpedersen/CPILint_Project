#!/bin/groovy

import org.jnj.*;
import org.jnj.test.JPMTest
import org.jnj.test.ExecutionType
import org.jnj.test.TestType
import static groovy.json.JsonOutput.*

def btpPackage(props, jobVars = [:], jobManifest = null, stageLocation = 'package') {
    def packageId = util.getValueHelper('packageId', null, props, jobVars?.btp)
    def credentialsId = util.getValueHelper('cpiCredentialsId', null, props, jobVars?.btp)
    def apiCredentialsId = util.getValueHelper('apiCredentialsId', null, props, jobVars?.btp)
    def authHost = util.getValueHelper('authHost', null, props, jobVars?.btp)
    def cpiHost = util.getValueHelper('cpiHost', null, props, jobVars?.btp)
    def apiHost = util.getValueHelper('apiHost', null, props, jobVars?.btp)
    def proxyNames = util.getValueHelper('proxyNames', [], props, jobVars?.btp)
    def environmentName = util.getValueHelper('environment', null, props, jobVars?.deploy, jobVars?.btp)

    if (jobVars.buildUserInfo?.userTriggered) {
        ensure.inNode {
            // get everything from BTP in here:
            dir('build') {
                deleteDir()

                // set up working folder. impersonate user who started the build
                scmlib.checkout(jobVars.projectRepo, jobVars.projectBranch, ['detach': false])
                sh """
                    git config user.name "${jobVars?.buildUserInfo?.name}"
                    git config user.email "${jobVars?.buildUserInfo?.email}"
                """

                // Get one package
                // https://ent-sandbox-2-3q1h0ska.it-cpi019.cfapps.us10-002.hana.ondemand.com/api/v1/IntegrationPackages('IPGlobalPOCJNJ')
                def integrationPackage = getCpiInfo("https://${cpiHost}/api/v1/IntegrationPackages('${packageId}')", credentialsId)

                // Then get stuff that is in the package
                // artifacts
                // https://ent-sandbox-2-3q1h0ska.it-cpi019.cfapps.us10-002.hana.ondemand.com/api/v1/IntegrationPackages('IPGlobalPOCJNJ')/IntegrationDesigntimeArtifacts
                // iterate d.results to get Id, Name, etc.
                def integrationArtifactInfo = getCpiInfo(integrationPackage['IntegrationDesigntimeArtifacts']['__deferred']['uri'], credentialsId)['results']

                // For each of those, get the artifact
                // __metadata.uri from above
                // https://ent-sandbox-2-3q1h0ska.it-cpi019.cfapps.us10-002.hana.ondemand.com:443/api/v1/IntegrationDesigntimeArtifacts(Id='TestSF',Version='1.0.0')/$value
                // create a folder, unzip to it
                def gitFolder="IntegrationContent"
                integrationArtifactInfo.each {
                    // they may never put another type here but they mention it, so
                    if (it.__metadata.type == 'com.sap.hci.api.IntegrationDesigntimeArtifact') {
                        if (it.Version == 'Draft'){
                            pPrint.info "BTP: Cannot download IntegrationDesigntimeArtifact artifact $it.Name with version: 'Draft'"
                        } else {
                            pPrint.debug "BTP: Downloading IntegrationDesigntimeArtifact $it.Name"
                            getZipFile(it.__metadata.media_src, credentialsId,gitFolder)
                        }   
                    } else {
                        pPrint.debug "BTP: I don't know how to download $it.__metadata.type for $it.Name"
                    }
                }
                //Get ValueMappings
                def integrationValueMappingsInfo = getCpiInfo(integrationPackage['ValueMappingDesigntimeArtifacts']['__deferred']['uri'], credentialsId)['results']
                integrationValueMappingsInfo.each {
                    // they may never put another type here but they mention it, so
                    if (it.__metadata.type == 'com.sap.hci.api.ValueMappingDesigntimeArtifact') {
                        if (it.Version == 'Draft'){
                            pPrint.info "BTP: Cannot download ValueMapping artifact $it.Name with version: 'Draft'"
                        } else {
                            pPrint.debug "BTP: Downloading ValueMapping artifact $it.Name"
                            getZipFile(it.__metadata.media_src, credentialsId,gitFolder)
                        }
                    } else {
                        pPrint.debug "BTP: I don't know how to download $it.__metadata.type for $it.Name"
                    }
                }
                //Get Script Collection
                def integrationScriptCollectionInfo = getCpiInfo(integrationPackage['ScriptCollectionDesigntimeArtifacts']['__deferred']['uri'], credentialsId)['results']
                integrationScriptCollectionInfo.each {
                    // they may never put another type here but they mention it, so
                    if (it.__metadata.type == 'com.sap.hci.api.ScriptCollectionDesigntimeArtifact') {
                        if (it.Version == 'Draft'){
                            pPrint.info "BTP: Cannot download ScriptCollection artifact $it.Name with version: 'Draft'"
                        } else {
                            pPrint.debug "BTP: Downloading ScriptCollection artifact $it.Name"
                            getZipFile(it.__metadata.media_src, credentialsId,gitFolder)
                        }
                    } else {
                        pPrint.debug "BTP: I don't know how to download $it.__metadata.type for $it.Name"
                    }
                }
                // proxies
                // https://us10apiportal.cfapps.us10.hana.ondemand.com/apiportal/api/1.0/Management.svc/APIProducts('S4_SalesOrder')/apiProxies
                // d.results has a bunch of proxies
                // doesn't give the Transport url below exactly but it does name them
                // proxies . this downloads a zip
                // https://us10apiportal.cfapps.us10.hana.ondemand.com/apiportal/api/1.0/Transport.svc/APIProxies?name=API_I00XX_SalesOrder_REST_v1
                proxyNames.each {
                    gitFolder="ApiManagement"
                    pPrint.debug "BTP: Now processing proxy Name:::: $it"
                    getZipFile("https://${apiHost}/apiportal/api/1.0/Transport.svc/APIProxies?name=${it}",apiCredentialsId,gitFolder)

                    gitFolder = "ApiProducts"
                    def apiProducts = getCpiInfo("https://${apiHost}/apiportal/api/1.0/Management.svc/APIProxies('${it}')/apiProducts",apiCredentialsId)['results']
                    apiProducts.each {
                        if (it.__metadata.type == 'apiportal.APIProduct' && it.status_code == 'PUBLISHED') {
                            pPrint.debug "BTP: Downloading product $it.name"

                            getJsonFile(it.__metadata.id, apiCredentialsId,gitFolder, it.name)
                        } else {
                            pPrint.debug "BTP: Product is not available $it.status_code for $it.name"
                        }

                    }

                    gitFolder = "ApiProviders"
                    def apiProvider = getCpiInfo("https://${apiHost}/apiportal/api/1.0/Management.svc/APIProxies('${it}')/apiProvider",apiCredentialsId)
                    if(apiProvider !=null && apiProvider.name !=null){
                        pPrint.debug "BTP: Now processing provider Name:::: $apiProvider.name"
                        getJsonFile("https://${apiHost}/apiportal/api/1.0/Management.svc/APIProviders('$apiProvider.name')", apiCredentialsId,gitFolder,apiProvider.name)
                    }
                }

                // push to git
                pPrint.info "jobVars.projectBranch: [${jobVars.projectBranch}]"
                scmlib.commitAndPushFiles('sourcecode-bitbucket', 'Update from BTP IS', [
                        'branchName': jobVars.projectBranch
                ])
                try{
                    scmlib.createPullRequest(jobVars.bbProject, jobVars.bbRepo, jobVars.projectBranch, [
                            title: jobVars.projectBranch,
                            description: 'JPM created Pull request',
                            to: 'develop',
                            reviewers: [],
                            dryRun: false
                    ])
                }catch (Exception e) {
                    println ("Could not create PR: " + e.message)
                }

            }
        }
    } else {
        pPrint.warning "Will not update repository unless manually triggered."
    }
}

def btpUpdateExternalizeParameters(props, jobVars = [:], jobManifest = null, stageLocation = 'postDeploy') {
    def credentialsId = util.getValueHelper('cpiCredentialsId', null, props, jobVars?.btp)
    def cpiHost = util.getValueHelper('cpiHost', null, props, jobVars?.btp)
    def environmentName = util.getValueHelper('environment', null, props, jobVars?.deploy, jobVars?.btp)
    Boolean isUpdateExternalizeParamEnabled = util.getBooleanValueHelper('updateExternalizeParameters', false, props, jobVars?.userParams)
    if (jobVars.buildUserInfo?.userTriggered) {
        ensure.inNode {
            if (isUpdateExternalizeParamEnabled) {
                // get everything from BTP in here:
                dir('build') {
                    deleteDir()
                    // set up working folder. impersonate user who started the build
                    scmlib.checkout(jobVars.projectRepo, jobVars.projectBranch, ['detach': false])
                    sh """
                        git config user.name "${jobVars?.buildUserInfo?.name}"
                        git config user.email "${jobVars?.buildUserInfo?.email}"
                    """
                    pPrint.info "fetching sap oauth token for [${credentialsId}]"
                    def envParams  = readYaml file: "./Resources/${environmentName}.yaml"
                    pPrint.debug "envParams:::: ${envParams}"
                    envParams.each {flowName ->
                        pPrint.info "envParams:flowName::: ${flowName.key}"
                        def Map paramValues = flowName.value as Map
                        paramValues.each {key, value ->
                            pPrint.info "envParams::key:: ${key}"
                            pPrint.info "envParams::value:: ${value}"
                            updateExternalizeParameters("https://${cpiHost}/api/v1/IntegrationDesigntimeArtifacts(Id='${flowName.key}',Version='active')/\$links/Configurations('${key}')",credentialsId,value)
                        }

                    }
                }
            }
        }
    }
}

def btpUpdateValueMappingParameters(props, jobVars = [:], jobManifest = null, stageLocation = 'postDeploy') {
    def credentialsId = util.getValueHelper('cpiCredentialsId', null, props, jobVars?.btp)
    def cpiHost = util.getValueHelper('cpiHost', null, props, jobVars?.btp)
    def environmentName = util.getValueHelper('environment', null, props, jobVars?.deploy, jobVars?.btp)
    Boolean isUpdateValueMappingParamsEnabled = util.getBooleanValueHelper('updateValueMappingParameters', false, props, jobVars?.userParams)
    if (jobVars.buildUserInfo?.userTriggered) {
        ensure.inNode {
            if (isUpdateValueMappingParamsEnabled) {
                // get everything from BTP in here:
                dir('build') {
                    deleteDir()
                    // set up working folder. impersonate user who started the build
                    scmlib.checkout(jobVars.projectRepo, jobVars.projectBranch, ['detach': false])
                    sh """
                        git config user.name "${jobVars?.buildUserInfo?.name}"
                        git config user.email "${jobVars?.buildUserInfo?.email}"
                    """
                    pPrint.info "fetching sap oauth token for [${credentialsId}]"
                    def envParams  = readYaml file: "./Resources/${environmentName}_valueMappings.yaml"
                    envParams.each {valueMapsID ->
                        pPrint.info "envParams:valueMapsID::: ${valueMapsID.key}"
                        valueMapsID.value.each { valueMapSchema ->
                            pPrint.info "valueMapSchema::valueMapSchema:: ${valueMapSchema}"
                            def UrlParams = null
                            def Map valueMapSchemaValues = valueMapSchema.value as Map
                            valueMapSchemaValues.each { key, value ->
                                if (key == 'IsConfigured')
                                    UrlParams = "IsConfigured=${value}"
                                if (key == 'SrcId')
                                    UrlParams = "${UrlParams}&SrcId='${value}'"
                                if (key == 'SrcAgency')
                                    UrlParams = "${UrlParams}&SrcAgency='${value}'"
                                if (key == 'TgtId')
                                    UrlParams = "${UrlParams}&TgtId='${value}'"
                                if (key == 'TgtAgency')
                                    UrlParams = "${UrlParams}&TgtAgency='${value}'"
                                if (key == 'Version')
                                    UrlParams = "${UrlParams}&Version='${value}'"
                                if (key == 'valueMaps')
                                    value.each { valMaps ->
                                        def Map valueMapValues = valMaps.value as Map
                                        valueMapValues.each { mapKey, mapValue ->
                                            updateValueMappingParameters("https://${cpiHost}/api/v1/UpsertValMaps?Id='${valueMapsID.key}'&${UrlParams}&ValMapId='${valMaps.key}'&SrcValue='${mapKey}'&TgtValue='${mapValue}'", credentialsId, value)
                                        }
                                    }
                            }

                        }
                    }
                }
            }
        }
    }
}

def btpPublish(props, jobVars = [:], jobManifest = null) {
    // TODO: publish mtar to artifactory
    //
}

public def getToken(credentialsId, props = [:]) {
    def token = null
    def jobVars = [:]

    pPrint.info "fetching sap oauth token for [${credentialsId}]"
    def response = httpUtil.withBasicAuth(credentialsId).doGet(
            "${getAuthEndpoint(props, jobVars)}?grant_type=client_credentials")
    if (response['jsonContent'] && response['jsonContent']['access_token']) {
        token = response['jsonContent']['access_token']
    }

    return token
}

private def getAuthEndpoint(props = [:], jobVars = [:]) {
    if (!jobVars && jpmManifest.get()) {
        jobVars = jpmManifest.get().getJobVars()
    }
    def authHost = util.getValueHelper('authHost', 'ent-sandbox-2-3q1h0ska.authentication.us10.hana.ondemand.com', props, jobVars?.btp)
    def url = util.getValueHelper('url', "https://${authHost}/oauth/token", props, jobVars?.btp)
    return url
}

public def getCpiInfo(url, credentialsId) {
    def info = null

    def response = httpUtil
            .withBearerAuth('btp', credentialsId)
            .withConnectTimeoutSeconds(30)
            .doGet(url)

    if (response['jsonContent'] && response['jsonContent']['d']) {
        info = response['jsonContent']['d']
    }
    return info
}
public def updateValueMappingParameters(url, credentialsId, paramValue) {
    def payload = '{\"ParameterValue\":' + '\"' + paramValue + '\"}'
    def response = httpRequest acceptType: 'APPLICATION_JSON',
            customHeaders: [[maskValue: true, name: 'Authorization', value: "Bearer ${getToken(credentialsId)}"]],
            contentType: 'APPLICATION_JSON',
            httpMode: 'POST',
            ignoreSslErrors: true,
            responseHandle: 'LEAVE_OPEN',
            validResponseCodes: '100:399,400',
            timeout: 30,
            requestBody: payload,
            url: url
    if (response.status == 400) {
        //invalid Flow ID
        pPrint.debug"Received http status code 400.::${response.content}"
    }
    response.close();
}

public def updateExternalizeParameters(url, credentialsId, paramValue) {
    def payload = '{\"ParameterValue\":' + '\"' + paramValue + '\"}'
    def response = httpRequest acceptType: 'APPLICATION_JSON',
            customHeaders: [[maskValue: true, name: 'Authorization', value: "Bearer ${getToken(credentialsId)}"]],
            contentType: 'APPLICATION_JSON',
            httpMode: 'PUT',
            ignoreSslErrors: true,
            responseHandle: 'LEAVE_OPEN',
            validResponseCodes: '100:399,404',
            timeout: 30,
            requestBody: payload,
            url: url
    if (response.status == 404) {
        //invalid Flow ID
        pPrint.debug("Received http status code 404. Please check if the parameter that you have provided exists on the iFlow.")
    }
    response.close();
}

public def getZipFile(url, credentialsId, gitFolder) {
    def tempfile = UUID.randomUUID().toString() + ".zip"
    def response = httpRequest acceptType: 'APPLICATION_ZIP',
            customHeaders: [[maskValue: false, name: 'Authorization', value: "Bearer ${getToken(credentialsId)}"]],
            ignoreSslErrors: false,
            responseHandle: 'LEAVE_OPEN',
            validResponseCodes: '100:399, 404',
            timeout: 30,
            outputFile: tempfile,
            url: url

    if (response.status == 404) {
        //invalid Flow ID
        pPrint.debug("Received http status code 404. Please check if the artifact ID that you have provided exists on the tenant.")
    }

    def disposition = response.headers.toString()
    def index = disposition.indexOf('filename') + 9
    def lastindex = disposition.indexOf('.zip', index)
    def filename = disposition.substring(index + 1, lastindex + 4)
    def folder = gitFolder + '/' + filename.substring(0, filename.indexOf('.zip'))
    def zipfolder = gitFolder + '/ZipFiles'
    // // TODO:        # mv ${tempfile} ${zipfolder}/${filename} move to artifactory server.
    sh """
        mkdir -p ${gitFolder}
        mkdir -p ${zipfolder}

        unzip -uo ${tempfile} -d ${folder}
        rm -f ${tempfile}
        find ${folder} -name "parameters.prop" -type f -exec sed -i'' '1d' {} \\;
        find ${folder} -name "metainfo.prop" -type f -exec sed -i'' '2d' {} \\;
    """

    response.close();
}


public def getJsonFile(url, credentialsId, gitFolder, fileName) {
    def tempfile = fileName + ".json"
    def response = httpRequest acceptType: 'APPLICATION_JSON',
            customHeaders: [[maskValue: true, name: 'Authorization', value: "Bearer ${getToken(credentialsId)}"]],
            ignoreSslErrors: true,
            responseHandle: 'LEAVE_OPEN',
            validResponseCodes: '100:399, 404',
            timeout: 30,
            outputFile: tempfile,
            url: url

    if (response.status == 404) {
        //invalid Flow ID
        pPrint.debug("Received http status code 404. Please check if the artifact ID that you have provided exists on the tenant.")
    }

    sh """
        mkdir -p ${gitFolder}
        mv ${tempfile} ${gitFolder}/${tempfile}
    """
    response.close();
}

/**
 * btpRunStaticAnalysis - BTP pipeline static code analysis stage uses CPILint CLI
 * tool to fetch remote iFlow artifacts and lint their XML exports. Evaluations
 * use configurable rulesets. Linting results output as JSON and determine pass/fail.
 *
 * @param props Pipeline stage properties
 * @param jobVars Pipeline job variables
 */
def btpRunStaticAnalysis(props, jobVars = [:]) {
    def staticAnalysis = jobVars?.staticAnalysis
    if (!(staticAnalysis?.enabled && staticAnalysis?.type == 'cpilint')) {
        pPrint.info "StaticAnalysis stage disabled or not CPILint. Skipping."
        return
    }

    def cpiApiCredsId = util.getValueHelper('cpiCredentialsId', null, props, jobVars?.btp)
    def cpiApiHost = util.getValueHelper('cpiHost', null, props, jobVars?.btp)
    def authHost = util.getValueHelper('authHost', null, props, jobVars?.btp)
    def ruleset = util.getValueHelper('rulesetForStaticAnalysis', 'default', props, jobVars?.userParams, staticAnalysis)
    def iFlows = util.getValueHelper('iFlowsIncludedInStaticAnalysis', '', props, jobVars?.userParams, staticAnalysis)
    def packageId = util.getValueHelper('packageId', null, props, jobVars?.btp)
    def artifactoryUrl = util.getValueHelper('url', null, props, jobVars?.artifactory)
    def artifactPath = util.getValueHelper('artifactPath', null, props, jobVars?.artifactory)
    def dockerImage = util.getValueHelper('dockerImage', 'jnj.artifactrepo.jnj.com/jpm/openjdk:17-jdk-slim', props, jobVars?.artifactory)

    ensure.inNode {
        docker.image(dockerImage).inside {
            dir('cpilint') {
                deleteDir()

                // Download and extract cpilint from Artifactory
                download(cpiApiCredsId, "${artifactoryUrl}/${artifactPath}/bin/cpilint", "./bin")
                sh "chmod +x ./bin/cpilint"

                download(cpiApiCredsId, "${artifactoryUrl}/${artifactPath}/lib/", "./lib/")
                download(cpiApiCredsId, "${artifactoryUrl}/${artifactPath}/rules/${ruleset}.xml", "./rules/${ruleset}.xml")
                download(cpiApiCredsId, "${artifactoryUrl}/${artifactPath}/logback/logback.xml", "./logback/logback.xml")

                def resultFile = "cpilint-${packageId}.json"
                def cpilintCmd = """./bin/cpilint \
                    -debug \
                    -boring \
                    -rules rules/${ruleset}.xml \
                    -url ${cpiApiHost} \
                    -tokenurl https://${authHost}/oauth/token \
                    -output json \
                    -packages ${packageId}
                    """

                if (iFlows) {
                    cpilintCmd += " -iflows"
                    iFlows.split(',').each { iFlow ->
                        cpilintCmd += " ${iFlow.trim()}"
                    }
                }

                // Execute CPILint with credentials
                withCredentials([
                    usernamePassword(credentialsId: cpiApiCredsId, usernameVariable: 'CLIENT_ID', passwordVariable: 'CLIENT_SECRET')
                ]) {
                    def cmdLog = "Executing CPILint command: ${cpilintCmd}"
                    cpilintCmd += " -clientid '${CLIENT_ID}' -clientsecret '${CLIENT_SECRET}'"
                    pPrint.info cmdLog

                    try {
                        sh "${cpilintCmd}"
                    } catch (Exception e) {
                        pPrint.error "Error while ${cmdLog}"
                        return
                    }
                }

                // Parse CPILint JSON to decide pass/fail
                if (!resultFile) {
                    pPrint.info "Could not find resultFile: ${resultFile}. Running ls command..."
                    sh "ls -la > ${resultFile}"
                    if (resultFile) {
                        def dirContent = readFile(resultFile).trim()
                        pPrint.info "\n\nDIRECTORY CONTENTS:\n$dirContent\n"
                    }
                }

                def jsonContent = readFile(resultFile).trim()
                def issues = new JsonSlurper().parseText(jsonContent)

                if (issues && issues.size() > 0) {
                    pPrint.error "CPILint identified issues. Stage failing."
                    issues.each { issue ->
                        pPrint.error "iFlow [${issue.iflowId} - ${issue.iflowName}]: ${issue.message}"
                    }
                    error("CPILint found issues. See logs for details.")
                } else {
                    pPrint.info "CPILint found no issues."
                }

                // Archive JSON output for debug
                archiveArtifacts artifacts: resultFile, fingerprint: true, allowEmptyArchive: true

                // Cleanup
                sh "rm -f ${resultFile}"
            }
        }
    }
}

return this




// /**
//  * btpRunStaticAnalysis - BTP pipeline static code analysis stage uses CPILint CLI
//  * tool to fetch remote iFlow artifacts and lint their XML exports. Evaluations
//  * use configurable rulesets. Linting results output as JSON and determine pass/fail.
//  *
//  * @param props Pipeline stage properties
//  * @param jobVars Pipeline job variables
//  */
// def btpRunStaticAnalysis(props, jobVars = [:]) {
//     def staticAnalysis = jobVars?.staticAnalysis
//     if (!(staticAnalysis?.enabled && staticAnalysis?.type == 'cpilint')) {
//         pPrint.info "StaticAnalysis stage disabled or not CPILint. Skipping."
//         return
//     }

//     def apiCredentialsId = util.getValueHelper('apiCredentialsId', null, props, jobVars?.btp)
//     def apiHost = util.getValueHelper('apiHost', null, props, jobVars?.btp)
//     def tokenUrl = util.getValueHelper('tokenUrl', null, props, jobVars?.btp)

//     def ruleset = util.getValueHelper('ruleset', 'default', props, staticAnalysis)
//     def iFlows = util.getValueHelper('iFlows', '', props, staticAnalysis)
//     def packageId = util.getValueHelper('packageId', null, props, jobVars?.btp)

//     ensure.inNode {
//         dir('cpilint') {
//             deleteDir()
//             scmlib.checkout(jobVars.projectRepo, jobVars.projectBranch, ['detach': false])

//             def resultFile = "cpilint-${packageId}.json"
//             def cpilintCmd = "./bin/cpilint -boring -rules rules/${ruleset}.xml -url ${apiHost} -tokenurl ${tokenUrl} -output json -packages ${packageId}"

//             if (iFlows) {
//                 iFlows.split(',').each { iFlow ->
//                     cpilintCmd += " -iflows ${iFlow.trim()}"
//                 }
//             }

//             // Add clientId and clientSecret from Jenkins Credentials
//             withCredentials([
//                 usernamePassword(credentialsId: apiCredentialsId, usernameVariable: 'CLIENT_ID', passwordVariable: 'CLIENT_SECRET')
//             ]) {
//                 cpilintCmd += " -clientid '${CLIENT_ID}' -clientsecret '${CLIENT_SECRET}'"

//                 pPrint.info "Executing CPILint command for package '${packageId}' with ruleset '${ruleset}'."

//                 // Execute CPILint
//                 sh "${cpilintCmd} > ${resultFile}"
//             }

//             // Parse CPILint JSON output to decide stage pass/fail
//             def jsonContent = readFile(resultFile).trim()
//             def issues = new JsonSlurper().parseText(jsonContent)

//             if (issues && issues.size() > 0) {
//                 pPrint.error "CPILint identified issues. Stage failing."
//                 issues.each { issue ->
//                     pPrint.error "iFlow [${issue.iflowId} - ${issue.iflowName}]: ${issue.message}"
//                 }
//                 error("CPILint found issues. See logs for details.")
//             } else {
//                 pPrint.info "CPILint found no issues."
//             }

//             // Archive JSON output temporarily for debugging
//             archiveArtifacts artifacts: resultFile, fingerprint: true, allowEmptyArchive: true

//             // Cleanup after archiving
//             sh "rm -f ${resultFile}"
//         }
//     }
// }

// // CPILint Ruleset URLs
// def getRulesFileUrl(ruleset) {
//     def rulesMap = [
//         "default": "https://artifactrepo.jnj.com/artifactory/jeas-ivy/cpilint-1.0.5/rules/default.xml",
//         "sox-compliant": "https://artifactrepo.jnj.com/artifactory/jeas-ivy/cpilint-1.0.5/rules/sox-compliant.xml",
//         "strict": "https://artifactrepo.jnj.com/artifactory/jeas-ivy/cpilint-1.0.5/rules/strict.xml"
//     ]
//     return rulesMap.get(ruleset, rulesMap["default"])
// }

// return this

