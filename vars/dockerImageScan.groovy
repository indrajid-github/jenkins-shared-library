def call(String image_name, String image_tag)
{   
       sh """
        trivy image ${image_name}:${image_tag} > scan.txt
        cat scan.txt
       """
}    