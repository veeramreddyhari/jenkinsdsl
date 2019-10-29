

println Projects.values().each {
    println "$it"
    Applications.getApplicationList(it.projectId).each {
        println "$it"
    }

}
