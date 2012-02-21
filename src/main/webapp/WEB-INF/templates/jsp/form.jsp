<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form:form commandName="komentar">
			Nama: 
			<input type="text" name="nama" /><br />
			<font color:red><form:errors path="email" />
			Email: 
			<input type="text" name="email" /><br />
			<font color:red><form:errors path="nama" />
			Komentar: 
			<input type="text" name="komentar" /><br />
			<input type="submit" value="Submit" />
	</form:form>
	
</body>
</html>