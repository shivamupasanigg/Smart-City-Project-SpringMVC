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
<title>Update Hospital</title>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	
	<!-- JQUERY File Link -->
	<script src="<c:url value='/resources/AdminJsFile/UpdateHospital.js' />"></script>
	<!--=============== CSS ===============-->
<link rel="stylesheet"
	href="<c:url value='/resources/AdminCSSFile/UpdateHospital.css' />">
	
	<script>
	// validation js code
        function validateForm() {
            var name = document.getElementById("hospitalname").value;
            var address = document.getElementById("hospitaladdress").value;
            var facility = document.getElementById("hospitalfacility").value;
            var phone = document.getElementById("hospitalcontact").value;
            var time = document.getElementById("hospitaltime").value;
            var imgone = document.getElementById("hospitalimgone");
            var imgtwo = document.getElementById("hospitalimgtwo");
            
            // name validation
            if (name.trim() === "") {
                alert("Name of Hospital is required");
                return false;
            }

            // address validation
            if (address.trim() === "") {
                alert("Hospital Address is required");
                return false;
            }
            
         // facility validation
            if (facility.trim() === "") {
                alert("Hospital Facility is required");
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
            if (time.trim() === "") {
                alert("Hospital Time is required");
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
        <form action="updateHospital" method="post" enctype="multipart/form-data" onsubmit="return validateForm()">
        <div class="container">
            <h1>Update Hospital</h1>
            <hr>
            <input type="hidden" name="id" id="id" value="${listhospital.id}" autocomplete="off">
            <label for=""><b>Name of Hospital <span class="validation">*</span></b></label>
            <input type="text" placeholder="Enter Hospital Name" name="hospitalname" id="hospitalname" value="${listhospital.hospital_name}"  autocomplete="off">
            <br>
            <label for=""><b>Hospital Address <span class="validation">*</span></b></label>
            <textarea id="hospitaladdress" name="hospitaladdress" rows="3" cols="20" placeholder="Enter Hospital Address">${listhospital.hospital_address}</textarea>
            <br>
            <label for=""><b>Hospital Facility <span class="validation">*</span></b></label>
            <textarea id="hospitalfacility" name="hospitalfacility" rows="3" cols="20" placeholder="Enter Hospital Facility">${listhospital.hospital_facility}</textarea>
            <br>
            <label for=""><b>Contact number <span class="validation">*</span></b></label>
            <br>
            <input type="tel" placeholder="Enter Contact Number" name="hospitalcontact" id="hospitalcontact" value="${listhospital.hospital_phone}"  autocomplete="off">
            <br>
            <label for=""><b>Hospital  Timing <span class="validation">*</span></b></label>
            <br>
            <input type="text" placeholder="Enter Hospital Time" name="hospitaltime" id="hospitaltime" value="${listhospital.hospital_time}" autocomplete="off">
            <br>
            <label for=""><b>Add 2 Photos <span class="validation">*</span></b></label>
            <br>
            <input type="file" id="hospitalimgone" name="hospitalimgone">
            <br>
            <input type="file" id="hospitalimgtwo" name="hospitalimgtwo">
            <br>

            <hr>
            <button type="submit" class="registerbtn">Update Hospital</button>

        </div>
    </form>
</div>
     
     <!-- Load footer -->
     <div id="footerContainer"></div>
</body>
</html>