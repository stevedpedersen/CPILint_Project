

Existing root project contains 4 git submodules in it. All of which are involved in this effort.

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d-----         3/29/2025  10:19 AM                btp_is_glbl_manifest_config   // The BTP Platform team's global manifest configuration repo. Sets common manifest values and schemas/buildParams
d-----         3/29/2025  10:25 AM                cpilint                       // CPILint source code as a submodule. also will have the release build zip file.
d-----         3/29/2025  10:21 AM                jpm_shared_lib                // Jenkins Framework we're using. Requires updating to add in cpilint feature.
d-----         3/29/2025  10:23 AM                sp_dev_package                // "Project" example which will be linted with cpilint based on it enabling the linting stage in manifest
-a----         3/29/2025  10:21 AM            480 .gitmodules
-a----         3/24/2025   7:16 PM             19 README.md




Snapshot of how they look inside:

$ tree .

├───btp_is_glbl_manifest_config
│   ├───.vscode
│   └───sector
│       ├───corp
│       ├───im
│       └───mt
├───cpilint
│   ├───-p
│   ├───3rd-party-licenses
│   ├───build
│   │   ├───classes
│   │   │   └───org
│   │   │       └───cpilint
│   │   │           ├───api
│   │   │           ├───artifacts
│   │   │           ├───auth
│   │   │           ├───consumers
│   │   │           ├───issues
│   │   │           ├───model
│   │   │           ├───rules
│   │   │           │   └───naming
│   │   │           ├───suppliers
│   │   │           └───util
│   │   └───lib
│   ├───dist-files
│   │   ├───samples
│   │   └───xerces-runtime-jars
│   ├───graphics
│   ├───lib
│   │   ├───compile
│   │   └───runtime
│   ├───logback
│   ├───release
│   ├───resources
│   │   ├───xml-schema
│   │   ├───xquery
│   │   └───xslt
│   ├───scripts
│   └───src
│       └───org
│           └───cpilint
│               ├───api
│               ├───artifacts
│               ├───auth
│               ├───consumers
│               ├───issues
│               ├───model
│               ├───rules
│               │   └───naming
│               ├───suppliers
│               └───util
├───jpm_shared_lib
│   ├───docs
│   │   ├───developer-guide
│   │   ├───docsify
│   │   │   ├───lib
│   │   │   └───themes
│   │   ├───img
│   │   │   ├───faq
│   │   │   └───manifest-builder
│   │   ├───resource
│   │   │   ├───default-examples
│   │   │   └───manifest-examples
│   │   ├───schema
│   │   │   ├───global
│   │   │   └───stages
│   │   │       ├───archive
│   │   │       ├───assembleForPackage
│   │   │       ├───assembleForTest
│   │   │       ├───buildAnalysis
│   │   │       ├───dependencyAnalysis
│   │   │       ├───deploy
│   │   │       ├───integrationTest
│   │   │       ├───lint
│   │   │       ├───package
│   │   │       ├───performanceTest
│   │   │       ├───postDeploy
│   │   │       ├───publish
│   │   │       ├───regressionTest
│   │   │       ├───resolveArtifacts
│   │   │       ├───staticAnalysis
│   │   │       ├───unitTest
│   │   │       └───versionCalculation
│   │   ├───slides
│   │   │   ├───css
│   │   │   │   ├───print
│   │   │   │   └───theme
│   │   │   │       ├───source
│   │   │   │       └───template
│   │   │   ├───img
│   │   │   ├───js
│   │   │   ├───lib
│   │   │   │   ├───css
│   │   │   │   ├───font
│   │   │   │   │   ├───league-gothic
│   │   │   │   │   └───source-sans-pro
│   │   │   │   └───js
│   │   │   ├───md
│   │   │   ├───plugin
│   │   │   │   ├───highlight
│   │   │   │   ├───markdown
│   │   │   │   ├───math
│   │   │   │   ├───multiplex
│   │   │   │   ├───notes
│   │   │   │   ├───notes-server
│   │   │   │   ├───print-pdf
│   │   │   │   ├───search
│   │   │   │   └───zoom-js
│   │   │   ├───scripts
│   │   │   └───test
│   │   │       ├───assets
│   │   │       └───examples
│   │   │           └───assets
│   │   └───user-guide
│   │       ├───jpm-faqs
│   │       ├───jpm-pipelines
│   │       │   ├───androidv2
│   │       │   ├───apigee
│   │       │   ├───databricks
│   │       │   ├───datica
│   │       │   ├───docgen
│   │       │   ├───dotnet
│   │       │   ├───drupal
│   │       │   ├───edl
│   │       │   ├───gradle
│   │       │   ├───helmstarters
│   │       │   ├───iics
│   │       │   ├───iOS
│   │       │   ├───jamstack
│   │       │   ├───java
│   │       │   ├───jpmLibrary
│   │       │   ├───netframework
│   │       │   ├───node
│   │       │   ├───php
│   │       │   ├───powerbi
│   │       │   ├───python
│   │       │   ├───qlik
│   │       │   ├───R
│   │       │   ├───reactnative
│   │       │   ├───reactweb
│   │       │   ├───resources
│   │       │   ├───s3
│   │       │   ├───salesforce
│   │       │   ├───salesforcev2
│   │       │   ├───scmJenkins
│   │       │   ├───sql
│   │       │   ├───stages
│   │       │   ├───tableau
│   │       │   └───terraformModule
│   │       └───utility-objects
│   │           ├───acquia
│   │           ├───ajv
│   │           ├───android
│   │           ├───androidv2
│   │           ├───announcements
│   │           ├───announcementTemplate
│   │           ├───apigee
│   │           ├───appdevtools
│   │           ├───archive
│   │           ├───argocd
│   │           ├───artifactory
│   │           ├───assemble
│   │           ├───azure
│   │           ├───buildResultResources
│   │           ├───calculateChanges
│   │           ├───checkmarx
│   │           ├───cloudflare
│   │           ├───cloudfront
│   │           ├───cloudx
│   │           ├───commands
│   │           ├───commonStage
│   │           ├───customSetup
│   │           ├───debug
│   │           ├───deploy
│   │           ├───deprecated
│   │           ├───dockerImage
│   │           ├───dotnet
│   │           ├───edl
│   │           ├───enc
│   │           ├───ensure
│   │           ├───externalpipeline
│   │           ├───featureFlags
│   │           ├───flyway
│   │           ├───gcs
│   │           ├───go
│   │           ├───gradle
│   │           ├───helm
│   │           ├───httpRest
│   │           ├───httpUtil
│   │           ├───hugo
│   │           ├───hyperion
│   │           ├───iac
│   │           ├───iics
│   │           ├───iOS
│   │           ├───iris
│   │           ├───java
│   │           ├───jenkinsProfile
│   │           ├───jfrogCli
│   │           ├───jiraXray
│   │           ├───jlib
│   │           ├───jpmConfig
│   │           ├───jpmManifest
│   │           ├───ldap
│   │           ├───lint
│   │           ├───msbuild
│   │           ├───nodelib
│   │           ├───noname
│   │           ├───openapi
│   │           ├───package
│   │           ├───performanceTest
│   │           ├───php
│   │           ├───platformsh
│   │           ├───plib
│   │           ├───powerbi
│   │           ├───pPrint
│   │           ├───pythonlib
│   │           ├───pythonlibv2
│   │           ├───qlik
│   │           ├───react
│   │           ├───reactnative
│   │           ├───resource
│   │           ├───rlib
│   │           ├───robot
│   │           ├───s3lib
│   │           ├───salesforcev2
│   │           ├───saucelabs
│   │           ├───schemaValidation
│   │           ├───scmlib
│   │           ├───secretsinjection
│   │           ├───security
│   │           ├───snyk
│   │           ├───sonar
│   │           ├───spydr
│   │           ├───tableau
│   │           ├───terraform
│   │           ├───terragrunt
│   │           ├───testUtils
│   │           ├───tokens
│   │           ├───toscm
│   │           ├───unlighthouse
│   │           ├───userScript
│   │           ├───util
│   │           ├───vercel
│   │           ├───version
│   │           ├───versioncalculation
│   │           ├───xenacli
│   │           └───zap
│   ├───dslScripts
│   ├───resources
│   │   └───org
│   │       └───jnj
│   │           ├───buildResultResources
│   │           ├───config
│   │           │   ├───capabilities
│   │           │   ├───simpleLint
│   │           │   └───unlighthouse
│   │           ├───data
│   │           │   └───templates
│   │           ├───docker
│   │           ├───gitversion
│   │           ├───pipelines               (btpPipeline.groovy is here)
│   │           │   └───salesforce
│   │           ├───schema
│   │           │   ├───compiled
│   │           │   ├───meta
│   │           │   └───raw
│   │           │       ├───global
│   │           │       └───stages
│   │           │           ├───archive
│   │           │           ├───assembleForPackage
│   │           │           ├───assembleForTest
│   │           │           ├───buildAnalysis
│   │           │           ├───dependencyAnalysis
│   │           │           ├───deploy
│   │           │           ├───integrationTest
│   │           │           ├───lint
│   │           │           ├───package
│   │           │           ├───performanceTest
│   │           │           ├───postDeploy
│   │           │           ├───publish
│   │           │           ├───regressionTest
│   │           │           ├───resolveArtifacts
│   │           │           ├───staticAnalysis
│   │           │           ├───unitTest
│   │           │           └───versionCalculation
│   │           ├───scripts
│   │           └───test
│   ├───src
│   │   └───org
│   │       └───jnj
│   │           ├───logging
│   │           │   └───destinations
│   │           ├───pipelines
│   │           └───test
│   │               ├───integration
│   │               │   └───pipelines
│   │               ├───mock
│   │               └───unit
│   ├───vars                            # (btp.groovy is here)
│   ├───_scm_container
│   │   ├───btp-lint
│   │   └───schema-compiler
│   └───_scm_jenkins
├───sp_dev_package
│   ├───.bitbucket
│   ├───ApiManagement
│   │   └───OAuthService_BTP_v1
│   │       └───APIProxy
│   │           ├───APIProxyEndPoint
│   │           ├───APIResource
│   │           ├───APITargetEndPoint
│   │           ├───Documentation
│   │           └───Policy
│   ├───ApiProducts
│   ├───IntegrationContent
│   │   └───SP_IF_Sandbox
│   │       ├───META-INF
│   │       └───src
│   │           └───main
│   │               └───resources
│   │                   ├───scenarioflows
│   │                   │   └───integrationflow
│   │                   └───script
│   ├───Resources
└───└───_scm_jenkins
        └───jobs







