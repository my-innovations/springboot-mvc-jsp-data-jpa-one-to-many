<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Friends with addresses List</title>
</head>
<body>
<center>
	<p><a href="${path}/friend/">Home</a> | <a href="${path}/friend/form">Add a New Friends</a> | <a href="${path}/friend/all">View All Friends</a></p>
	<table border="1">
		<thead>
			<tr>
				<!-- <th>Friend ID</th> -->
				<th>First Name</th>
				<th>Last Name</th>
				<!-- <th>Address ID</th> -->
				<th>City</th>
				<th>State</th>
				<th>Country</th>
				<th>Category</th>
				<th>Edit Address</th>
				<th>Delete Address</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="address">
				<tr>
					<%-- <td>${address.friend.id}</td> --%>
					<td>${address.friend.firstName}</td>
					<td>${address.friend.lastName}</td>
					<%-- <td>${address.id}</td> --%>
					<td>${address.city}</td>
					<td>${address.state}</td>
					<td>${address.country}</td>
					<td>${address.category}</td>
					<td><a href="${path}/address/editAddressForm/${address.id}">Edit This Address</a></td>
					<td><a href="${path}/address/delete/${address.id}">Delete This Address</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</center>
</body>
</html>