job {
    name 'Database script creation'
    scm {
        cloneWorkspace('First build job (compilation)')
    }
    steps {
        maven('liquibase:updateSQL -pl database')
    }
    publishers{
        archiveArtifacts '**/*/migrate.sql', null, true
    }
}
