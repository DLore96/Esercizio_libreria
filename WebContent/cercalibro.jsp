<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina di ricerca</title>
</head>
<body>
	BENVENUTO, CHE LIBRO STAI CERCANDO?: <br>
	<form action="ExceuteRicercaLibroServlet" method="post">
		TITOLO:<input type="text" name="titoloinput">
		GENERE:<input type="text" name="genereinput">
		NUMERO PAGINE:<input type="text" name="pagineinput">
		<input type="submit" value="cerca">
		</form>
</body>
</html>