<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<c:set var="name" value="${friend.firstName}" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Friends List</title>
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
				<h1></h1>
				<c:forEach items="${friend.addresses}" var="a">
					<tr>
						<td>${a.id}</td>
						<td>${a.city}</td>
						<td>${a.state}</td>
						<td>${a.country}</td>
						<td>${a.category}</td>
						<td><a href="${path}/address/editAddressForm/${a.id}">Edit
						</a> / <a href="${path}/address/delete/${a.id}">Delete
								</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</center>
</body>
</html>