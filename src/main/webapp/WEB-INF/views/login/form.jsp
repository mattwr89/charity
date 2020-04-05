<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <h2>Zaloguj się</h2>

    <form method="post" action="/login">

        <p class="has-text-centered">Nazwa użytkownika: <input class="input"  type="text" name="username"/></p>
        <p class="has-text-centered">Hasło: <input class="input"  type="password" name="password"/></p>
        <p><button class="button" type="submit">Zaloguj</button></p>
        <security:csrfInput/>

    </form>
</section>
<script src="<c:url value="/resources/js/app.js"/>"></script>
</body>
</html>
