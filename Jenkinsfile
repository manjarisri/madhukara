// pipeline{
//   agent any
//   stages{
//     
//    
//   }
// }


pipeline {
    agent any
    stages {
        stage("Take Parameters") {
            stage("accessing git repo"){
      steps{
     git branch: 'main', url: "https://github.com/manjarisri/madhukara"
    }
    }
    stage("compiling"){
      steps{
      sh "javac prime.java"
    }
    }
            steps {
                input message: "Enter parameter", parameters: [
                    string(name: "number", defaultValue: '3', description: "enter the number")
                ]
            }
        }
         stage("executing"){
      steps{
      sh "java prime"
    }
    }
    }
}
