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
   <div class="container">

    <div class="row">
        <div class="col">
            <h2>Register</h2>
    <form:form action="/register" method="post" modelAttribute="newUser">
    <div class="form-contol">
        <form:label path="userName">userName</form:label>
        <form:input path="userName"/>
        <div>
            <form:errors path="userName"/>
        </div>
    </div>
    <div class="form-contol">
        <form:label path="email">email</form:label>
        <form:input path="email"/>
        <div>
            <form:errors path="email"/>
        </div>
    </div>
    <div class="form-contol">
        <form:label path="password">password</form:label>
        <form:input path="password"/>
        <div>
            <form:errors path="password"/>
        </div>
    </div>
    <div class="form-contol">
        <form:label path="confirm"> Password Confirmation</form:label>
        <form:input path="confirm"/>
        <div>
            <form:errors path="confirm"/>     
        </div>
    </div>    
    <input type="submit" value="Submit"/>
</form:form> 


        </div>
        <div class="col">
            <h2>Login</h2>
            <form:form action="/login" method="post" modelAttribute="newLogin">
               
                <div class="form-contol">
                    <form:label path="email">email</form:label>
                    <form:input path="email"/>
                    <form:errors path="email"/>
                </div>
                <div class="form-contol">
                    <form:label path="password">password</form:label>
                    <form:input path="password"/>
                    <form:errors path="password"/>
                </div>
              
                <input type="submit" value="Submit"/>
            </form:form> 
        </div>
    </div>
   </div>
</body>
</html>

