node('master'){

        stage('build artifact'){
               call "mvn --version";
        }
}
