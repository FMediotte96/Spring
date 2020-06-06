<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/styles.css">
</head>
<body>

Hola ${param.nombre}
<br> 
<div>
	<h2>El usuario logueado es:</h2> 
	${msjUser}
</div>

<img alt="foto" src="${pageContext.request.contextPath}/resources/imgs/pista.jpg">

</body>
</html>