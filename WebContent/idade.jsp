<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style><%@include file="/WEB-INF/style/estilo.css"%></style>
<title>Idade</title>
</head>
<body>Você tem <%= request.getAttribute("idade") %> anos!
</body>
</html>