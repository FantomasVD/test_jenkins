pipeline {
  agent any
  parameters {
    choice( name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'Make your choice')
    booleanParam(name: 'executeTest', defaultValue: true, description:'')
  }
  environment {
    NEW_VERSION = '1.3.0'
    SERVER_CREDENTIALS = credentials('server-credentials')
  }
  stages {
    stage("Build") {
      steps {
        echo 'building the aplication...'
        echo "building version ${NEW_VERSION}"
      }
    }
    stage("Test") {
      when {
        expression {
          params.executeTest
        }
      }
      steps {
        echo 'testing the aplication...'
      }
    }
    stage("Deploy") {
      steps {
        echo 'deploy the aplication...'
        echo "deploying with ${SERVER_CREDENTIALS}"
        sh "${SERVER_CREDENTIALS}"
        echo "deploying with ${params.VERSION}"

      }
    }
  }
}
