<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World Java EE</title>
</head>
<body>
	<h1> Jingle all the wayy!</h1>
	<form action="helloServlet" method="post">
		Hows the Josh <input type="text" name="inputText" size="10">
		<input type="submit" value="Call Servlet" />
	</form>
</body>
</html>