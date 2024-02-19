# [Belt Review](https://login.codingdojo.com/m/315/9533/64310)


- [application.properties](./src/main/resources/application.properties)

```
# Where are jsp files? HERE!
spring.mvc.view.prefix=/WEB-INF/
# Data Persistence
spring.datasource.url=jdbc:mysql://localhost:3306/belt-review-feb24?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
# For Update and Delete method hidden inputs
spring.mvc.hiddenmethod.filter.enabled=true
```

- [pom.xml](pom.xml)

```xml

<!-- DEPENDENCIES FOR DISPLAYING JSPS AND USING JSTL TAGS -->
 
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
        <!-- DEPENDENCY FOR USING BCRYPT  -->
        <dependency>
            <groupId>org.mindrot</groupId>
            <artifactId>jbcrypt</artifactId>
            <version>0.4</version>
        </dependency>
        <!-- DEPENDENCIES FOR BOOTSTRAP -->
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>webjars-locator</artifactId>
            <version>0.46</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>bootstrap</artifactId>
            <version>5.2.3</version>
        </dependency>

```

- Views
  - [index.jsp](./src/main/webapp/WEB-INF/index.jsp)
- Controllers
  - [MainController](./src/main/java/co/tylermaxwell/beltreviewstart/controllers/MainController.java)
  - [RecipeController](./src/main/java/co/tylermaxwell/beltreviewstart/controllers/RecipeController.java)
- Models
  - [User](./src/main/java/co/tylermaxwell/beltreviewstart/models/User.java)
  - [LoginUser](./src/main/java/co/tylermaxwell/beltreviewstart/models/LoginUser.java)
  - [Recipe](./src/main/java/co/tylermaxwell/beltreviewstart/models/Recipe.java)
- Repositories
  - [User](./src/main/java/co/tylermaxwell/beltreviewstart/repositories/UserRepository.java)
  - [Recipe](./src/main/java/co/tylermaxwell/beltreviewstart/repositories/RecipeRepository.java)
- Services
  - [UserService](./src/main/java/co/tylermaxwell/beltreviewstart/service/UserServiced.java)
  - [RecipeService](./src/main/java/co/tylermaxwell/beltreviewstart/service/RecipeService.java)
 