def build(){
   echo "Building the code"
   sh "docker build -t myimage1:latest ."
}
