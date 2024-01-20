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
	<script src="<c:url value='/resources/AdminJsFile/UpdateBRTS.js' />"></script>
	<!--=============== CSS ===============-->
<link rel="stylesheet"
	href="<c:url value='/resources/AdminCSSFile/UpdateBRTS.css' />">
<title>Update BRTS Stations</title>
<script>
	// validation js code
        function validateForm() {
        	var name = document.getElementById("stationname").value;
            var address = document.getElementById("stationaddress").value;
            var imgone = document.getElementById("imgone");
            var imgtwo = document.getElementById("imgtwo");
            
            if (name.trim() === "") {
                alert("Name of BRTS Station is required");
                return false;
            }

            // address validation
            if (address.trim() === "") {
                alert("BRTS Station Address is required");
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
        <form action="updateBRTS" method="post" enctype="multipart/form-data" onsubmit="return validateForm()">
        <div class="container">
            
            <h1>Update BRTS Stations</h1>
            <hr>
            <input type="hidden" placeholder="Enter ID" name="id" id="id" autocomplete="off" value="${updatebrts.id}">
            <label for=""><b>BRTS Stations Name <span class="validation">*</span></b></label>
            <input type="text" placeholder="Enter BRTS Station Name" name="stationname" id="stationname" value="${updatebrts.brts_Station_name}" autocomplete="off">
            <br>
            <label for=""><b>BRTS Station Address <span class="validation">*</span></b></label>
            <textarea id="stationaddress" name="stationaddress" rows="3" cols="20" placeholder="BRTS Station Address">${updatebrts.brts_Station_address}</textarea>
            <br>
            <label for=""><b>Add 2 Photo <span class="validation">*</span></b></label>
            <br>
            <input type="file" id="imgone" name="imgone">
            <br>
            <input type="file" id="imgtwo" name="imgtwo">
            <br>
            <hr>
            <button type="submit" class="registerbtn">Update BRTS Stations</button>

        </div>
    </form>
</div>
     
     <!-- Load footer -->
     <div id="footerContainer"></div>

</body>
</html>