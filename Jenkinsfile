pipeline{
    agent any
    stages{
       stage('GetCode'){
            steps{
                git credentialsId: '05a31444-11ef-438b-a24c-759401eaa665', url: 'https://github.com/RUDEBOY-tech/SampleMavenProject.git'
            }
         }        
       stage('Build'){
            steps{
                sh 'mvn clean package'
            }
         }
        stage('SonarQube analysis') {
//    def scannerHome = tool 'SonarScanner 4.0';
        steps{
        withSonarQubeEnv('sonarqube-8.9.2') { 
        // If you have configured more than one global server connection, you can specify its name
//      sh "${scannerHome}/bin/sonar-scanner"
        sh "mvn sonar:sonar"
    }
        }
        }
       
    }
}
