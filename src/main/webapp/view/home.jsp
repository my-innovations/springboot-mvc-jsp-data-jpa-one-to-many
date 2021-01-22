<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
</head>
<body>
	<p>
		<a href="${path}/friend/all">View All Friends</a>
	</p>
	<p>
		<a href="${path}/address/all">View All Friends With Addresses</a>
	</p>
	<p>
		<a href="${path}/friend/form">Add new Friend</a>
	</p>

	<p>
		<a href="${path}/address/form">Add Address</a>
	</p>
</body>
</html>