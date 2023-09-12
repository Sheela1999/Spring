<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>

<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.card-header {
	background-color: blue;
	text-transform: capitalize;
	font-weight: bolder;
	text-align: center;
	color: white;
	font-size: larger;
}

#dataSaved {
	text-align: center;
	color: green;
}

#card {
	background: lime;
}

#url {
	color: red;
}
</style>
</head>
<body>

	<h1 id="dataSaved">Songs Info Saved Successfully</h1>

	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<div class="card" id="card">
					<div class="card-header">Song Details</div>
					<div class="card-body">
						<h5 class="card-title">Song Name : ${ dto.songName }</h5>
						<p class="card-text">Artist Name: ${ dto.artist }</p>
						<p class="card-text">Ratings: ${dto.ratings }</p>
						<p class="card-text">Album: ${dto.album }</p>
						<p class="card-text">ComposedBy: ${dto.composer}</p>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Add Bootstrap JS and jQuery scripts here (required for Bootstrap functionality) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		
</body>
</html>