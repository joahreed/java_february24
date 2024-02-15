# [Burger Tracker 1](https://login.codingdojo.com/m/315/9533/65990)

## Learning Objectives:

- Collect input from the user to add new records in the database
- Become familiar with data binding and how to implement it in SpringMVC
- Identify, use correctly and understand the `@ModelAttribute` annotation
- Use `form:form` tags to be able to use data binding
- Implement validations for user input

![](1666805905__Burger%20Tracker%201.png)


## Steps

- [ ] Create a new __Spring Project__ with packages for:
  - [ ]  [`models`](./burger-tracker-one/src/main/java/co/tylermaxwell/burgertrackerone/models/Burger.java)
  - [ ]  [`repositories`](./burger-tracker-one/src/main/java/co/tylermaxwell/burgertrackerone/repositories/BurgerRepository.java) 
  - [ ]  [`services`](./burger-tracker-one/src/main/java/co/tylermaxwell/burgertrackerone/services/BugerService.java)
  - [ ]  [`controllers`](./burger-tracker-one/src/main/java/co/tylermaxwell/burgertrackerone/controllers/BurgerController.java)




- [ ] Create a model called [Burger](./burger-tracker-one/src/main/java/co/tylermaxwell/burgertrackerone/models/Burger.java) with all the appropriate fields. Don't forget to add annotations and getters & setters!

- [ ] Add all the [appropriate dependencies](./burger-tracker-one/pom.xml) 

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
        <!-- DEPENDENCIES FOR INTEGRATING SQL DATABASE AND USING JPA -->
        <!-- Note: Project will not run until a schema has been created and the 
            proper settings in application properties are present for 
            connecting to a database. -->
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <!-- DEPENDENCY FOR USING VALIDATION ANNOTATIONS -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>

```
- [ ] and [setup](./burger-tracker-one/src/main/resources/application.properties) for adding JSP views and connecting to the database [link](https://login.codingdojo.com/m/315/9533/64310).

```
# Where are jsp files? HERE!
spring.mvc.view.prefix=/WEB-INF/
# Data Persistence
spring.datasource.url=jdbc:mysql://localhost:3306/<<YOUR_SCHEMA>>?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
# For Update and Delete method hidden inputs
spring.mvc.hiddenmethod.filter.enabled=true
```

- [ ] Create a schema for the project and test the setup by running your project. Debug as necessary!

    - This step is not necessary if you add:

```
spring.datasource.url=jdbc:mysql://localhost:3306/<<YOUR_SCHEMA>>?createDatabaseIfNotExist=true
```
to [application.properties](./burger-tracker-one/src/main/resources/application.properties)


- [ ] Create an [`index.jsp`](./burger-tracker-one/src/main/webapp/WEB-INF/index.jsp) file with a table and a form.

- [ ] Create a route in your [controller](./burger-tracker-one/src/main/java/co/tylermaxwell/burgertrackerone/controllers/BurgerController.java) to render index.jsp and just test that it renders.

- [ ] Set up your [BurgerRepository](./burger-tracker-one/src/main/java/co/tylermaxwell/burgertrackerone/repositories/BurgerRepository.java). You will only need the 'findAll' query for now.

- [ ] Set up your [BurgerService](./burger-tracker-one/src/main/java/co/tylermaxwell/burgertrackerone/services/BugerService.java) with any necessary methods. Don't forget to inject your repository interface as a dependency.

- [ ] Add the @ModelAttribute annotation and associated syntax to your render route to bind an empty Burger object to the JSP form and capture the user input.

- [ ] In your JSP, change the form tags to form:form tags, add the modelAttribute, and the error tags. Also, be sure to include the path attribute.

- [ ] Add a POST route in your [controller](./burger-tracker-one/src/main/java/co/tylermaxwell/burgertrackerone/controllers/BurgerController.java) to process the form and add a new burger to the database. The @ModelAttribute annotation will be used to receive the filled Burger object.

- [ ] Be sure the POST route redirects to the render route after creating the new burger.

- [ ] Test adding new burgers by using the form. For now, use workbench to see the results in the database.

In your render route, retrieve all the records from the database and render them on the page.

Finally, be sure to handle validations in your POST method. If errors are present, you'll need to render the page again. But remember, you may need to send in some data here as well!