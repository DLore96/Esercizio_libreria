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
	<%Libro libroInPage=(Libro)request.getAttribute("esito_attribute"); %>
	TITOLO :<%=libroInPage.getTitolo() %><br>
	GENERE :<%=libroInPage.getGenere() %><br>
	PAGINE :<%=libroInPage.getNumeropagine() %>
	INSERIMENTO EFFETTUATO!
	<a href="cercalibro.jsp">home</a>
</body>
</html>