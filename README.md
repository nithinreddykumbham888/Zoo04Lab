# Zoo04Lab

> Welcome to our Zoo! 

[![Known Vulnerabilities](https://snyk.io/test/github/denisecase/Zoo04Lab/badge.svg)](https://snyk.io/test/github/denisecase/Zoo04Lab)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/62545caa0c744a12a7f3995641b73766)](https://www.codacy.com/gh/denisecase/Zoo04Lab/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=denisecase/Zoo04Lab&amp;utm_campaign=Badge_Grade)

## Check Code with Static Analysis Tools

- Snyk monitors our code for vulnerabilities in the packages we include.
- Codacy checks our code for common 'code smells' and recommends improvements.
- Click the badges to learn more. 

## API

- Explore API at <https://denisecase.github.io/Zoo04Lab/edu/nwmissouri/zoo04lab/package-summary.html>
- Generate API with `mvn javadoc:javadoc`

## Test Coverage

- Explore test coverage at https://denisecase.github.io/Zoo04Lab-Coverage/

Test coverage report is hosted from a separate repo. 

- Create a new test reporting repo in the cloud. Settings / GitHub Pages / set to publish. 
- Clone this reporting repo down to your machine. 
- Generate the report from this project repo on your machine using the commands below. 
- Manually copy all files in the project target/site/jacoco folder into the root directory of this new reporting repo. 
- Git add & commit, then git push the files up to the cloud reporting repo. 

Regenerate results periodically.

Open Powershell Here as Admininstrator in your root project folder (the one with pom.xml):
- Prepare test results with `mvn clean jacoco:prepare-agent install`
- Prepare coverage site with `mvn jacoco:report` 
- This builds target/site/jacoco which is then copied to the hosted repo above.

-----

## Compile & Run with Java 17

Netbeans

- Open project in Netbeans.
- Right-click project / Properties / Build / Compile / JDK Version / select JDK 17.
- Right-click project / Clean and build 
- Right-click project / Run

Powershell

```Powershell
java -version
mvn clean package spring-boot:repackage
java -jar target/Zoo04Lab-1.0-SNAPSHOT
```

-----

## Prepare the App for Heroku

- Add Procfile
- Add system.properties
- Configure pom.xml

## Deploy with Heroku

- Heroku / New / Create new app - give it a name.
- Click on app / Settings / Buildpacks / Add Buildpack / Java 
- Click on app / Settings / Deploy / GitHub / select repo / enable automatic deploys from main
- Click on app / Settings / Deploy / Deploy branch (main) to deploy
- Click on app / Settings / Overview / click on build logs to see progress, view errors

-----

## References

1. [Heroku - Customizing the JDK](https://devcenter.heroku.com/articles/customizing-the-jdk)

