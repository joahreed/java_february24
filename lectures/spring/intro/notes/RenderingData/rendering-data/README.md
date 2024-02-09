# [Rendering Data](https://login.codingdojo.com/m/315/9532/64279)

## Learning Objective:

- Gain a deeper understanding of passing data using `Model`


>In Spring MVC, whenever you import `Model` into your controller you can use it as a container to store data and pass that data to the view engine. Data can be any type: objects, strings, numbers, even dates! And you can use it in any of your method signatures. When the framework gets a request mapped to that function, it will automatically create that `Model` instance container, the `model` variable in our code below. This is an example of __dependency injection__.

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
- add configuration to [application.properties](../rendering-data/src/main/resources/application.properties)

```
# Where are jsp files? HERE!
spring.mvc.view.prefix=/WEB-INF/
```
- create [HomeController.java](../rendering-data/src/main/java/co/tylermaxwell/renderingdata/HomeController.java).
- add the [view](../rendering-data/src/main/webapp/WEB-INF/index.jsp) page
- Create a [POJO](../rendering-data/src/main/java/co/tylermaxwell/renderingdata/User.java) to render data.

