#!/bin/groovy
package org.jnj.pipelines;
import org.jnj.*;

/**
 * Description: The btpPipeline class is an implementation of common
 * app-dev  pipeline configured for common tools used by SAP BTP Integration Suite
 *
 */

/**
 * Execute the full btpPipeline pipeline
 *
 * @param     jobManifest    The jobManifest data object.
 *
 */
def execute(jobManifest) {
    debug.info()
    def props = [:]
    props.workspaceSetup = { wsProps ->
        // context: inside unstashed project dir

        // jobVars.btp properties
        def jobVars = jobManifest.getJobVars()
        if (!jobVars?.btp) {
            jobVars.btp = [:]
        }
        
    }
    commonPipeline.execute(jobManifest, props)
}

/**
 * get the default job vars for this pipeline
 * @param  pipelineType an additional label that can be consulted
 * @return              a map of extra defaults
 */
def getDefaultJobVarsWithEnvironment(String pipelineType, String environment) {
    debug.info()
    def defaults = [

            unitTest: [
                    enabled: false,
                    type: 'btp',
                    dir: 'project'
            ],
            staticAnalysis: [
                    enabled: true, // Sonar not supported until 9.5
                    type: 'sonar'
            ],
            package: [
                    enabled: false,
                    type: 'btp',
                    dir: 'project'
            ],
            publish: [
                    enabled: false,
                    type: 'btp',
                    credentialsId: 'jnj-eat-artifactory-build'
            ],
            resolveArtifacts: [
                    enabled: false,
                    type: 'btp',
                    credentialsId: 'jnj-eat-artifactory-build'
            ],
            versionCalculation: [
                    enabled: false,
                    type: 'gitversion',
                    patternType: 'default'
            ],
            versionFileUpdates: [
                    [
                            type: 'btp'
                    ]
            ],
            prerelease: [
                    type: 'none',
                    confirmVersion: false,
                    versionType: 'jnj-rc'
            ],
            release: [
                    type: 'none',
                    confirmVersion: false,
                    versionType: 'jnj-release',
                    updateChangelog: true
            ],
            deploy: [
                    enabled: false
            ],
            buildAnalysis: [
                    enabled: false,
                    type: 'artifactory'
            ],

            postDeploy :[
                    type: 'btp',
                    enabled: false,
                    dir: 'project'
            ]
    ]

    if (environment.toUpperCase().contains('DEV')) {
        defaults.staticAnalysis = [
                enabled: false,
                type: 'sonar',
                longLivedAnalysis: true
        ]
        defaults.package.enabled = false
        defaults.postDeploy.enabled = true
        defaults.publish.enabled = false
        defaults.prerelease.type = 'manual'
        defaults.release.type = 'manual'
        defaults.versionCalculation = [
                enabled: false,
                type: 'gitversion',
                patternType: 'jnj-dev-branch',
                confirmVersion: false
        ]
    }else if (environment.toUpperCase().contains('PQA') || environment.toUpperCase().contains('QA') ||
            environment.toUpperCase().contains('PROD')) {
        defaults.staticAnalysis = [
                enabled: false,
                type: 'sonar',
                longLivedAnalysis: true
        ]
        defaults.package.enabled = false
        defaults.postDeploy.enabled = true
        defaults.publish.enabled = false
        defaults.prerelease.type = 'manual'
        defaults.release.type = 'manual'
        defaults.versionCalculation = [
                enabled: false,
                type: 'gitversion',
                patternType: 'jnj-dev-branch',
                confirmVersion: false
        ]
    }else {
        defaults.staticAnalysis = [
                enabled: true,
                type: 'sonar',
                longLivedAnalysis: true
        ]
        defaults.package.enabled = false
        defaults.publish.enabled = false
        defaults.prerelease.type = 'manual'
        defaults.release.type = 'manual'
        defaults.versionCalculation = [
                enabled: true,
                type: 'gitversion',
                patternType: 'jnj-dev-branch',
                confirmVersion: false
        ]
        defaults.resolveArtifacts.enabled = true
    }

    defaults = util.mergeMaps(defaults, commonPipeline.getCommonDefaults(pipelineType, environment))
    defaults = util.mergeMaps(defaults, commonPipeline.getDefaultBuildParamStates(environment))

    return defaults
}

/**
 * finalize the manifest with any final cleanup
 * @param  jobManifest the job manifest to finalize
 * @return              a map of extra defaults
 */
def finalizeJobVars(jobManifest) {
    debug.info()
    return commonPipeline.finalizeJobVars(jobManifest)
}

return this