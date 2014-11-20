job {
    name 'First build job (Compile)'
    scm {
        git('https://github.com/Hylke1982/TDDTrainingApplication', 'devops-experience-workshop')
    }
    steps {
        maven('-f TDDTrainingApplicationCC/pom.xml compile')
    }
}
