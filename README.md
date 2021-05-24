SE754

Demo SpringBoot + JSP + Cucumber + Selenium

Requires Gradle 7.0


at `gradle/wrapper/gradle-wrapper.properties`
you should have
`distributionUrl=https\://services.gradle.org/distributions/gradle-7.0-all.zip`

Make sure you have the right driver for your browser under webdrivers fodler

to run the web application
`./gradlew bootRun`
then go to http://localhost:8080/login
username: test password:password

to run the cucumber tests
` ./gradlew cucumber`
