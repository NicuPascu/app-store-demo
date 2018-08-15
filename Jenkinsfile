pipeline {
  agent any
  stages {
    stage('Continuous') {
      parallel {
        stage('Windows') {
          stages
          {
            stage('Build')
            {
              steps {
                sh 'echo \'dummy text\''
              }
            }
            stage('Test')
            {
              steps {
                sh 'echo \'dummy text\''          
              }
              post {
                always {
                  sh 'echo \'dummy text\''
                }
              }
            }
          }
        }
        stage('Linux') {
          stages
          {
            stage('Build')
            {
              steps {
                sh 'echo \'dummy text\''
              }
            }
            stage('Test')
            {          
              steps {
                sh 'echo \'dummy text\''
              }
              post {
                always {
                  sh 'echo \'dummy text\''
                }
              }             
            }
            stage('Coverage')
            {
              steps {
                sh 'echo \'dummy text\''
              }
              post {
                always {
                  sh 'echo \'dummy text\''
                }
              }
            }
          }
        }
        stage('MemCheck') {
          stages
          {
            stage('Build')
            {
              steps {
                sh 'echo \'dummy text\''
              }
            }
            stage('Memcheck')
            {          
              steps {
                sh 'echo \'dummy text\''
              }
              post {
                success {
                  sh 'echo \'dummy text\''
                }
              }             
            }
          }
        }
        stage('Android') {
          stages
          {
            stage('Build')
            {
              steps {
                sh 'echo \'dummy text\''
              }
            }
          }
        }
        stage('iOS') {
          stages
          {
            stage('Build')
            {
              steps {
                sh 'echo \'dummy text\''
              }
            }           
          }
        }
      }
    }  
  }
}
