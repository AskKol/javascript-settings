package JavaScript.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object JavaScript_HttpsGithubComG0t4teamcityCourseCardsGit : GitVcsRoot({
    uuid = "e3410fd4-7167-404d-b41f-9b71a7a78085"
    id = "JavaScript_HttpsGithubComG0t4teamcityCourseCardsGit"
    name = "https://github.com/AskKol/teamcity-course-cards.git"
    url = "https://github.com/AskKol/teamcity-course-cards.git"
    authMethod = password {
        userName = "Askkol"
        password = "credentialsJSON:e534b11e-d6db-4b89-922a-0fd371f3a6d1"
    }
})
