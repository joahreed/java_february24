<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <script type="text/javascript" src="/js/app.js"></script>
    <!-- change to match your file/naming structure -->
</head>

<body>
    <div class="container">

        <h1>Conditionals</h1>

        <p>
            Number: <c:out value="${number}"></c:out>
        </p>
        <c:if test="${number % 2 == 0}">
            <p>
                <c:out value="even!" />
            </p>
        </c:if>
        <c:if test="${number % 2 != 0}">
            <p>
                <c:out value="odd!" />
            </p>
        </c:if>
    </div>

    <p>
        secret number: <c:out value="${secretNumber}"></c:out>
    </p>


    <c:choose>
        <c:when test="${number<secretNumber}">
            <p>
                <c:out value="Your number is too low." />
            </p>
        </c:when>
        <c:when test="${number>secretNumber}">
            <p>
                <c:out value="Your number is too high." />
            </p>
        </c:when>
        <c:otherwise>
            <p>
                <c:out value="You got it!" />
            </p>
        </c:otherwise>
    </c:choose>
</body>

</html>