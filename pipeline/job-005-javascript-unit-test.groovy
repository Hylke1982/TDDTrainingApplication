job {
    name 'JavaScript unit test'
    customWorkspace '${HOME}/workspace/javascript-unit-test'
    label 'docker'
    steps {
        copyArtifacts('First build job (compilation)', 'javascript/**'){
            upstreamBuild()
        }
        shell('docker run --rm -v ${WORKSPACE}/javascript:/javascript -t javascript-nodejs-test jasmine-node --verbose --junitreport --noColor spec')
    }
}
