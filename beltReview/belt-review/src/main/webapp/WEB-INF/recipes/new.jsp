
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
    <title>new recipes</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
    <div class="container">
        <div class="text-end mt-3">
            <a class="btn btn-danger" href="/logout">logout</a>
            <a class="btn btn-success" href="/recipes/new">add recipe</a>
        </div>
        <h1>Welcome ${userName}</h1>
        <h2>Add a recipe</h2>
        <form:form action="/recipes" method="post" modelAttribute="recipe">
            <form:input type="hidden" path="user" value="${userId}" />
    <p>
        <form:label path="name">name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description"/>
        <form:textarea path="description"/>
    </p>
    <p>
        <form:label path="price">price</form:label>
        <form:errors path="price"/>     
        <form:input type="number" path="price"/>
    </p>    
    <p>
        <form:label path="date">date</form:label>
        <form:errors path="date"/>
        <form:input type="date" path="date"/>
    </p>
    <p>
        <form:label path="under_30">under_30</form:label>
        <form:errors path="under_30"/>
        <form:radiobutton path="under_30" value="1" /> yes
        <form:radiobutton path="under_30" value="0" /> no
    </p>
    <input type="submit" value="Submit"/>
</form:form>   
       </div>
</body>
</html>
