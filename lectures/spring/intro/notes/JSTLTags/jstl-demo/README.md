# [JSTL tags](https://login.codingdojo.com/m/315/9532/64553)

## Learning Objective:

- Use JSTL Tags to add further functionality to your application

>The JSTL is the Java Server Pages Standard Tag Library (JSPSTL was a little too much). We'll primarily be using JSTL tags to dynamically populate our templates with data from the server, specifically from your controller. [Think Jinja]

## Setup

- add dependencies to the [pom.xml](../jstl-demo/pom.xml) file:

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

- create the correct file structure for [JSP files](../jstl-demo/src/main/webapp/WEB-INF/index.jsp)
- update [application](../jstl-demo/src/main/resources/application.properties)

```
spring.mvc.view.prefix=/WEB-INF/
```

- add the following to the top of the [jsp file](../jstl-demo/src/main/webapp/WEB-INF/index.jsp)

```html
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
```