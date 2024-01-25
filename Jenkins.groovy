pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'this is checkout stage'
            }
        }

        stage('Build') {
            steps {
              echo 'this is build stage'
            }
        }

        stage('Test') {
            steps {
              echo 'this is test stage'
            }
        }

        stage('Deploy') {
            steps {
              echo 'this is deploy stage'
            }
        }
    }

    post {
        success {
            
            echo 'Pipeline succeeded!'
        }

        failure {
          
            echo 'Pipeline failed!'
        }

        always {
          
            echo 'Pipeline completed.'
        }
    }
}
