<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html>
<body>
	<center>
		<table>
			<tr>
				<td><h3>Hi,&nbsp;<c:out value="${fname}"/> You are successfully
						registered!your details are below.</h3></td>
			</tr>
			<tr>
				<td><h3>First Name</h3></td>
				<td><h3><c:out value="${fname}"/></h3></td>
			</tr>

			<tr>
				<td><h3>Last Name</h3></td>
				<td><h3><c:out value="${lname}"/></h3></td>
			</tr>

			<tr>
				<td><h3>Father Name</h3></td>
				<td><h3><c:out value="${fathername}"/></h3></td>
			</tr>

			<tr>
				<td><h3>AGE</h3></td>
				<td><h3><c:out value="${age}"/></h3></td>
			</tr>

			<tr>
				<td><h3>Address</h3></td>
				<td><h3><c:out value="${address}"/></h3></td>
			</tr>
		</table>
	</center>
</body>
</html>
