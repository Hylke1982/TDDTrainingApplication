job {
    name 'Tomcat deployment'
    customWorkspace '${HOME}/workspace/tomcat-deployment'
    label 'docker'
    steps {
        copyArtifacts('Artifact creation', '**/TDDTrainingApplicationCC.war') {
            upstreamBuild()
        }
        shell('docker run --rm -v ${WORKSPACE}/TDDTrainingApplicationCC/target:/webapps -t tomcat-container')
    }
}
