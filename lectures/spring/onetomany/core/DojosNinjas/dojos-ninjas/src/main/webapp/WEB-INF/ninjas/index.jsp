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
    <title>Ninjas</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
    <h1>New Dojo</h1>

    <form:form action="/ninjas/create" method="POST" modelAttribute="ninja">

    <div class="form-control">
        <form:label path="dojo">dojo</form:label>
        <form:errors path="dojo"/>
        <form:select path="dojo">
            <c:forEach var="dojo" items="${dojos}">
                <form:option value="${dojo}">${dojo.name}</form:option>
            </c:forEach>
        </form:select>
    </div>
 
    <div class="form-control">
        <form:label path="firstName">firstName</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </div>
    <div class="form-control">
     <form:label path="lastName">lastName</form:label>
     <form:errors path="lastName"/>
     <form:input path="lastName"/>
    </div>
    <div class="form-control">
     <form:label path="age">age</form:label>
     <form:errors path="age"/>
     <form:input type="number" path="age"/>
    </div>
 
    <input type="submit" value="add dojo">
 
    </form:form>
</body>
</html>

