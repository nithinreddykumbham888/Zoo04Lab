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

Open Powershell Here as Admininstrator in your root project folder (the one with pom.xml):
- Prepare test results with `mvn clean jacoco:prepare-agent install`
- Prepare coverage site with `mvn jacoco:report` 
- This builds target/site/jacoco which is then copied to the hosted repo above.

-----

## Web App

A user interface (besides the console) would be nice. 
We voted on a web front end.

```Bash
$ mvn clean package spring-boot:repackage
$ java -jar target/Zoo04Lab-1.0-SNAPSHOT
```

-----
