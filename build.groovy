node('master'){

        stage('build artifact'){
               bat "mvn --version";
        }
}
