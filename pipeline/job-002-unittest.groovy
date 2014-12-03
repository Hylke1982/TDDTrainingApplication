job {
    name 'Second build job (unit test)'
    scm {
        cloneWorkspace('First build job (compilation)')
    }
    steps {
        maven('-f TDDTrainingApplicationCC/pom.xml test')
    }
}
