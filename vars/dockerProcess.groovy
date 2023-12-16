def call(String DOCKER_CRED, String IMAGE_NAME, String IMAGE_TAG)
{
    withDockerRegistry(credentialsId: DOCKER_CRED) 
    {
        docker_image = docker.build("${IMAGE_NAME}")
    }
    withDockerRegistry(credentialsId: DOCKER_CRED) 
    {
        docker_image.push("${IMAGE_TAG}")
        docker_image.push 'latest'
    }
}    