<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Client</title>
</head>
<body>

<form action="register" method="post">
		<input type="text" name="clientName" placeholder="Enter Client Name">
		<input type="text" name="age" placeholder="Enter Age"> 
		<input type="text" name="occupation" placeholder="Enter Occupation">
		<input type="text" name="problem" placeholder="Enter Problem">
		
		<button type="submit">Submit</button>

	</form>
	
<h2>${isUserNameValid}</h2>
<h2>${isEmailValid}</h2>
<h2>${isPasswordValid}</h2>

</body>
</html>