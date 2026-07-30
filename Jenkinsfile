pipeline {

    agent any


    tools {

        maven 'Maven3'

        jdk 'JDK20'

    }


    stages {


        stage('Checkout') {

            steps {

                git branch: 'main',
                url: 'https://github.com/sharanyaraju/Selenium-Cucumber-Automation-Framework.git'

            }
        }



        stage('Build') {

            steps {

                bat 'mvn clean test'

            }

        }


    }


    post {

        always {

            echo 'Execution Completed'

        }

    }

}