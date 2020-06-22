<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Crud JSP</title>
</head>
<body>
	<h1>CRUD JSP</h1>
	<form action="Servlet" method="post">
		<table border="1">
			Nome
			<Input type='text' name='nome'> Data de Nascimento
			<Input type='text' name='DataNascimento'> Email
			<Input type='text' name='email'> Senha
			<Input type='text' name='senha'>
			<Input type='submit' value='Inserir'>
			</form>
			<a href="welcome.jsp">Voltar</a>
</body>
</html>