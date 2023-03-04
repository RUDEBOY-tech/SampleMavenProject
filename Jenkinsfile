pipeline{
    agent any
    triggers{
        upStream(upStreamProjects: 'SMP_pipelinejob', threshold: husdon.model.Result.SUCCESS)
    }
        stages{
            stage('git clone'){
                steps{
                    git credentialsId: '05a31444-11ef-438b-a24c-759401eaa665', url: 'https://github.com/RUDEBOY-tech/SampleMavenProject.git'

                }
            }
            stage('build with maven'){
                steps{
                    sh 'mvn package'

                }
            }
            stage('archive artifacts'){
                steps{
                    archive 'target/*.jar'

                }
            }
            stage('publish junit test reports'){
                steps{
                    junit 'target/surefire-reports/*.xml'

                
            }
        }
    }
}
