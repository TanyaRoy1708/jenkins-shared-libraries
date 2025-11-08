def publish(String Project,String tag, String usernm){
   withCredentials([usernamePassword(
                    credentialsId:"dockerCred",
                    passwordVariable:"password",
                    usernameVariable:"user" )])
                {
                    sh "docker login -u ${usernm} -p ${password}"
                    sh "docker image tag  myimage1:latest ${env.user}/myimage1:latest"
                }
   sh "docker push ${usernm}/${Project}:${tag}"
}
