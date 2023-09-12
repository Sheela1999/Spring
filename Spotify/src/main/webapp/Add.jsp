<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add songs</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.model {
	color: red;
}

#header {
	background-color: maroon;
	color: white;
	text-align: center;
	font-weight: bolder;
}

.h6 {
    color: red;
}

.model1{
color:red;
text-align: center;

}
</style>
</head>
<body>

   <h6 class="model1">${dtoValidate}</h6>
	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<div class="card">
					<div class="card-header" id="header">Add a Song</div>
					<div class="card-body">
					
					

						<form action="add" method="post">
							<div class="form-group">
								<label for="songName">Song Name</label> <input type="text"
									name="songName" class="form-control" id="songName"
									placeholder="Enter song Name">
							</div>
							<h6 class="model">${IsSongValid}</h6>
						
							
							<div class="form-group">
								<label for="artist">Artist Name</label> <input type="text"
									name="artist" class="form-control" id="artist"
									placeholder="Enter Artist Name">
							</div>
							<h6 class="model">${IsArtistNameValid}</h6>

							<div class="form-group">
								<label for="ratings">Ratings</label> <input type="number"
									name="ratings" class="form-control" id="ratings"
									placeholder="Enter Ratings">
							</div>
							<h6 class="model">${IsRatingValid}</h6>

							<div class="form-group">
								<label for="album">Album</label> <input type="text"
									name="album" class="form-control" id="album"
									placeholder="Enter album">
							</div>
							<h6 class="model">${IsAlbumValid}</h6>

							<div class="form-group">
								<label for="composer">Composer</label> <input type="text"
									name="composer" class="form-control" id="composer" placeholder="Enter  Composer">
							</div>

							<h6 class="model">${IsComposerValid}</h6>

							<button type="submit" class="btn btn-success">Submit</button>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>