job {
    name 'First build job (compilation)'
    scm {
        git('https://github.com/Hylke1982/TDDTrainingApplication', 'devops-experience-workshop')
    }
    steps {
        maven('-f TDDTrainingApplicationCC/pom.xml compile')
    }
}
