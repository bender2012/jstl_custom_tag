<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="custom" tagdir="/WEB-INF/tags" %>
    <%@ taglib uri="/WEB-INF/customTag.tld" prefix="ct" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<custom:greating greating="Hey, hey, hey!!!"/>
	<div id="body">Hello World!!!</div>
	<div id="today">Today is: 
		<ct:today format="dd MMMM, yyyy"/>
	</div>
</body>
</html>