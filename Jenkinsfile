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
           stage("Take Parameters") {
            steps {
                input message: "Enter parameter", parameters: [
                    string(name: "number", defaultValue: '3', description: "enter the number")
                ]
            }
        }
         stage("executing"){
           steps{
            echo "number:${params.number}"
               echo "-Dnumber=${params.number}"
           
         }
        }
        stage("build"){
                 steps{
                  sh "java prime"
                 }
             }
    }
}
