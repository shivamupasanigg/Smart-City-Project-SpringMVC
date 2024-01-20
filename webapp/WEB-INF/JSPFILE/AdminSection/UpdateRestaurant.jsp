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
<title>Update Restaurants</title>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	
	<!-- JQUERY File Link -->
	<script src="<c:url value='/resources/AdminJsFile/UpdateRestaurant.js' />"></script>
	<!--=============== CSS ===============-->
<link rel="stylesheet"
	href="<c:url value='/resources/AdminCSSFile/UpdateRestaurant.css' />">

<script>
	// validation js code
        function validateForm() {
            var name = document.getElementById("restaurentname").value;
            var address = document.getElementById("restaurentaddress").value;
            var dish = document.getElementById("restaurentdishes").value;
            var phone = document.getElementById("restaurentcontact").value;
            var amtime = document.getElementById("restaurentAmTime").value;
            var pmtime = document.getElementById("restaurentPmTime").value;
            var imgone = document.getElementById("restaurentimgone");
            var imgtwo = document.getElementById("restaurentimgtwo");
            
            // name validation
            if (name.trim() === "") {
                alert("Name of Restaurant is required");
                return false;
            }

            // address validation
            if (address.trim() === "") {
                alert("Restaurant Address is required");
                return false;
            }
            
         // dish validation
            if (dish.trim() === "") {
                alert("Restaurant dishes is required");
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
     
     <!-- Load Main Code insert restaurant -->
<div class="main">
        <form action="updateRestaurant" method="post" enctype="multipart/form-data" onsubmit="return validateForm()">
        <div class="container">
            
            <h1>Update Restaurant</h1>
            <hr>
            <input type="hidden" name="id" id="id" value="${updaterestro.id}" autocomplete="off">
            <label for=""><b>Name of Restaurant <span class="validation">*</span></b></label>
            <input type="text" placeholder="Enter Restaurant Name" name="restaurentname" id="restaurentname" value="${updaterestro.restaurant_name}"  autocomplete="off">
            <br>
            <label for=""><b>Restaurants Address <span class="validation">*</span></b></label>
            <textarea id="restaurentaddress" name="restaurentaddress" rows="3" cols="20" placeholder="Enter Restaurant Address">${updaterestro.restaurant_address}</textarea>
            <br>
            <label for=""><b>Restaurant Cuisines <span class="validation">*</span></b></label>
            <textarea id="restaurentdishes" name="restaurentdishes" rows="4" cols="20" placeholder="Enter Restaurant Cuisines">${updaterestro.restaurant_dishes}</textarea>
            <br>
            <label for=""><b>Contact Number <span class="validation">*</span></b></label>
            <br>
            <input type="tel" placeholder="Enter Contact Number" name="restaurentcontact" id="restaurentcontact" value="${updaterestro.restaurant_phone}" autocomplete="off">
            <br>
            <label for=""><b>Morning Time <span class="validation">*</span></b></label>
            <br>
            <input type="time" name="restaurentAmTime" id="restaurentAmTime" value="${updaterestro.restaurant_amtime}" autocomplete="off">
            <br>
            <label for=""><b>Evening Time <span class="validation">*</span></b></label>
            <br>
            <input type="time" name="restaurentPmTime" id="restaurentPmTime" value="${updaterestro.restaurant_pmtime}" autocomplete="off">
            <br>
            <label for=""><b>Add 2 Photos <span class="validation">*</span></b></label>
            <br>
            <input type="file" id="restaurentimgone" name="restaurentimgone">
            <br>
            <input type="file" id="restaurentimgtwo" name="restaurentimgtwo">
            <br>

            <hr>
            <button type="submit" class="registerbtn">Update Restaurants</button>

        </div>
    </form>
</div>

 <!-- Load footer -->
     <div id="footerContainer"></div>
</body>
</html>