def gv

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
    stage("Init") {
      steps {
        script {
          gv = load "script.groovy"
        }
      }
    }

    stage("Build") {
      steps {
        script {
          gv.buildApp()
        }
      }
    }

    stage("Test") {
      when {
        expression {
          params.executeTest
        }
      }
      steps {
        script {
          gv.testApp()
        }
      }
    }

    stage("Deploy") {
      steps {
        script {
          gv.deployApp()
        }
      }
    }
  }
}
