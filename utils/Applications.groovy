package com.dsl.utils

enum Applications {

    AIP_MICRO_SERVICES(1,'aip-micro-services'),
    AIP_MYSTIC_PONY(1,'mystic_pomy'),
    AIP_SHARED_SERVICES(1,'aip-shared-services'),
    MF_MICRO_SERVICES(2,'mf-micro-services'),
    MF_MCM(2,'mcm-needs-and-circs')


    final int projectId
    final  String applicationName
    static def applicationList = [:]

    Applications(int projectId, String applicationName) {
        this.projectId = projectId
        this.applicationName = applicationName
    }

    static def getApplicationList(int projectId){
        applicationList = []
        Applications.values().each {
            if(projectId == it.projectId){
                applicationList.add(it.applicationName)
            }
        }
        return applicationList
    }
}