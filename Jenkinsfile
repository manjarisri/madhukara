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
    }
    }

