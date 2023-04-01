pipeline {
    agent any
  tools{
    maven "3.6.3"
    }
    stages {
        stage('Build1') {
            steps {
                sh 'mvn clean package'
                }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        }
    }
    

