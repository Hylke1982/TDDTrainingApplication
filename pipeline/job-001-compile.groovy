job {
    name 'First build job (compilation)'
    scm {
        git('https://github.com/Hylke1982/TDDTrainingApplication', 'devops-experience-workshop')
    }
    steps {
        maven('-f TDDTrainingApplicationCC/pom.xml compile')
    }
    publishers {
        publishCloneWorkspace('*/**')
        archiveArtifacts 'puppet/**', null, true
        downstream('Second build job (unit test)')
        downstream('Database script creation')
        downstream('Puppet code quality')
    }
}
