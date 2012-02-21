
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><%@ taglib uri="http://java.sun.com/jstl/xml" prefix="x" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<th>Nama</th>
			<th>Email</th>
			<th>Komentar</th>
		</tr>
		<c:forEach items="${daftarKomentar}" var="k">
		<tr>
			<td>${k.nama}</td>
			<td>${k.email}</td>
			<td>${k.komentar}</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>