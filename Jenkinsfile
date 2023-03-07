pipeline{
    agent any
    parameters{
        gitParameter branchFilter: 'origin/(.*)', defaultValue: 'master', name: 'BRANCH', type: 'PT_BRANCH'
    }
        stages{
            stage('git clone'){
                steps{
                    git branch: "${params.BRANCH}", url: 'https://github.com/RUDEBOY-tech/SampleMavenProject.git'

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
