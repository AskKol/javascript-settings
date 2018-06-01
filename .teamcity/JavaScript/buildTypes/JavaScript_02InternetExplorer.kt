package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_02InternetExplorer : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "9e10fdf6-ccd0-4260-8882-1dad18ea99be"
    id = "JavaScript_02InternetExplorer"
    name = "02. Edge"

    params {
        param("Browser", "Edge")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTest) {
            snapshot {
            }
        }
    }
})
