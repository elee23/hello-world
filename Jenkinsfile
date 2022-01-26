pipeline {
 agent any

  stages {
    stage('Build') {
      steps {
        bat 'echo "Building..."'
        bat 'mvn package'
      }
    }
   stage('Test') {
      steps {
        bat 'echo "Testing..."'
        bat 'mvn verify'
      }
    }
   stage('Deploy') {
      steps {
        bat 'echo "Deploying..."'
        bat 'mvn clean deploy site-deploy'
      }
    }
  }
}
