def buildJar() {
  echo "building the applications ..."
  sh 'mvn package'
}

def buildImage() {
  echo "building the docker image ..."
  withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
    sh 'docker build -t svizist104/my-repo:jma-2.0 .'
    sh "echo $PASS | docker login -u $USER --password-stdin"
    sh 'docker push svizist104/my-repo:jma-2.0'
  }
}

def deployApp() {
  echo "deploying application... "
}

return this
