package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script

object JavaScript_Template : Template({
    uuid = "1aedc5fc-0482-4eb9-87f3-81c6202a593c"
    id = "JavaScript_Template"
    name = "JavaScript-Template"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCardsGit)

    }

    steps {
        script {
            name = "Yarn Restore Packages"
            id = "RUNNER_6"
            scriptContent = "yarn"
        }
        script {
            name = "Browser Tests"
            id = "RUNNER_7"
            scriptContent = "yarn test -- --single-run --browsers %Browser% --colors false --reporters teamcity"
        }
        stepsOrder = arrayListOf("RUNNER_6", "RUNNER_7")
    }
})
