<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create</title>

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
					<div class="card-header" id="header">Create a Book</div>
					<div class="card-body">
					
						<form action="create" method="post">
							<div class="form-group">
								<label for="bookName">Book Name</label> <input type="text"
									name="bookName" class="form-control" id="bookName"
									placeholder="Enter Book Name">
							</div>
							<h6 class="model">${IsBookNameValid}</h6>
						
							
							<div class="form-group">
								<label for="author">Author</label> <input type="text"
									name="author" class="form-control" id="author"
									placeholder="Enter Author Name">
							</div>
							<h6 class="model">${IsAuthorValid}</h6>

							<div class="form-group">
								<label for="publisher">Publisher</label> <input type="text"
									name="publisher" class="form-control" id="publisher"
									placeholder="Enter Publisher">
							</div>
							<h6 class="model">${IsPublisherValid}</h6>

							<div class="form-group">
								<label for="publishedIn">Published In</label> <input type="number"
									name="publishedIn" class="form-control" id="publishedIn"
									placeholder="Enter Published In">
							</div>
							<h6 class="model">${IsPublishedYearValid}</h6>

							<div class="form-group">
								<label for="language">Language</label> <input type="text"
									name="language" class="form-control" id="language" placeholder="Enter  Language">
							</div>

							<h6 class="model">${IsLanguageValid}</h6>
							
							<div class="form-group">
								<label for="content">Content</label> <input type="text"
									name="content" class="form-control" id="content" placeholder="Enter  Content">
							</div>

							<h6 class="model">${IsContentValid}</h6>

							<button type="submit" class="btn btn-success">Create</button>
							
							<h6>${BookExist}</h6>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<h5 class="model">${dto}</h5>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>