Folder PATH listing for volume Data
Volume serial number is 00000043 BEC6:0ED0
D:\WORKSPACE\CPILINT_PROJECT\CPILINT_WITH_JPM\CPILINT
├───%CPILINT_HOME%
│   └───lib
├───3rd-party-licenses
├───build
│   ├───classes
│   │   └───org
│   │       └───cpilint
│   │           ├───api
│   │           ├───artifacts
│   │           ├───auth
│   │           ├───consumers
│   │           ├───issues
│   │           ├───model
│   │           ├───rules
│   │           │   └───naming
│   │           ├───suppliers
│   │           └───util
│   └───lib
├───dist-files
│   ├───samples
│   └───xerces-runtime-jars
├───graphics
├───lib
│   ├───compile

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
-a----         5/19/2024   7:50 AM          73599 commons-cli-1.8.0.jar
-a----         1/22/2023   1:10 PM         324655 dom4j-2.1.4.jar
-a----          3/3/2024   7:16 AM          78332 json-20240303.jar
-a----         4/17/2024  10:42 AM         293697 logback-classic-1.5.6.jar
-a----         4/17/2024  10:42 AM         609942 logback-core-1.5.6.jar
-a----          7/1/2024   5:52 AM        5597291 Saxon-HE-12.5.jar
-a----         4/12/2024   7:24 AM          68605 slf4j-api-2.0.13.jar
│   └───runtime
Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
-a----         5/19/2024   7:50 AM          73599 commons-cli-1.8.0.jar
-a----         1/22/2023   1:10 PM         324655 dom4j-2.1.4.jar
-a----          3/3/2024   7:16 AM          78332 json-20240303.jar
-a----         4/17/2024  10:42 AM         293697 logback-classic-1.5.6.jar
-a----         4/17/2024  10:42 AM         609942 logback-core-1.5.6.jar
-a----          7/1/2024   5:52 AM        5597291 Saxon-HE-12.5.jar
-a----         4/12/2024   7:24 AM          68605 slf4j-api-2.0.13.jar
-a----         9/28/2023   6:05 AM         165689 xmlresolver-5.2.2.jar

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d-----         3/25/2025   2:41 PM                compile
d-----         3/25/2025   2:41 PM                runtime
-a----         5/19/2024   7:50 AM          73599 commons-cli-1.8.0.jar
-a----         3/25/2025   2:41 PM         193806 cpilint-1.0.5.jar
-a----         3/22/2025   1:49 AM           8980 cupv10k-runtime.jar
-a----         1/22/2023   1:10 PM         324655 dom4j-2.1.4.jar
-a----          3/3/2024   7:16 AM          78332 json-20240303.jar
-a----         4/17/2024  10:42 AM         293697 logback-classic-1.5.6.jar
-a----         4/17/2024  10:42 AM         609942 logback-core-1.5.6.jar
-a----         3/22/2025   1:49 AM         690199 org.eclipse.wst.xml.xpath2.processor_1.2.1.jar
-a----          7/1/2024   5:52 AM        5597291 Saxon-HE-12.5.jar
-a----         4/12/2024   7:24 AM          68605 slf4j-api-2.0.13.jar
-a----         3/22/2025   1:49 AM        1611944 xercesImpl.jar
-a----         9/28/2023   6:05 AM         165689 xmlresolver-5.2.2.jar
├───logback
├───release
├───resources
│   ├───xml-schema
│   ├───xquery
│   └───xslt
├───scripts
├───src
│   └───org
│       └───cpilint
│           ├───api
│           ├───artifacts
│           ├───auth
│           ├───consumers
│           ├───issues
│           ├───model
│           ├───rules
│           │   └───naming
│           ├───suppliers
│           └───util
└───test-iflow
    ├───META-INF
    └───src
        └───main
            └───resources
                ├───scenarioflows
                │   └───integrationflow
                └───script
