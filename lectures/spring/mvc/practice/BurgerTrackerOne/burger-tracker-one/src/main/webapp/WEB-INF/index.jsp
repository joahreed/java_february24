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
    <title>Burgers</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
    ${burgers}
    <div class="container">
        <h1>Burger Tracker</h1>
        <table class="table">
            <thead>
                <tr>
                    <th>name</th>
                    <th>restaurant</th>
                    <th>rating</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="burger" items="${burgers}">
                    <tr>
                        <td><c:out value="${burger.name}"></c:out></td>
                        <td><c:out value="${burger.restaurant}"></c:out></td>
                        <td><c:out value="${burger.rating}"></c:out></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <h2>Add a burger</h2>

        <form:form action="/burgers/create" method="POST" modelAttribute="burger">

        <div class="form-control">
            <form:label path="name">name</form:label>
            <form:input path="name" />
            <form:errors path="name" />
        </div>

        <div class="form-control">
            <form:label path="restaurant">restaurant</form:label>
            <form:input path="restaurant" />
            <form:errors path="restaurant" />
        </div>

        <div class="form-control">
            <form:label path="rating">rating</form:label>
            <form:input type="number" path="rating" />
            <form:errors path="rating" />
        </div>

        <div class="form-control">
            <form:label path="notes">notes</form:label>
            <form:input path="notes" />
            <form:errors path="notes" />
        </div>


        <input type="submit" value="create burger">

        </form:form>
    </div>
   
</body>
</html>

