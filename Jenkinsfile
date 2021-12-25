def gv

pipeline {
  agent any
  tools {
    maven "Maven"
  }
  stages {
    stage('init') {
      steps {
        script {
          gv = load "script2.groovy"
        }
      }
    }

    stage('build jar') {
      steps {
        script {
          gv.buildJar()
        }
      }
    }

    stage('build image') {
      steps {
        script {
          gv.buildImage()
        }
      }
    }


    stage('deploy') {
      steps {
        script {
          gv.deployApp()
        }
      }
    }
  }
}
