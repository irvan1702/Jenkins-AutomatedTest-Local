node('master'){

        stage('download source code'){
                git clone https://$USERNAME:$PASSWORD@github.com/irvan1702/Jenkins-AutomatedTest-Local.git
        }
        
        stage('build artifact'){
               bat "mvn clean install";
        }
}
