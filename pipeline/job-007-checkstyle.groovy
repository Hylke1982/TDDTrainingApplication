job {
    name 'Checkstyle validation'
    scm {
        cloneWorkspace('First build job (compilation)')
    }
    steps {
        maven('-pl TDDTrainingApplicationCC checkstyle:checkstyle')
    }
    publishers {
        checkstyle('**/checkstyle-result.xml') {
            shouldDetectModules true
        }
    }
}
