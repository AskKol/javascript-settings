package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object JavaScript_03DeployToStaging : BuildType({
    uuid = "5dd6199d-06a1-47c4-83b4-51c27c33d9d0"
    id = "JavaScript_03DeployToStaging"
    name = "03. Deploy To Staging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCardsGit)

    }

    steps {
        script {
            name = "IIS Deploy"
            scriptContent = """(ROBOCOPY .\app C:\inetpub\wwwroot\javascriptcards\ *.* /E /MIR /XD)^& IF %%ERRORLEVEL%% LSS 8 SET errorlevel=0"""
        }
    }

    triggers {
        vcs {
            branchFilter = ""
        }
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_02Chrome) {
            snapshot {
            }
        }
        dependency(JavaScript.buildTypes.JavaScript_02Firefox) {
            snapshot {
            }
        }
    }
})
