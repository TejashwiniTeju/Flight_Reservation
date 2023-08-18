<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body style="background-color:powderblue">
  <h2  style="color:blue;">Login Here</h2>
<form action ="verifyLogin" method ="post">
<pre>
EmailId  <input type = "text" name ="emailId"/>
Password <input type ="text" name = "password"/>
<input type = "submit" value = "Login">
</pre>

</form>

${error}



</body>
</html>