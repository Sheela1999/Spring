<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
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
</style>
</head>
<body>
	
	<div class="container mt-5">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <h2 class="text-center">Student Registration Form</h2>
                <form action="add" method="post">
                   
                    <div class="form-group">
                        <label for="name"> </label>
                        <input type="text"  name = "name" class="form-control" id="name" placeholder="Full Name">
                    </div>
                    <h4 class="model">${IsNameValid}</h4>
                    
                    <div class="form-group">
                        <label for="email"> </label>
                        <input type="email" name = "email" class="form-control" id="email" placeholder="Email Address">
                    </div>
                    <h4 class="model">${IsEmailValid}</h4>
                    
                    <div class="form-group">
                        <label for="phoneNo"> </label>
                        <input type="tel" name = "phoneNo" class="form-control" id="phoneN0" placeholder="Phone Number">
                    </div>
                    <h4 class="model">${IsPhoneNoValid}</h4>
                    
                    <div class="form-group">
						<label for="fatherName"> </label> 
						<input type="text" class="form-control" id= "FatherName" name="fatherName" placeholder="Father Name">
							</div>
						<h4 class="model">${IsFatherNameValid}</h4>

						<div class="form-group">
							<label for="motherName">
						 </label> <input type="text" class="form-control" id = "motherName" name="motherName" placeholder="Mother Name">
								</div>
							<h4 class="model">${IsMotherNameValid}</h4>
							
                    <div class="form-group">
                        <label for="dateOfBirth"> </label>
                        <input type="date" Name = "dateOfBirth" class="form-control" id="dateOfBirth" placeholder="Date Of Birth">
                    </div>
                    <h4 class="model">${IsDateOfBirthValid}</h4>

                    <div class="form-group">
                        <label for="location"> </label>
                        <input type = "text" name = "location" class="form-control" id="location" placeholder="location">
                    </div>
                    <h4 class="model">${IsLocationValid}</h4>
                    
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
                <h4 class="model">${dto}</h4>
            </div>
        </div>
    </div>
    
    <!-- Include Bootstrap JS and jQuery links -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	
</body>
</html>