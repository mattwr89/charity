<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
    <title>Logowanie</title>
</head>
<body>
<section class="section">
    <div class="container">

        <form class="has-text-centered" method="post" action="/login">

            <p class="has-text-centered">Nazwa użytkownika: <input class="input"  type="text" name="username"/></p>
            <p class="has-text-centered">Hasło: <input class="input"  type="password" name="password"/></p>
            <p><button class="button" type="submit">Zaloguj</button></p>
            <security:csrfInput/>
            <p><button formmethod="post" formaction="/register" class="button" type="submit">Rejestracja</button></p>

        </form>
    </div>
</section>
<script src="<c:url value="/resources/js/app.js"/>"></script>
</body>
</html>
