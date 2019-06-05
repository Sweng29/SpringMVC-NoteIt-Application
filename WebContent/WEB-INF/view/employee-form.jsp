<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employees || Home</title>
</head>
<body>
<form:form action="addEmployee" modelAttribute="employee">
	<form:input path="firstName" title="First Name" placeholder="Enter first name"/>
	<br/><br/>
	<form:input path="middleName" title="Middle Name" placeholder="Enter middle name"/>
	<br/><br/>
	<form:input path="lastName" title="Last Name" placeholder="Enter last name"/>
	<br/><br/>
	<form:button value="Add Employee" type="submit">Add Employee</form:button>
	<br/><br/>
</form:form>
</body>
</html>