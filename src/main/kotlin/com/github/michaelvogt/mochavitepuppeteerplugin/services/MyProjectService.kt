package com.github.michaelvogt.mochavitepuppeteerplugin.services

import com.intellij.openapi.project.Project
import com.github.michaelvogt.mochavitepuppeteerplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
