<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Friends List</title>
</head>
<body>
<center>
	<p><a href="${path}/friend/">Home</a> |  <a href="${path}/friend/new">Add A New Friend</a> | <a href="${path}/address/all">View All Friends with Addresses</a></p>
	<h1>All Friends</h1>
	<table border="1">
		<thead>
			<tr>
				<th>Friend Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Edit / Delete Friend</th>
				<th>Add / View Address</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${friends}" var="friend">
				<tr>
					<td>${friend.id}</td>
					<td>${friend.firstName}</td>
					<td>${friend.lastName}</td>
					<td><a href="${path}/friend/editFriendForm/${friend.id}">Edit / <a href="${path}/friend/delete/${friend.id}">Delete</a></a></td>
					<td><a href="${path}/address/form/${friend.id}">Add </a> / <a href="${path}/friend/${friend.id}">View All Addresses</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</center>
</body>
</html>