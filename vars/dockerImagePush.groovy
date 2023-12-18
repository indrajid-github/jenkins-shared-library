def call(image_name, image_tag)
{
    sh """
        echo "#######Pusing Docker Image##########"
        docker push ${image_name}:${image_tag}
        docker push ${image_name}:latest
        
        echo "#######Clearing Docker Image Post image push ##########"
        docker image rm ${image_name}:${image_tag}
        docker image rm ${image_name}:latest
    """
}