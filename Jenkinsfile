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



        stage('Test Execution') {

            steps {

                bat 'mvn clean test'

            }

        }


    }


    post {

        always {

            publishHTML(
                target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target/SparkReport',
                    reportFiles: 'spark.html',
                    reportName: 'Automation Report'
                ]
            )

        }

    }

}