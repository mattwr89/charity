<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<%@include file="/WEB-INF/views/head.jsp" %>
<body>


<section class="login-page">
    <h2>Załóż konto</h2>

    <form:form modelAttribute="data" method="post" action="/register">
    <div class="form-group">
        <form:input path="username" type="text" name="username" placeholder="Nazwa użytkownika"/>
    </div>
    <div class="form-group">
        <form:input path="email" type="email" name="email" placeholder="Email"/>
    </div>
    <div class="form-group">
            <form:input path="password" type="password" name="password" placeholder="Hasło"/>


        <div class="form-group form-group--buttons">
            <a href="/login" class="btn btn--without-border">Zaloguj się</a>
            <button class="btn" type="submit">Załóż konto</button>
        </div>
            <security:csrfInput/>
        </form:form>
</section>
<%@include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>
