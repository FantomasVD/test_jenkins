def buildJar() {
  echo "building the applications ..."
  sh 'mvn package'
}

def buildImage() {
  echo "building the docker image ..."
}

def deployApp() {
  echo "deploying application... "
}

return this
