<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<h1><c:out value="${message}"/></h1>
<hr>

<ul>
<c:forEach items="${arrayList}" var="val">
	<li>
		<h3>
			<c:out value="${val}"/>
		</h3>
	</li>
</c:forEach>
</ul>
 