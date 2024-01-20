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
	
	<!-- Include jQuery -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	
	<!-- JQUERY File Link -->
	<script src="<c:url value='/resources/AdminJsFile/AddMalls.js' />"></script>
	<!--=============== CSS ===============-->
<link rel="stylesheet"
	href="<c:url value='/resources/AdminCSSFile/AddMalls.css' />">
	
	<script>
	// validation js code
        function validateForm() {
            var name = document.getElementById("mallname").value;
            var address = document.getElementById("malladdress").value;
            var phone = document.getElementById("mallcontact").value;
            var amtime = document.getElementById("mallamTime").value;
            var pmtime = document.getElementById("mallpmTime").value;
            var imgone = document.getElementById("mallimg1");
            var imgtwo = document.getElementById("mallimg2");
            
            // name validation
            if (name.trim() === "") {
                alert("Name of Mall is required");
                return false;
            }

            // address validation
            if (address.trim() === "") {
                alert("Mall Address is required");
                return false;
            }
            // phone validation
            if (phone.trim() === "") {
                alert("Contact Number is required");
                return false;
            }
			// phone validation with 10 digit
            var phoneRegex = /^\d{10}$/;
            if (!phoneRegex.test(phone.trim())) {
                alert("Please enter a valid 10-digit phone number");
                return false;
            }
            // am timing validation
            if (amtime.trim() === "") {
                alert("Morning Time is required");
                return false;
            }
            // pm time validation
            if (pmtime.trim() === "") {
                alert("Evening Time is required");
                return false;
            }
            // image 1 validation
            if (imgone.files.length === 0) {
                alert("Please select an image file.");
                return false;
            }
			// image 1 only jpg and png
            var fileNameimgone = imgone.files[0].name;
            var fileExtensionone = fileNameimgone.split('.').pop().toLowerCase();

            if (fileExtensionone !== "jpg" && fileExtensionone !== "png") {
                alert("Supported file formats are JPG and PNG.");
                return false;
            }
            
         // image 2 validation
            if (imgtwo.files.length === 0) {
                alert("Please select an image file.");
                return false;
            }

         // image 2 validation
            var fileNameimgtwo = imgtwo.files[0].name;
            var fileExtensiontwo = fileNameimgtwo.split('.').pop().toLowerCase();
            
            if (fileExtensiontwo !== "jpg" && fileExtensiontwo !== "png") {
                alert("Supported file formats are JPG and PNG.");
                return false;
            }
            return true; 
        }
    </script>
     

<title>Add Malls</title>
</head>
<body>
<!-- Load header -->
     <div id="headerContainer"></div>
     
     <!-- Load Main Code insertMalls -->
     <div class="main">
		<form action="insertMalls" method="post" enctype="multipart/form-data" onsubmit="return validateForm()">
			<div class="container">
				<h1>Add Malls</h1>
				<hr>
				<label for=""><b>Name of Mall <span class="validation">*</span></b></label> 
				<input type="text" placeholder="Enter Mall Name" name="mallname" id="mallname" autocomplete="off">
				
				<br> 
				
				<label for=""><b>Mall Address <span class="validation">*</span></b></label>
				<textarea id="malladdress" name="malladdress" rows="3" cols="20" placeholder="Enter Mall Address"></textarea>
				
				<br> 
				
				<label for=""><b>Contact Number <span class="validation">*</span></b></label> 
				<br> 
				<input type="tel" placeholder="Enter Contact Number" name="mallcontact" id="mallcontact" autocomplete="off"> 
				 
				<br> 
				
				<label for=""><b>Morning Time <span class="validation">*</span></b></label> 
				<br> 
				<input type="time" name="mallamTime" id="mallamTime" autocomplete="off"> 
				
				<br> 
				
				<label for=""><b>Evening Time <span class="validation">*</span></b></label> 
				<br> 
				<input type="time" name="mallpmTime" id="mallpmTime" autocomplete="off"> 
				<br> 
				<label for=""><b>Add 2 Photos <span class="validation">*</span></b></label> 
				<br> 
				<input type="file" name="mallimg1" id="mallimg1">
				
				<br>
				<input type="file" name="mallimg2" id="mallimg2"> 

				<hr>
				<button type="submit" class="registerbtn">Add Malls</button>
			</div>
		</form>
	</div>
     
      <!-- Load footer -->
     <div id="footerContainer"></div>
     
</body>
</html>