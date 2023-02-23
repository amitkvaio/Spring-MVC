<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html>
<body>
	<center>
		<table>
			<tr>
				<td><h3>Hi,&nbsp;<c:out value="${reg.fname}"/> You are successfully
						registered!your details are below.</h3></td>
			</tr>
			<tr>
				<td><h3>First Name</h3></td>
				<td><h3><c:out value="${reg.fname}"/></h3></td>
			</tr>

			<tr>
				<td><h3>Last Name</h3></td>
				<td><h3><c:out value="${reg.lastname}"/></h3></td>
			</tr>

			<tr>
				<td><h3>Father Name</h3></td>
				<td><h3><c:out value="${reg.fathername}"/></h3></td>
			</tr>

			<tr>
				<td><h3>AGE</h3></td>
				<td><h3><c:out value="${reg.age}"/></h3></td>
			</tr>

			<tr>
				<td><h3>Address</h3></td>
				<td><h3><c:out value="${reg.add}"/></h3></td>
			</tr>
		</table>
		<button onclick="history.back()">Go Back</button>
	</center>
</body>
</html>
