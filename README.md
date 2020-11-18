# CZ3002_struts_login
Implement Login with Struts MVC Framework

## Servers
Use `Tomcat v.8.5` and define a new server
To download Tomcat, click [here](https://tomcat.apache.org/download-80.cgi)

## Pre-requisites
### Configuring Dependencies (PROJECT BUILD PATH)
(Steps written for eclipse)
1. Add *JAR* files to the build path configuration. The JAR files needed are located in `WebContent/WEB-INF/lib/`
```
- Right Click on StrutsLogin
- Build Path --> Configure Build Path
- Java Build Path --> Libraries --> classpath --> Add JAR
- Apply and Close
```

2. Run the Project as a Dynamic Web Application
```
- Right Click on StrutsLogin
- Properties --> Project Facets
- Select the following:
  - Dynamic Web Module
  - Java
  - Javascript
- Click on Runtime and select Apache Tomcat v8.5
- Apply and Close
```
### Setting Up the Database
1. Download MySQL and start the MySQL server (the team uses `v8.0.xx`)
2. Create a new database called `struts2database` with user root
3. Modify the password of root in `LoginActivation.java` according to your root password.
4. Check that your database is exposed on `localhost` port `3306`


## Running the Server
1. Right click on `StrutsLogin` and select `Run On Server`
2. Server will be run on localhost:8080/StrutsLogin/
