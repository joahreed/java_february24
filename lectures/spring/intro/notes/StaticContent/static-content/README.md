# [Static Content](https://login.codingdojo.com/m/315/9532/64280)

## Learning Objective:

- Be able to add CSS and JavaScript files to your project

>Adding CSS or JavaScript code to a Spring Boot project only takes a few steps. Spring Boot automatically looks inside the static folder located at src/main/resources. This folder is where we will put our static CSS and JavaScript files. 

## Setup

- always update [pom.xml](pom.xml)!

```xml
  <!-- DEPENDENCIES FOR DISPLAYING JSPS AND USING JSTL TAGS -->
  <dependency>
      <groupId>org.apache.tomcat.embed</groupId>
      <artifactId>tomcat-embed-jasper</artifactId>
  </dependency>
  <dependency>
      <groupId>jakarta.servlet.jsp.jstl</groupId>
      <artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
  </dependency>
  <dependency>
      <groupId>org.glassfish.web</groupId>
      <artifactId>jakarta.servlet.jsp.jstl</artifactId>
  </dependency>
```
- add configuration to [application.properties](../static-content/src/main/resources/application.properties)

```
# Where are jsp files? HERE!
spring.mvc.view.prefix=/WEB-INF/
```
- create [HomeController.java](../static-content/src/main/java/co/tylermaxwell/staticcontent/HomeController.java).
- add the [view](../static-content/src/main/webapp/WEB-INF/index.jsp) page

- add [style.css](../static-content/src/main/resources/static/css/style.css)
- add [app.js](../static-content/src/main/resources/static/js/app.js)


