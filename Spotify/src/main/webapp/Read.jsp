<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read Songs</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" 
        href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
        
<style>
.
</style>

</head>
<body>

	<h1>Read All Songs...</h1>

	<form action="read" method="get">
		<button type="submit" class="btn btn-success">Display Songs</button>
	</form>

	<table class="table">
		<tr>
			<th>Song Name</th>
			<th>Artist Name</th>
			<th>Ratings</th>
			<th>Album</th>
			<th>Composed By</th>
		</tr>
		<c:forEach var="dtos" items="${readList}">

			<tr>
				<td><h5>${dtos.songName}</h5></td>
				<td><h5>${dtos.artist}</h5></td>
				<td><h5>${dtos.ratings}</h5></td>
				<td><h5>${dtos.album}</h5></td>
				<td><h5>${dtos.composer}</h5></td>
			</tr>

		</c:forEach>
	</table>
	<br>
	<br>

	<form action="find" method="get">
		<input type="text" name="songName" placeholder="Enter Song Name"><br>
		<button type="submit" class="btn btn-warning">Search Songs</button>

		<h2>${IsSongNameValid}</h2>
		<h2>${SongNotFound}</h2>
	</form>

	<h3>${dto.songName}</h3>
	<h5>${dto.artist}</h5>
	<h5>${dto.ratings}</h5>
	<h5>${dto.album}</h5>
	<h5>${dto.composer}</h5>

</body>
</html>