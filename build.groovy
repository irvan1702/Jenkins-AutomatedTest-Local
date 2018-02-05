node('master'){

        stage('build artifact'){
               bat "mvn clean install";
        }
}
