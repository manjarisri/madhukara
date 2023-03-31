pipeline{
  agent any
  stages{
    stage("accessing git repo"){
     git branch: 'main', url: "https://github.com:manjarisri/madhukara.git"
    }
    stage("compiling"){
      sh "javac prime.java"
    }
    stage("executing"){
      sh "java prime"
    }
  }
}
