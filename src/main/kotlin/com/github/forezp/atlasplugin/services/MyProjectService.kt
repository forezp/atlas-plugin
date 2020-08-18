package com.github.forezp.atlasplugin.services

import com.intellij.openapi.project.Project
import com.github.forezp.atlasplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
