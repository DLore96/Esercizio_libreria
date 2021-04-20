<%@page import="it.prova.cercalibri.model.Libro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	ECCO IL LIBRO DA TE RICHIESTO:<BR>
	<%Libro libroInPage=(Libro)request.getAttribute("libro_attribute"); %>
	TITOLO :<%=libroInPage.getTitolo() %><br>
	GENERE :<%=libroInPage.getGenere() %><br>
	PAGINE: <%=libroInPage.getNumeropagine() %>
	BUONA LETTURA!
	<a href="cercalibro.jsp">home</a>
</body>
</html>