job {
    name 'Integration tests'
    blockOn('Second build job (unit test)', 'JavaScript unit test')
    blockOnUpstreamProjects()
    scm {
        cloneWorkspace('First build job (compilation)')
    }
    steps {
        maven('-f TDDTrainingApplicationCC/pom.xml test -Pintegration')
    }
    publishers {
        archiveJunit('**/target/surefire-reports/*.xml')
    }
}
