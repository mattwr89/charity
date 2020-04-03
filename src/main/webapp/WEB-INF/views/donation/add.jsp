<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Dodaj dar</title>
</head>
<body>


    <form:form modelAttribute="donationData">
    <form:checkboxes path="categoriesId"
                     items="${categories}"/>
    <form:select path="institutionId" items="${institutions}" itemValue="id" itemLabel="name"/>
    <form:input path="zipCode" />
    <form:input path="street" />
    <form:input path="city"/>
    <form:input path="quantity"/>
    <form:textarea path="pickUpComment"/>
    <form:input type="date" path="pickUpDate"/>
    <form:input type="time" path="pickUpTime" />
    </form:form>



</body>
</html>
