pipeline{
agent any
stages {
  stage('Build') {
    step {
      sh 'echo "This is my first step"'
    }
  }
  stage('Test') {
    step{
      sh 'echo "This is my Test step"'
    }
  }
  stage('Deploy') {
    steps {
      sh 'echo "This is my Deploy step"'
    }
}
  }
}
