job {
    name 'First build job (compilation)'
    scm {
        git('https://github.com/Hylke1982/TDDTrainingApplication', 'devops-experience-workshop-abz')
    }
    steps {
        maven('-f TDDTrainingApplicationCC/pom.xml compile')
    }
    publishers {
        publishCloneWorkspace('*/**')
        archiveArtifacts 'puppet/**', null, true
        archiveArtifacts 'javascript/**', null, true
        downstream('Second build job (unit test)')
        downstream('Database script creation')
//        downstream('Puppet code quality')
//        downstream('JavaScript unit test')
    }
}
