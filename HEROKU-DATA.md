# Heroku Data

## Prerequisites

Spring Boot web app deployed with Heroku. 

## Heroku - Add Resource

- Heroku / click on app / Resources / Add-ons / Heroku Postgres / Hobby Dev - Free
- Heroku / click on app / Settings / Config Vars / Reveal Config Vars / verify DATABASE_URL

It should look something like this:

```
postgres://userblahblahfdd:10fpwdblahblah87@ec2-12-100-99-99.compute-1.amazonaws.com:5432/d5fdbnametu7
```

We can use DATABASE_URL - or the individual variables depending on how we connect. 

## Keep Secrets Secret

- Use a .env file to hold actual values. 
- Use a .env-example file to hold fake values. 
- Commmit .env-example to the public repo.
- Add .env to .gitignore 
- Share .env only with collaborators. 
