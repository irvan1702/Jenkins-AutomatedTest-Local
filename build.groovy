node('master'){

        stage('build artifact'){
               mvn "--version";
        }
}
