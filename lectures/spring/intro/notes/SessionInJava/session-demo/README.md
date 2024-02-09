# [Session in Java](https://login.codingdojo.com/m/315/9532/65005)

## Learning Objectives:

- Learn how to use session in your Spring projects
- Be able to set and get attributes in session
- Test whether a value is already stored in session
- Cast session objects into the correct data types


## Using Session

> if you want to use session in any of your mapped handler methods, just include a parameter of type HttpSession in the method signature.


```java
    public String index(HttpSession session){
		 // Here we can use the variable session to store things!
		return "index.jsp"
    }
```

## Setting, Getting, and Updating Session Attributes

- setting/updating:

```java
    public String index(HttpSession session){
		 session.setAttribute("key", "value")
		return "index.jsp"
    }
```

- getting:

```java
    public String index(HttpSession session){
		 String contentOfSession = session.getAttribute("key");
		return "index.jsp"
    }
```
or access in view:

```html
<c:out value="${count}"/>
```
