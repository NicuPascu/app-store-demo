pipeline {
  agent any
  stages {
    stage('first-solo') {
      steps {
        sh 'echo \'dummy text\''
        sh 'ping -c 30 localhost'
      }
    }
    stage('parent') {
        parallel {
            stage('single-stage') {
              steps {
                sh 'echo \'dummy text\''
                sh 'ping -c 30 localhost'
              }
            }
            
            stage('multiple-stages') {
                stages {
                    stage('first-sequential-stage') {
                      steps {
                        sh 'echo \'dummy text\''
                        sh 'ping -c 30 localhost'
                      }
                    }
                    stage('second-sequential-stage') {
                      steps {
                        sh 'echo \'dummy text\''
                        sh 'ping -c 30 localhost'
                      }
                    }
                    stage('third-sequential-stage') {
                      steps {
                        sh 'echo \'dummy text\''
                        sh 'ping -c 30 localhost'
                      }
                    }
                }
            }

            stage('other-single-stage') {
              steps {
                sh 'echo \'dummy text\''
                sh 'ping -c 30 localhost'
              }
            }
        }
    }
    stage('second-solo') {
      steps {
        sh 'echo \'dummy text\''
        sh 'ping -c 30 localhost'
      }
    }
  }
}
