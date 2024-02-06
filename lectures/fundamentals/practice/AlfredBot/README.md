# [Alfred Bot](https://login.codingdojo.com/m/315/9299/62843)


## Learning Objective:

- Be able to implement methods in Java
- Begin using a file with the main method to test your code
- Be able to inject another class instance into your main to use and test methods
- Import and use the `java.util.Date` class
- Practice using `String` class methods
- Practice using conditional control structures in Java


## steps

- [ ] Create a project folder in your Java course folder called [alfredBot]().
- [ ] Create an [AlfredQuotes.java]() class file that will hold all of Alfred bot's functionality.
- [ ] Create an [AlfredTest.java](./end/src/main/java/tylermaxwell/Main.java) main program file that will execute code to test our AlfredQuotes class.
- [ ] Implement the `guestGreeting` method, and test it by first compiling the test file with the javac command and then running the test file with the java command in your terminal.
- [ ] Implement the `dateAnnouncement` method and test it.
- [ ] Implement the `answeringBeforeAlexis` method and test it.
- [ ] Ninja Bonus 1: Overload the `guestGreeting` method.
- [ ] Ninja Bonus 2: Implement your own method for the Alfred bot using any of the built-in String methods you've learned.

## String interpolation

```java
String str = "Hello"
int myint = 42;
double mydouble = 3.14;
String.format("%s, %d, %f", str, myint, mydouble);