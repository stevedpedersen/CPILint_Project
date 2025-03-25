#!/bin/groovy
@Library('jpm_shared_lib@feature/JEAS-193-create-btp-pipeline') _
import org.jnj.pipelines.*
def args = [:]
args.debug = true
args.manifestSourcesFile = 'manifest-sources.yaml'
args.detectEnvironmentByBranch = false
new stdPipeline().execute(args)
