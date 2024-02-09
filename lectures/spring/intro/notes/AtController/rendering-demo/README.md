# [Rendering with `@Controller`](https://login.codingdojo.com/m/315/9532/64278)

## Learning Objective:

- Render a JSP page with the @Controller annotation

## `@Controller` Instead of `@RestController`

- `@RestController` is for data
- `@Controller` is for views

# Steps

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
- add configuration to [application.properties](../rendering-demo/src/main/resources/application.properties)

```
# Where are jsp files? HERE!
spring.mvc.view.prefix=/WEB-INF/
```
- create [HomeController.java](../rendering-demo/src/main/java/co/tylermaxwell/renderingdemo/HomeController.java).
- add the [view](../rendering-demo/src/main/webapp/WEB-INF/index.jsp) page:

```html
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   <h1>Hello World</h1>
</body>
</html>
```

