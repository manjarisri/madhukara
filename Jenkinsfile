// pipeline{
//   agent any
//   stages{
//     stage("accessing git repo"){
//       steps{
//      git branch: 'main', url: "https://github.com/manjarisri/madhukara"
//     }
//     }
//     stage("compiling"){
//       steps{
//       sh "javac prime.java"
//     }
//     }
//     stage("executing"){
//       steps{
//       sh "java prime"
//     }
//     }
//   }
// }


pipeline {
    agent any
    stages {
        stage("Take Parameters") {
            steps {
                input message: "Enter parameters", parameters: [
                    string(name: "PARAMETER_1", defaultValue: 'a', description: "enter the first parameter"),
                    string(name: "PARAMETER_2", defaultValue: 'b', description: "Enter the second parameter"),
                    choice(name: "CHOICE_PARAMETER", choices: ["option1", "option2"], description: "Choose an option")
                ]
            }
        }
        stage("Build") {
            steps {
                echo "Parameter 1: ${params.PARAMETER_1}"
                echo "Parameter 2: ${params.PARAMETER_2}"
                echo "Choice parameter: ${params.CHOICE_PARAMETER}"
            }
        }
    }
}
