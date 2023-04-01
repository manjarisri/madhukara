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
          deploy adapters: tomcat9, credentialsId: "manager", url: "http://13.233.61.62:8097/", contextPath: null, onFailure: false, war: '**/*.war' 
        }
                }
        }
    }
}

