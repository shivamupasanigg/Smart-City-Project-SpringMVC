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
	<script src="<c:url value='/resources/AdminJsFile/AddMetro.js' />"></script>
	<!--=============== CSS ===============-->
<link rel="stylesheet"
	href="<c:url value='/resources/AdminCSSFile/AddMetro.css' />">
<title>Add Metro Stations</title>
<script>
	// validation js code
        function validateForm() {
        	var name = document.getElementById("metroname").value;
            var address = document.getElementById("metroaddress").value;
            var imgone = document.getElementById("imgone");
            var imgtwo = document.getElementById("imgtwo");
            
            if (name.trim() === "") {
                alert("Name of Metro Station is required");
                return false;
            }

            // address validation
            if (address.trim() === "") {
                alert("Metro Station Address is required");
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
     
     <!-- Load Main Code insertBRTS -->
     <div class="main">
        <form action="insertMetro" method="post" enctype="multipart/form-data" onsubmit="return validateForm()">
        <div class="container">
            
            <h1>Add Metro Stations</h1>
            <hr>
            <label for=""><b>Metro Stations Name <span class="validation">*</span></b></label>
            <input type="text" placeholder="Enter metro Station Name" name="metroname" id="metroname" autocomplete="off">
            <br>
            <label for=""><b>Metro Station Address <span class="validation">*</span></b></label>
            <textarea id="metroaddress" name="metroaddress" rows="3" cols="20" placeholder="Metro Station Address"></textarea>
            <br>
            <label for=""><b>Add 2 Photo <span class="validation">*</span></b></label>
            <br>
            <input type="file" id="imgone" name="imgone">
            <br>
            <input type="file" id="imgtwo" name="imgtwo">
            <br>
            <hr>
            <button type="submit" class="registerbtn">Add Metro Stations</button>

        </div>
    </form>
</div>
     
     <!-- Load footer -->
     <div id="footerContainer"></div>

</body>
</html>