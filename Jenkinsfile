pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    stage('Deploy to Tomcat') {
            steps {
                sh 'cp target/myapp.war /path/to/tomcat/webapps/'
                sh '/path/to/tomcat/bin/shutdown.sh'
                sh '/path/to/tomcat/bin/startup.sh'
            }
        }
    }
}
