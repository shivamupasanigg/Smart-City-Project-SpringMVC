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

<title>Update Most Visited Place</title>
<!-- Include jQuery -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	
	<!-- JQUERY File Link -->
	<script src="<c:url value='/resources/AdminJsFile/UpdateMostVisitedPlace.js' />"></script>
	<!--=============== CSS ===============-->
<link rel="stylesheet"
	href="<c:url value='/resources/AdminCSSFile/UpdateMostVisitPlace.css' />">


<script>
	// validation js code
        function validateForm() {
            var name = document.getElementById("placename").value;
            var address = document.getElementById("placeaddress").value;
            var phone = document.getElementById("placecontact").value;
            var amtime = document.getElementById("amTime").value;
            var pmtime = document.getElementById("pmTime").value;
            var imgone = document.getElementById("img1");
            var imgtwo = document.getElementById("img2");
            
            // name validation
            if (name.trim() === "") {
                alert("Name of Place is required");
                return false;
            }

            // address validation
            if (address.trim() === "") {
                alert("Place Address is required");
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
</head>
<body>
<!-- Load header -->
     <div id="headerContainer"></div>
     
     <!-- Load Main Code -->
     <div class="main">
		<form action="update" method="post" enctype="multipart/form-data" onsubmit="return validateForm()">
			<div class="container">
				<h1>Update Most Visited Place</h1>
				<hr>
				<!-- <label for=""><b>ID<span class="validation">*</span></b></label>--> 
				<input type="hidden" id="id" name="id" value="${MostVisitedPlaceData.id}">
				<label for=""><b>Name of Place <span class="validation">*</span></b></label> 
				<input type="text" placeholder="Enter Place Name" name="placename" id="placename" autocomplete="off" value="${MostVisitedPlaceData.place_name}">
				
				<br> 
				
				<label for=""><b>Place Address <span class="validation">*</span></b></label>
				<textarea id="placeaddress" name="placeaddress" rows="3" cols="20" placeholder="Enter place address">${MostVisitedPlaceData.place_address}</textarea>
				
				<br> 
				
				<label for=""><b>Contact Number <span class="validation">*</span></b></label> 
				<br> 
				<input type="tel" placeholder="Enter Contact Number" name="placecontact" id="placecontact" autocomplete="off" value="${MostVisitedPlaceData.place_phone}"> 
				 
				<br> 
				
				<label for=""><b>Morning Time <span class="validation">*</span></b></label> 
				<br> 
				<input type="time" name="amTime" id="amTime" autocomplete="off" value="${MostVisitedPlaceData.place_amtiming}"> 
				
				<br> 
				
				<label for=""><b>Evening Time <span class="validation">*</span></b></label> 
				<br> 
				<input type="time" name="pmTime" id="pmTime" autocomplete="off" value="${MostVisitedPlaceData.place_pmtiming}"> 
				<br> 
				<label for=""><b>Add 2 Photos <span class="validation">*</span></b></label> 
				<br> 
				<input type="file" name="img1" id="img1">
				
				<br>
				<input type="file" name="img2" id="img2"> 

				<hr>
				<button type="submit" class="registerbtn">Update Most Visited Place</button>
			</div>
		</form>
	</div>
     
     <!-- Load footer -->
     <div id="footerContainer"></div>
</body>
</html>