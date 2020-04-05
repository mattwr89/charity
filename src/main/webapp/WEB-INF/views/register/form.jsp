<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>-

    <title>Zarejestruj</title>
</head>
<body>


<section class="login-page">
    <h2>Załóż konto</h2>

    <form:form modelAttribute="data" method="post" action="/register">
    <form>
            <p>Nazwa użytkownika: <form:input path="username"/> <form:errors path="username"/> </p>
            <p>Email: <form:input path="email"/> <form:errors path="email"/> </p>
            <p>Hasło: <form:password path="password"/> <form:errors path="password"/> </p>
            <p><button type="submit">Zarejestruj</button></p>
    </form:form>
</section>

<script src="<c:url value="/resources/js/app.js"/>"></script>
</body>
</html>
