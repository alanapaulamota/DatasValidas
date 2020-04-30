<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ProjetoServlet</title>

<style><%@include file="/WEB-INF/style/estilo.css"%></style>

</head>
<body>
		<h2>Calcule sua idade:</h2>
		Digite sua data de nascimento e pressione o botão:<br><br>
		<form action="IdadeServlet" method="post">
			Data: <input type="text" name="data" /> <input type="submit" />
		</form>

</body>
</html>

