/*def call(image_name, image_tag)
{
    sh """
        echo "#######Pusing Docker Image##########"
        docker push ${image_name}:${image_tag}
        docker push ${image_name}:latest
        
        echo "#######Clearing Docker Image Post image push ##########"
        docker image rm ${image_name}:${image_tag}
        docker image rm ${image_name}:latest
        aws ecr get-login-password --region ${region} | docker login --username Surya --password-stdin ${awsaccid}.dkr.ecr.${region}.amazonaws.com
    """
}*/

def call(String awsaccid, String region, String reponame)
{
       sh """
              aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${awsaccid}.dkr.ecr.${region}.amazonaws.com
              docker push ${awsaccid}.dkr.ecr.${region}.amazonaws.com/${reponame}:latest
              
       """
}    