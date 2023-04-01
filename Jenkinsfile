pipeline {
    agent any
  tools{
    maven "3.6.3"
  }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    stages {
        stage('BTest') {
            steps {
                sh 'mvn test'
            }
        }
        }
     post{
      success{
         mail to: "manjarisrivastav04@gmail.com"
         subject: "successful Build!"
         body: "success"
      }
      failure{
         mail to: "manjarisrivastav04@gmail.com"
         subject: "Build failed!!"
         body: "your build failed"
      }
      }
    }

