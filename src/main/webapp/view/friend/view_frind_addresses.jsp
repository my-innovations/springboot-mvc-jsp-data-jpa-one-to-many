<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<c:set var="name" value="${friend.firstName}" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Address List</title>
</head>
<body>
	<center>
		<h1>${name}'s Addresses</h1>
		<table border="1">
			<thead>
				<tr>
					<th>Address ID</th>
					<th>City</th>
					<th>State</th>
					<th>Country</th>
					<th>Category</th>
					<th>Edit/Delete Address</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${friend.addresses}" var="address">
					<tr>
						<td>${address.id}</td>
						<td>${address.city}</td>
						<td>${address.state}</td>
						<td>${address.country}</td>
						<td>${address.category}</td>
						<td><a href="${path}/address/editAddressForm/${address.id}">Edit	</a> / <a href="${path}/address/delete/${address.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</center>
</body>
</html>