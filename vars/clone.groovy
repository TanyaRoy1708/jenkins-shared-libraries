def call(String url,String branch,String cred){
   echo 'Cloning the Code'
   git url:url,branch:master,credentialsId:cred
   echo "Cloning success!"
}
