job {
    name 'Database script creation'
    scm {
        git('https://github.com/Hylke1982/TDDTrainingApplication', 'devops-experience-workshop')
    }
    steps {
        maven('liquibase:updateSQL -pl database')
    }
}
