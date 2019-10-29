
enum Projects {

    AIP(1,'AIP'),
    MF(2,'MF')

    final int projectId
    final String desc

    Projects(int projectId, String desc) {
        this.projectId = projectId
        this.desc = desc
    }
}