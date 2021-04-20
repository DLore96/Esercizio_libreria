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
	<%Libro libroInPage=(Libro)request.getAttribute("libro_attribute"); %>
	IL LIBRO DA TE INSERITO :
	<%=libroInPage.getTitolo() %>, 
	<%=libroInPage.getGenere() %>, 
	<%=libroInPage.getNumeropagine() %>

	NON  ESISTE<br>
	VUOI AGGIUNGERLO ALL' ELENCO?
	<form action="ExecuteAddLibroServlet" method="post">
		TITOLO:<input type="text" name="titoloinput">
		GENERE:<input type="text" name="genereinput">
		NUMERO PAGINE:<input type="text" name="pagineinput">
		<input type="submit" value="aggiungi">
	</form>
</body>
</html>