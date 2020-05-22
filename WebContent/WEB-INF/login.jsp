<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>LoginServlet</title>
</head>
<body>
	<div>Seja bem-vindo!</div>
	<form action="LoginServlet" method="post">
		<input type="text" class="text" value="Digite seu login" name="email">
		Usuario: <input type="text" name="nome"><br> <br>
		Senha: <input type="password" name="senha"><br> <br>
		<input type="submit" value="Acessar"> <input type="reset"
			value="Limpar">

	</form>
</body>
</html>