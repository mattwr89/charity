<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pl">

<html>
<head>
    <title>Title</title>
</head>
<body>

<header class="header--form-page">
    <nav class="container container--70">
        <ul class="nav--actions">
            <li class="logged-user">
                Witaj ${username}
                <ul class="dropdown">
                    <li><a href="/app/donation/">Przekaż darowiznę</a></li>
                    <li><a href="#">Profil</a></li>
                    <li><a href="#">Moje zbiórki</a></li>
                    <li><a href="/logout">Wyloguj</a></li>
                </ul>
            </li>
        </ul>
    </nav>

    <div class="slogan container container--90">
        <h2>

            Dziękujemy za przesłanie formularza. Na maila prześlemy wszelkie
            informacje o odbiorze.
        </h2>
    </div>
</header>


</body>
</html>
