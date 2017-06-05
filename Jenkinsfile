pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean source:jar package'
        input 'This is a very long message to simulate a very long message.'
      }
    }
    stage('Browser Tests') {
      steps {
        parallel(
          "Firefox": {
            sh 'echo \'setting up selenium environment\''
            sh 'ping -c 5 localhost'
            
          },
          "Safari": {
            sh 'echo \'setting up selenium environment\''
            sh 'ping -c 8 localhost'
            
          },
          "Chrome": {
            sh 'echo \'setting up selenium environment\''
            sh 'ping -c 3 localhost'
            
          },
          "Internet Explorer": {
            sh 'echo \'setting up selenium environment\''
            sh 'ping -c 4 localhost'
            
          }
        )
      }
    }
    stage('Static Analysis') {
      steps {
        sh 'mvn findbugs:findbugs'
      }
    }
    stage('Deploy') {
      steps {
        parallel(
          "Deploy": {
            sh 'mvn source:jar package -Dmaven.test.skip'
            
          },
          "final": {
            echo 'fdsf223'
            
          }
        )
      }
    }
  }
  post {
    always {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive '**/target/*.jar'
      
    }
    
  }
}