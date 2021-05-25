pipeline{
agent any
stages {
  stage('Build') {
    steps{
      echo 'This is my first step'
    }
  }
  stage('Test') {
    steps{
      echo 'This is my Test step'
    }
  }
  stage('Deploy') {
    steps {
      echo 'This is my Deploy step'
      echo 'This is first attempt'
      echo 'This is second attempt'
      echo 'This is third attempt'
    }
}
  }
}
