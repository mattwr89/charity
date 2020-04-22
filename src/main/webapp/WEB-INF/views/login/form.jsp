<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pl">
<%@include file="/WEB-INF/views/head.jsp"%>
<body>

<section class="login-page">
    <h2>Zaloguj się</h2>
    <form action="/login" method="post">
        <div class="form-group">
            <input type="text" name="username" placeholder="Nazwa użytkownika" />
        </div>
        <div class="form-group">
            <input type="password" name="password" placeholder="Hasło" />
            <a href="#" class="btn btn--small btn--without-border reset-password">Przypomnij hasło</a>
        </div>

        <div class="form-group form-group--buttons">
            <a href="/register" class="btn btn--without-border">Jesteś nowy ? Załóż konto</a>
            <button class="btn" type="submit">Zaloguj się</button>
        </div>
        <security:csrfInput/>
    </form>
</section>

</body>
<%@include file="/WEB-INF/views/footer.jsp"%>
</html>
