<%--
  Created by IntelliJ IDEA.
  User: magda
  Date: 22/05/2022
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Client add</title>
</head>
<body>

<form:form method="post" modelAttribute="client">


    <form:input path="firstName"/>
    <form:input path="lastName"/>
    <form:input path="pesel"/>
    <input type="submit" value="Save">


</form:form>


</body>
</html>
