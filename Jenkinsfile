pipeline {
    agent any
    tools{
        maven "3.6.3"
    }
    stages {
        stage('Build stage') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test stage') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy stage') {
            steps{
            script {
          deploy adapters: [tomcat9(credentialsId: "manager", path: '', url: "http://43.205.239.106:8097/")], contextPath: null, onFailure: false, war: '**/*.war' 
        }
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

