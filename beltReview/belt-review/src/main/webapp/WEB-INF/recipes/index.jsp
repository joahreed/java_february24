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
    <title>all recipes</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
    <div class="container">

        <div class="text-end mt-3">
            <a class="btn btn-danger" href="/logout">logout</a>
            <a class="btn btn-success" href="/recipes/new">new recipe</a>
        </div>
        <h1>Welcome ${userName}</h1>

        <table class="table">
            <thead>
                <tr>
                    <th>name</th>
                    <th>description</th>
                    <th>price</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="recipe" items="${recipes}">
                    <tr>
                        <td>
                            <a href="/recipes/${recipe.id}">
                                <c:out value="${recipe.name}"></c:out>
                            </a>

                        <c:if test="${userId == recipe.user.id}">
                            <a class="btn btn-warning" href="/recipes/edit/${recipe.id}">edit</a>
                        </c:if>
                        </td>
                        <td><c:out value="${recipe.description}"></c:out></td>
                        <td>
                            <fmt:formatNumber value="${recipe.price}" type="currency" currencySymbol="$"/>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>

