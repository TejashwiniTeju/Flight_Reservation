<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search flights</title>
</head>

<body style="background-color:lightgreen">
 <h2 style="Blue"> Find Flights</h2>
<form action = "findFlights" method = "post">
<pre>
FROM: <input type ="text" name = "from"/>
TO: <input type ="text" name = "to"/>
DEPARTURE DATE:<input type = "text" name = "departureDate"/>
<input type = "Submit" value = "Search"/>
</pre>
</form>
</body>
</html>