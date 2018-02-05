node('master'){

        stage('build artifact'){
                sh "mvn --version";
        }
}
