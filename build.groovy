node('master'){

        stage('download source code'){
            def dirExists = fileExists 'Jenkins-AutomatedTest-Local';
                bat "cd"                      
                if (dirExists) {
                    bat "rmdir /s /q '.\Jenkins-AutomatedTest-Local\'" ;
                }
            
            withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'GIT_CRED', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD']]){
               bat "git clone https://$USERNAME:$PASSWORD@github.com/irvan1702/Jenkins-AutomatedTest-Local.git"
            }
        }
        
        stage('build artifact'){
               bat "mvn clean install";
        }
}
