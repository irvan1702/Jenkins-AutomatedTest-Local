node('master'){

    stages{
        stage('build artifact'){
            step{
                sh 'mvn --version';
            }
        }
    }
}
