<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>

</head>
<body>
		<form:form method="POST" action="/SpringMVC4/soc1/handle2" modelAttribute="person">
		<form:errors path="*" cssClass="errorblock" element="div" />
			name: <form:input path="name"></form:input>
			contact:<form:input path="contactNo"></form:input>
			<input type="submit" value="submit"/>
		</form:form>
		<%-- <form:form modelAttribute="sportTypes">
		<form:select path="Sport" items="$(sportTypes)"/>
		</form:form> --%>
</body>
</html>