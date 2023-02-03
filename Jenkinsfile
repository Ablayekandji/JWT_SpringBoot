pipeline{
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage("SCM Checkout"){
            steps{
            git branch: 'main', url: 'https://github.com/Ablayekandji/RESTAPI_springboot.git'
            }
        }
        stage('Build'){
            steps {
            bat 'mvn clean package'
            }
        }    
     }
   
}
