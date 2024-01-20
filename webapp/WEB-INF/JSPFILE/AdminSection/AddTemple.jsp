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
<title>Add Temple</title>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	
	<!-- JQUERY File Link -->
	<script src="<c:url value='/resources/AdminJsFile/AddTemple.js' />"></script>
	<!--=============== CSS ===============-->
<link rel="stylesheet"
	href="<c:url value='/resources/AdminCSSFile/AddTemple.css' />">
	
	<script>
	// validation js code
        function validateForm() {
            var name = document.getElementById("templename").value;
            var address = document.getElementById("templeaddress").value;
            var phone = document.getElementById("templecontact").value;
            var amtime = document.getElementById("templeamtime").value;
            var pmtime = document.getElementById("templepmtime").value;
            var imgone = document.getElementById("templeimgone");
            var imgtwo = document.getElementById("templeimgtwo");
            
            // name validation
            if (name.trim() === "") {
                alert("Name of Temple is required");
                return false;
            }

            // address validation
            if (address.trim() === "") {
                alert("Temple Address is required");
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
     
     <div class="main">
        <form action="insertTemple" method="post" enctype="multipart/form-data" onsubmit="return validateForm()">
        <div class="container">
            <h1>Add Temple</h1>
            <hr>
            <label for=""><b>Name of Temple <span class="validation">*</span></b></label>
            <input type="text" placeholder="Enter Temple Name" name="templename" id="templename" autocomplete="off">
            <br>
            <label for=""><b>Temple Address <span class="validation">*</span></b></label>
            <textarea id="templeaddress" name="templeaddress" rows="3" cols="20" placeholder="Enter Temple address"></textarea>
            <br>
            <label for=""><b>Contact number <span class="validation">*</span></b></label>
            <br>
            <input type="tel" placeholder="Enter Contact Number" name="templecontact" id="templecontact" autocomplete="off">
            <br>
            <label for=""><b>Morning Time <span class="validation">*</span></b></label>
            <br>
            <input type="time" name="templeamtime" id="templeamtime" autocomplete="off">
            <br>
            <label for=""><b>Evening Time <span class="validation">*</span></b></label>
            <br>
            <input type="time" name="templepmtime" id="templepmtime" autocomplete="off">
            <br>
            <label for=""><b>Add 2 Photos <span class="validation">*</span></b></label>
            <br>
            <input type="file" id="templeimgone" name="templeimgone">
            <br>

            <input type="file" id="templeimgtwo" name="templeimgtwo">
            <br>

            <hr>
            <button type="submit" class="registerbtn">Add Temple</button>

        </div>
    </form>
</div>
     
     <!-- Load footer -->
     <div id="footerContainer"></div>
</body>
</html>