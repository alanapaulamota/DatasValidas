<%-- <%@ page errorPage = "erro.jsp" %> --%>
<%@ page isErrorPage = "true" %>
<style><%@include file="/WEB-INF/style/estilo.css"%></style>

<h3>Sorry an exception has occured!</h3>
Exception is: <%= exception %> <br/>

<%
exception.printStackTrace();
%>