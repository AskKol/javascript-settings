package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_01FastTest : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "db46a0b2-459d-43f6-b6c9-bc8ad4181eb0"
    id = "JavaScript_01FastTest"
    name = "01.FastTest"

    params {
        param("Browser", "PhantomJS")
    }
})
