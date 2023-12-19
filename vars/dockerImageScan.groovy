/*def call(String image_name, String image_tag)
{   
       sh """
        trivy image ${image_name}:${image_tag} > scan.txt
        cat scan.txt
       """
}*/

def call(String awsaccid, String region, String reponame)
{
       sh """
              trivy image ${awsaccid}.dkr.ecr.${region}.amazonaws.com/${reponame}:latest > scan.txt
              cat scan.txt
       """
}    