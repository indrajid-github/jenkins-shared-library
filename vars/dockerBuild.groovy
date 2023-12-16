def call(String image_name, String image_tag)
{   
       sh """
        docker image build -t ${image_name} .
        docker image tag ${image_name}:${image_tag}
        docker image tag ${image_name}:latest
       """
}    