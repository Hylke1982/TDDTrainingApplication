job {
    name 'Puppet code quality'
    customWorkspace '${HOME}/workspace/puppet-code-quality'
    label 'docker'
    steps {
        copyArtifacts('First build job (compilation)', 'puppet/**'){
            upstreamBuild()
        }
        shell('docker run --rm -v /home/jenkins-slave/workspace/puppet-code-quality/puppet:/puppet -t puppet-test')
    }
}
