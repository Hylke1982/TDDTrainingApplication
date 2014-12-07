job {
    name 'Artifact creation'
    scm {
        cloneWorkspace('First build job (compilation)')
    }
    steps {
        maven('-pl TDDTrainingApplicationCC clean package')
    }
    publishers {
        downstream('Tomcat deployment')
        archiveArtifacts '**/TDDTrainingApplicationCC.war', null, true
    }
}
