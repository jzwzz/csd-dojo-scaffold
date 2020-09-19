node {
   def gradleHome
   stage('Preparation') {
      git branch: 'begin', url: 'https://github.com/jzwzz/csd-dojo-scaffold'
      gradleHome = tool 'gradle'
   }

   stage('Test') {
      withEnv(["GRADLE_HOME=$gradleHome"]) {
        sh '"$GRADLE_HOME/bin/gradle" clean test'
      }
   }
     stage('Build') {
      withEnv(["GRADLE_HOME=$gradleHome"]) {
        sh '"$GRADLE_HOME/bin/gradle" clean build'
      }
    }
}