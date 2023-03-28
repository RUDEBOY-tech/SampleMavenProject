pipeline {
   agent any
   stages{
       stage('git clone'){
           steps{
               git credentialsId: '05a31444-11ef-438b-a24c-759401eaa665', url: 'https://github.com/RUDEBOY-tech/SampleMavenProject.git'
           }        
       }
       stage('build the code'){
           steps{
              sh 'mvn package'
           }
       }
       stage('archive the artifacts'){
           steps{
              archive 'target/*.jar'
           }          
       }
       stage('publish the junit reports'){
           steps{
              junit 'target/surefire-reports/*.xml'
           }
           
       }
       stage('rt server'){
           steps{
               rtServer (
                   id: 'JFROG-OSS',
                   url: 'http://18.218.93.211:8082//artifactory',
                   username: 'admin',
                   password: 'Jfrog@123',
                   bypassProxy: true,
                   timeout: 300
               )

           }
       }
       stage('rt upload'){
           steps{
               rtUpload (
                   serverId: 'JFROG-OSS',
                   spec: '''{
                         "files": [
                             {
                                 "pattern": "target/*.jar",
                                 "target": "my-second-repo/"

                             }
                                  ]
                   }''',
                        
               )

           }

       }

      }


    }
