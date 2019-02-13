pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean source:jar package'
      }
    }
    stage('Some Tests') {
      steps {
        sh 'echo \'testing some things\''
        sh 'ping -c 5 localhost'
      }
    }
    stage('Browser Tests') {
      parallel {
        stage('Firefox') {
          steps {
            sh 'echo \'setting up selenium environment\''
            sh 'ping -c 5 localhost'
          }
        }
        stage('Safari') {
          steps {
            sh 'echo \'setting up selenium environment\''
            sh 'ping -c 8 localhost'
          }
        }
        stage('Chrome') {
          steps {
            sh 'echo \'setting up selenium environment\''
            sh 'ping -c 3 localhost'
          }
        }
        stage('Internet Explorer') {
          steps {
            sh 'echo \'setting up selenium environment\''
            sh 'ping -c 4 localhost'
          }
        }
      }
    }
    stage('Testings Some Other Things') {
      steps {
        sh 'echo \'testing some things\''
        sh 'ping -c 5 localhost'
      }
    }
    stage('Static Analysis') {
      steps {
        sh 'mvn findbugs:findbugs'
      }
    }
    stage('Deploy') {
      parallel {
        stage('Deploy') {
          steps {
            sh 'mvn source:jar package -Dmaven.test.skip'
          }
        }
        stage('final') {
          steps {
            echo 'fdsf223'
          }
        }
      }
    }
  }
  post {
    always {
      junit(testResults: '**/target/surefire-reports/TEST-*.xml', allowEmptyResults: true)
      archive '**/target/*.jar'
    }
  }
}
