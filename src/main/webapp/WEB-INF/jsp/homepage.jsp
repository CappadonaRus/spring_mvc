<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<style>
.error{color:red}
</style>
<title>Title page</title>
</head>
<body>
	<h1>Spring MVC</h1>
<form:form action="redirectPage" modelAttribute="PersonData">
   Username: <form:input path="name"/> <form:errors path="name" cssClass="error"/><br><br>
        Age: <form:input path="age"/> <form:errors path="age" cssClass="error"/><br><br>
<input type="submit" value="submit">
</form:form>
</body>
</html>