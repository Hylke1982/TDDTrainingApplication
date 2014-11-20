view(type: BuildPipelineView) {
    name('Pipeline')
    description('Continuous delivery build pipeline view')
    filterBuildQueue()
    filterExecutors()
    title('Continuous delivery build pipeline view')
    selectedJob('First build job (compilation)')
    alwaysAllowManualTrigger()
    showPipelineParameters()
    refreshFrequency(60)
}
