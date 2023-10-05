<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignIn Page</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<style type="text/css">
.model {
	color: red;
}

#header {
	background-color: maroon;
	color: white;
	text-align: center;
	font-weight: bolder;
}

.h4 {
	color: red;
}

#button {
     text-align: center;
}

#land {
    color: white;
}

button{
    width: 100%;
    margin-bottom: 15px;
    color: #fff;
    font-size: 20px;
    font-weight: 600;
    border-radius: 5px;
    border: none;
    padding: 13px 0;
    cursor: pointer;
    background: #166fe5;
}

#home {
	color: white;
	padding-left: 800px;
	
}

</style>

</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-dark">
    <div class="container">
        <a class="navbar-brand" id="land" href="#">LandRecords</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" id="home" href="SignIn.jsp">Home</a>
					</li>
				</ul>
        </div>
    </div>
</nav>

<!-- Add Bootstrap JS (Popper.js and jQuery are required) -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

	<div class="container mt-5">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<form action="login" method="get">

					<div class="form-group">
						<label for="adminName"> </label> <input type="text" name="adminName"
							class="form-control" id="adminName" placeholder="Admin Name">
					</div>
					<h4 class="model">${IsAdminNameValid}</h4>

					<div class="form-group">
						<label for="email"> </label> <input type="email" name="email"
							class="form-control" id="email" placeholder="Email Address">
					</div>
					<h4 class="model">${IsEmailValid}</h4>
					
					<div class="form-group">
						<label for="otp"> </label> <input type="number" name="otp"
							class="form-control" id="otp" placeholder="Enter OTP">
					</div>
					<h4 class="model">${IsOTPvalid}</h4>
					
					<button type="submit" class="btn btn-primary">SignIn</button>
				</form>
				<h4 class="model">${IsValidData}</h4>
			</div>
		</div>
	</div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    
    <footer class="footer bg-dark text-light py-3">
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <p><a href="sheela.xworkz@gmail.com">&copy; 2023 LandRecorder. All rights reserved.</a></p>
                </div>
                <div class="col-md-6 text-right">
                    <p><a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a></p>
                </div>
            </div>
        </div>
    </footer>

</body>
</html>