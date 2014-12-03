job {
    name 'Database script creation'
    scm {
        cloneWorkspace('First build job (compilation)')
    }
    steps {
        maven('liquibase:updateSQL -pl database')
    }
}
