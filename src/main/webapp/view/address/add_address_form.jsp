<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<c:set var="friendId" value="${friendId}"/>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Address</title>
</head>
<body>
	<p><a href="${path}/address/all"> List Address</a></p>
	
	<form:form method="post" action="${path}/address/save" modelAttribute="addressForm">
		<form:hidden path="id"/>
		<p>Friend ID : <form:input path="friendId" value="${friendId}" readonly="true"/></p>
		<p>City Name : <form:input path="city" placeholder="Enter City Name"/></p>
		<p>State Name : <form:input path="state" placeholder="Enter State Name"/></p>
		<p>Country Name : <form:input path="country" placeholder="Enter Country Name"/></p>
		<p>Category : <form:input path="category" placeholder="Enter Category Name Permanent or Present"/></p>
		<p>	<form:button value="Save">Save</form:button> </p>
	</form:form>
	
</body>
</html>
