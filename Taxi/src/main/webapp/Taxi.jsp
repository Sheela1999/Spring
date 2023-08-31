<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Taxi</title>
</head>
<body>

<form action="save" method="get">

<input type="text" name="id" id="id" placeholder="Enter id">
<input type="text" name="taxiNo" id="taxino" placeholder="Enter TaxiNumber">
<input type="text" name="earnings" id="earnings" placeholder="Enter Earnings">
<input type="text" name="isAvailable" id="isAvailable" placeholder="Enter isAvailable">
<input type="text"  name="location" id="location" placeholder="Enter Location">
<input type="text" name="noOfTrips" id="noOfTrips" placeholder=" Enter noOfTrips">
<button type="submit">save</button>

</form>

</body>
</html>