def call(Map stageParams)
{
    checkout scmGit(branches: [[name: stageParams.branch]], extensions: [], 
    userRemoteConfigs: [[url: stageParams.url]])
}
