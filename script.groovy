def buildApp() {
  echo "building version ${NEW_VERSION}"
}

def testApp() {
    echo 'testing the aplication...'
}

def deployApp() {
    echo "deploying with ${params.VERSION}"
}

return this
