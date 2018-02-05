node('master'){

        stage('build artifact'){
               cmd mvn --version;
        }
}
