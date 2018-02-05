node('master'){

        stage('build artifact'){
               echo "mvn --version";
        }
}
