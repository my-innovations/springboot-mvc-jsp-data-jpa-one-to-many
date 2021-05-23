<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style type="text/css">

* {
	margin: 0px;
	padding: 0px;
}

/*####################################################################################################
	header section
    ####################################################################################################*/
header {
	margin: auto;
	/* border: 2px solid red; */
	background-color: #5d2e2e;
	height: 118px;
	/* border-radius: 10px; */
}

img {
	margin: auto;
	padding: 5px;
	display: block;
	width: 70px;
	border-radius: 40px;
}

h1 {
	text-align: center;
	margin: 0px;
	padding-top:30px;
	color: white;
}

.navbar {
	background-color: orange;
	/* border-radius: 10px; */
	/* border: 2px solid red; */
}

.navbar ul {
	overflow: auto;
	margin-top: 45px;
}

.navbar li {
	float: right;
	list-style: none;
	margin: 10px 10px;
}

.navbar li a {
	color: white;
	padding: 3px 40px;
	text-decoration: none;
}

.navbar li a:hover {
	color: orange;
}

/*######################################################################################################
main or body content
######################################################################################################*/
main {
	width: 100%;
	height: 65.3vh;
	/* background-image: linear-gradient(rgba(0, 0, 0, 0.2), rgba(0, 0, 0, 0.4)), url('images/images.jpg');
	background-repeat: no-repeat;
	background-size: cover; */
	background-color:lightblue;
	display: flex;
	justify-content: center;
	align-items: center;
	text-align: center;
	color: white;
}

/* span {
	background-color: blue;
} */

section h3 {
	font-size: 35px;
	font-weight: 200;
	letter-spacing: 3px;
}

section h1 {
	margin: 30px 0 20px 0;
	font-size: 45px;
	font-weight: 700;
	text-shadow: 2px 1px 5px black;
	text-transform: uppercase;
}

section p {
	font-size: 15px;
	word-spacing: 2px;
	margin-bottom: 15px;
	text-shadow: 1px 1px 1px black;
}

section a {
	padding: 12px 30px;
	border-radius: 4px;
	outline: none;
	/*text-transform: uppercase;*/
	font-size: 13px;
	font-weight: 500;
	text-decoration: none;
	letter-spacing: 1px;
	color: blue;
}

section .btn_login {
	background: orange;
}

section .btn_signup {
	background: orange;
}

.errormsg {
    color: red;
    font-style:bold;
}

/*main or body section endened */

/*####################################################################################################
	footer section
####################################################################################################*/
footer {
	width: 100%;
	height: 5vh;
	/*background-image: linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.1)), url('../images/showcase.jpg');*/
	/*background-repeat: no-repeat;*/
	/*background-size: cover;*/
	background-color: #5d2e2e;
	text-align: center;
	padding-top: 5px;
}

footer a {
	font-size: 15px;
	font-weight: 500;
	text-decoration: none;
	letter-spacing: 1px;
	color: white;
}
</style>
</head>
<body>
<!-- ######################################## Header  content  ################################## -->
	<header>
		<!-- <img src="static/images/punya.PNG" alt="photo"> -->
		<h1>Welcome To My Blog</h1>
		<nav class="navbar">
			<ul>
				<%-- <li><a href="${pageContext.request.contextPath}/view/contacts">My Contacts</a></li>
				<li><a href="${pageContext.request.contextPath}/view/profile">My Profile</a></li> --%>
			</ul>
		</nav>
	</header>
	<br>
	<br>
	
<%--  <h2 align="center">Welcome ${pageContext.request.userPrincipal.name} |  <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>
	 
	 <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
    </c:if> --%>
     <!-- ######################################## main or body  content  ################################## -->
<main>
   <section>
	<h1><u>Edit Address Details</u></h1>
	<form:form method="POST" action="${pageContext.request.contextPath}/address/editsave" modelAttribute="address">
		<table>
			<tr>
				<td></td>
				<td><form:hidden path="id" /></td>
			</tr>
			<%-- <tr>
				<td>Friend ID :</td><td> <form:input path="friend.id"/></td>
			</tr> --%>
			<tr>
				<td>City Name :</td>
				<td><form:input path="city" /></td>
				<td><form:errors path = "city" cssClass = "errormsg" /></td>
			</tr>
			<tr>
				<td>State :</td>
				<td><form:input path="state" /></td>
				<td><form:errors path = "state" cssClass = "errormsg" /></td>
			</tr>
			<tr>
				<td>Country :</td>
				<td><form:input path="country" /></td>
				<td><form:errors path = "country" cssClass = "errormsg" /></td>
			</tr>
			<tr>
				<td>Category :</td>
				<td><form:input path="category" /></td>
				<td><form:errors path = "category" cssClass = "errormsg" /></td>
			</tr>
			<tr>
			<td>Friend ID :</td> <td><form:input path="friendId" placeholder="Enter Friend ID"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Update" /></td>
			</tr>
		</table>
	</form:form>
	</section>
	</main>
	<footer>
           <a href="#">copy_write@punya_blog_spot</a>
       </footer>
</body>
</html>
