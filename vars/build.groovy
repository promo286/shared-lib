def call() {
    stage('Build') {
        steps {
            sh 'mvn package'
          
        }
    }
}
