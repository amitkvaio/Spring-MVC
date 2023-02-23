<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html>
<body>
	<p>Your reservation is confirmed successfully. Please, re-check the
		details.
	</p>
	First Name : <c:out value="${reservation.firstName}"/> <br> 
	Last Name :  <c:out value="${reservation.lastName}"/> <br>
	Gender :     <c:out value="${reservation.gender}"/> <br> 
	Meals:
	<ul>
		<c:forEach var="meal" items="${reservation.food}">
			<li><c:out value="${meal}"/></li>
		</c:forEach>
	</ul>
	Leaving From :<c:out value="${reservation.cityFrom}"/><br>  
    Going To : <c:out value="${reservation.cityTo}"></c:out>   
</body>
</html>