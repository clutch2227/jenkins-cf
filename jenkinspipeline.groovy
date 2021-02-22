pipeline {
   agent any
   stages {
    stage('Checkout') {
      steps {
        script {
           // The below will clone your repo and will be checked out to master branch by default.
           git credentialsId: 'Git', url: 'https://github.com/clutch2227/jenkins.git'
           // Do a ls -lart to view all the files are cloned. It will be clonned. This is just for you to be sure about it.
           sh "ls -lart ./*" 
           // List all branches in your repo. 
           sh "git branch -a"
           // Checkout to a specific branch in your repo.
           sh "git checkout main"
          }
       }
    }
    stage('Install JMeter') {
      steps {
        script {
            sh mkdir jmeter
            sh cd jmeter
            def response = sh 'curl https://downloads.apache.org//jmeter/binaries/apache-jmeter-5.4.1.zip'
            echo '=========================Response===================' + response
           }
        }
        }
    }    
}
