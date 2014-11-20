job {
    name 'Puppet code quality'
    label 'docker'
    scm {
        git('https://github.com/Hylke1982/TDDTrainingApplication', 'devops-experience-workshop')
    }
    steps {
        shell('cd puppet')
        shell('docker run puppet-test bundle install')
        shell('docker run puppet-test bundle exec rake lint')
    }
}
