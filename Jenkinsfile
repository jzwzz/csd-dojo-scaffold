node {
   def gradleHome
   stage('Preparation') {
      git branch: 'begin', url: 'https://github.com/jzwzz/csd-dojo-scaffold'
      gradleHome = tool 'gradle'
   }

    stage('build') {
      withEnv(["GRADLE_HOME=$gradleHome"]) {
        sh '"$GRADLE_HOME/bin/gradle" clean build'
      }
    }
}