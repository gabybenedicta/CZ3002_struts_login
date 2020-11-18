# CZ3002_struts_login
Implement Login with Struts MVC Framework

## Servers
Use `Tomcat v.8.5` and define a new server
To download Tomcat, click [here](https://tomcat.apache.org/download-80.cgi)

## Configuring Dependencies (PROJECT BUILD PATH)
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


## Running the Server
1. Right click on `StrutsLogin` and select `Run On Server`
2. Server will be run on localhost:8080/StrutsLogin/
