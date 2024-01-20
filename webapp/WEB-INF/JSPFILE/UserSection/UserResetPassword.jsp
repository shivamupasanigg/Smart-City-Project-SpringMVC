<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--FAVICON -->
<link rel="shortcut icon"
	href="<c:url value='/resources/IMAGES/favicon1.png' />"
	type="image/x-icon">
	
	<!-- CSS File-->
	<link rel="stylesheet" href="<c:url value='/resources/UserCSSFile/UserEditProfile.css' />">
	
	<!-- Include jQuery -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	
  <!-- JQUERY File Link -->
	<script src="<c:url value='/resources/UserJsFile/UserEditProfileJs.js' />"></script>
	
    <title>User Edit Profile</title>
    
    <script>
	// validation js code
        function validateForm() {
        	var fullname = document.getElementById("full_name").value;
        	var  username = document.getElementById("user_name").value;
            var password = document.getElementById("pass_word").value;
            var confirmpassword = document.getElementById("ConfirmPassword").value;
            // full name validation
            if (fullname.trim() === "") {
                alert("Full Name is required");
                return false;
            }
            // username validation
            if (username.trim() === "") {
                alert("Username is required");
                return false;
            }
            // password validation
            if (password.trim() === "") {
                alert("Password is required");
                return false;
            }
            
            var passwordRegex = /^\d{8}$/;
            if (!passwordRegex.test(password.trim())) {
                alert("Please enter a valid 8-digit password");
                return false;
            }
            // confirm password
            if (confirmpassword.trim() === "") {
                alert("Confirm Password is required");
                return false;
            }
            
            // Check if the passwords match
            if (password !== confirmpassword) {
              alert('ConfirmPassword is not match with Password');
              return false;
            }
            return true; 
        }
    </script>
    
    
</head>
<body>
<!-- Load header -->
     <div id="UserHeaderContainer"></div>
     
      <div class="main">
        <form action="UserEditProfile" method="post" onsubmit="return validateForm()">
        <div class="container">
            <h1>Edit User Profile </h1>
            <hr>
            <input type="hidden" id="id" name="id" value="${getbyid.id}">
            <label for=""><b>Enter Full Name <span class="validation">*</span></b></label>
            <input type="text" placeholder="Enter Full Name" name="full_name" id="full_name" autocomplete="off" />
            
            <br>
            <label for=""><b>Enter New User Name <span class="validation">*</span></b></label>
            <input type="text" placeholder="Enter User Name" name="user_name" id="user_name" autocomplete="off" />
            
            <br>
            <label for=""><b>Enter New Password <span class="validation">*</span></b></label>
            <input type="password" placeholder="Enter Password" name="pass_word" id="pass_word" autocomplete="off" />
            <br>
            <label for=""><b>Enter New Confirm Password <span class="validation">*</span></b></label>
            <input type="password" placeholder="Enter Confirm Password" name="ConfirmPassword" id="ConfirmPassword" autocomplete="off" />
            <br>
            <hr>
            <button type="submit" class="registerbtn">Edit User Profile</button>
        </div>
    </form>
    </div>
     
     <!-- Load header -->
     <div id="UserFooterContainer"></div>
</body>
</html>