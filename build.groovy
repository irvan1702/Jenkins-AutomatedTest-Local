node('master'){

        stage('build artifact'){
               cd "C:/17054012/Data/List Project FES/Testing/webdriver"
               bat "mvn clean install";
        }
}
