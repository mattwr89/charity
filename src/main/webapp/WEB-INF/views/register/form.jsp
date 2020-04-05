<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="/resources/css/style.css" />
</head>
<body>
<section class="login-page">
    <h2>Załóż konto</h2>
    <form:form modelAttribute="data"  method="post" action="/register">
        <div class="form-group">
            <form:input path="username" type="text" name="username" placeholder="Nick" />
        </div>
        <div class="form-group">
            <form:input path="email" type="email" name="email" placeholder="Email" />
        </div>
        <div class="form-group">
            <form:input path="password" type="password" name="password" placeholder="Hasło" />


        <div class="form-group form-group--buttons">
            <a href="login.html" class="btn btn--without-border">Zaloguj się</a>
            <button class="btn" type="submit">Załóż konto</button>
        </div>
                    <security:csrfInput/>
    </form:form>
</section>
<script src="<c:url value="/resources/js/app.js"/>"></script>
</body>
</html>
