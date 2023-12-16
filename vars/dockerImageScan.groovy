def call(String image_name, String image_tag)
{   
       sh """
        trivy image ${image_name}:${image_tag} ${image_name}:latest > scan.txt
        cat scan.txt
       """
}    