pipeline {
  agent any
  stages {
    stage('parent') {
        parallel {
            stage('single-stage') {
              steps {
                sh 'echo \'dummy text\''
              }
            }
            
            stage('multiple-stages') {
                stages {
                    stage('first-sequential-stage') {
                      steps {
                        sh 'echo \'dummy text\''
                      }
                    }
                    stage('second-sequential-stage') {
                      steps {
                        sh 'echo \'dummy text\''
                      }
                    }
                    stage('third-sequential-stage') {
                      steps {
                        sh 'echo \'dummy text\''
                      }
                    }
                }
            }

            stage('other-single-stage') {
              steps {
                sh 'echo \'dummy text\''
              }
            }
        }
    }
    stage('first-solo') {
      steps {
        sh 'echo \'dummy text\''
      }
    }
  }
}
