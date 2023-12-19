//def call(String image_name, String image_tag)
//{   
//       sh """
//        docker image build -t ${image_name} .
//        docker image tag ${image_name} ${image_name}:${image_tag}
//       """
//}


def call(String awsaccid, String region, String reponame)
{
       sh """
              docker build -t ${reponame} .
              docker tag ${reponame}:latest ${awsaccid}.dkr.ecr.${region}.amazonaws.com/${reponame}:latest
       """
}    