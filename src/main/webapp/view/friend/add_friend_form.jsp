<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Friend</title>
</head>
<body>
	<p><a href="${path}/friend/all"> List Friends</a></p>
	<form:form method="post" action="${path}/friend/save" modelAttribute="newFriend">
		<form:hidden path="id"/>
		<p>First Name : <form:input path="firstName" placeholder="Enter Firstname"/></p>
		<p><form:errors path = "firstName" cssClass = "errormsg" /></p>
		<p>Last Name : <form:input path="lastName" placeholder="Enter Lastname"/></p>
		<p><form:errors path = "lastName" cssClass = "errormsg" /></p>
		<p><form:button value="Save">Save</form:button></p>
	</form:form>
</body>
</html>
