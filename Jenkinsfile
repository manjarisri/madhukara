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
        stage('Test stage') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy stage') {
            steps{
            script {
          deploy adapters: [tomcat9(credentialsId: "manager", path: '', url: "http://3.109.144.34:8097/")], contextPath: null, onFailure: false, war: '**/*.war' 
        }
                }
        }
    }
    post{
      success{
         mail to: "manjari.srivastav@knoldus.com",
         subject: "successful Build!",
         body: "success"
      }
      failure{
         mail to: "manjari.srivastav@knoldus.com",
         subject: "Build failed!",
         body: "your build failed"
      }
      }
}

