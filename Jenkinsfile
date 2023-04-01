pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                sh 'cp target/myapp.war /opt/tomcat/webapps/'
            }
        }
    }
}
