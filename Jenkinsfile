pipeline {
agent {
    // Equivalent to "docker build -f Dockerfile --build-arg version=1.0.2 ./
    dockerfile {
        filename 'Dockerfile'
        dir './'
        label 'my-defined-label'
        additionalBuildArgs  '--build-arg version=1.0.2'
    }
}

options {
  buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '1')
}
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
