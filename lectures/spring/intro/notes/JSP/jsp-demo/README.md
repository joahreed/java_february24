# [Java Server Pages(JSP)](https://login.codingdojo.com/m/315/9532/64276)


---
> NOTE: 
> `@RestController` is for raw data(i.e. strings, Java objects).
>       `@Controller` is for rendering template pages(i.e. JSP)
---

- update the [pom](../jsp-demo/pom.xml) file and add the following dependency:

```xml
        <dependency>
                <groupId>org.apache.tomcat.embed</groupId>
                <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
```
- create a [controller](../jsp-demo/src/main/java/co/tylermaxwell/jspdemo/MainController.java) and be sure to use the `@Controller` annotation
- template pages have a `.jsp` extension. and have to be in a specific [folder](../jsp-demo/src/main/webapp/demo.jsp)


