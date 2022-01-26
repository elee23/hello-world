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
        bat 'mvn clean verify sonar:sonar "-Dsonar.projectKey=example-project" "-Dsonar.host.url=http://localhost:9000" "-Dsonar.login=2edf7babaf7f1b9ca499c4055d4ddaaf1e089ca2"'
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
