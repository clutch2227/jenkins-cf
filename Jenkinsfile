  pipeline {
    agent any
    stages {
        stage('Submit Stacks') {
            steps {
            sh "aws cloudformation create-stack --stack-name jenkins-cf --template-body file://CF_Test.yml --region 'us-east-1'"
              }
             }
            }
            }
