# [Daikichi Routes](https://login.codingdojo.com/m/315/9532/64576)

## Learning Objectives:

- Create a Spring Boot application using Spring Tool Suite
- Create a controller using the `@RestController` annotation
- Use request mapping and `@RequestMapping` annotations to have distinct URL endpoints return different messages

## Steps

- [ ] Start a new Spring Starter Project and create a package for your controllers.

- [ ] Create a new controller called [DaikichiController](../daikichi-routes/src/main/java/co/tylermaxwell/daikichiroutes/DaikichiController.java), and be sure you annotate it as a @RestController.

- [ ] Have an http GET request to 'http://localhost:8080/daikichi' that displays the following: 'Welcome!'.

- [ ] Have an http GET request to 'http://localhost:8080/daikichi/today' that displays the following: 'Today you will find luck in all your endeavors!'.

- [ ] Have an http GET request to 'http://localhost:8080/daikichi/tomorrow' that displays the following: 'Tomorrow, an opportunity will arise, so be sure to be open to new ideas!'.