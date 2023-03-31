pipeline{
  agent any
  stages{
    stage("accessing git repo"){
      steps{
     git branch: 'main', url: "https://github.com:manjarisri/madhukara.git"
    }
    }
    stage("compiling"){
      steps{
      sh "javac prime.java"
    }
    }
    stage("executing"){
      steps{
      sh "java prime"
    }
    }
  }
}
