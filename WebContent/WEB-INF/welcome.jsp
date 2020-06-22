<%@page import="com.alana.web.servlet.model.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="com.alana.web.servlet.dao.UsuarioDao"%>
<%@ page import="java.util.List"%>
<%@ page import="com.alana.web.servlet.model.Usuario"%>

<html>
<head>
<meta http-equiv="Content-Type" content=text/html; charset="UTF-8">
<title>Usuarios</title>
</head>
<body>
	<a hrefcadastro.jsp">Inserir Usuario</a> <%
 	UsuarioDao dao = new UsuarioDao();
 List<Usuario> usuarios = dao.listar();
 %>

	<table border"1" rules="all">

		<tr>
			<td>Nome</td>
			<td>DataNascimento</td>
			<td>Email</td>
			<td>Senha</td>
		</tr>
		<%
			for (int i = 0; i < usuarios.size(); i++) {
			Usuario usuario = usuarios.get(i);
		%>
		<tr>
			<td><%=usuario.getNome()%></td>
			<td><%=usuario.getDataNascimento()%></td>
			<td><%=usuario.getEmail()%></td>
			<td><%=usuario.getSenha()%></td>
			<td><a href="cadastrojsp?id=<%=usuario.getId()%>">Alterar</a></td>
		</tr>
		<%}%>
	</table>
</body>
</html>