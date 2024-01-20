<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<!--=============== FAVICON ===============-->
   <link rel="shortcut icon" href="<c:url value='/resources/IMAGES/favicon1.png' />" type="image/x-icon">
   <!--=============== CSS ===============-->
   <link rel="stylesheet" href="<c:url value='/resources/AdminCSSFile/AdminProfileResetPassword.css' />">
   
   <script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	
	<!-- JQUERY File Link -->
	<script src="<c:url value='/resources/AdminJsFile/AdminProfileResetPassword.js' />"></script>
<title>Admin Reset Password</title>

<script>
	// validation js code
        function validateForm() {
            var password = document.getElementById("newPassword").value;
            
            // name validation
            if (password.trim() === "") {
                alert("Password is required");
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
    <form action="adminprofileupdatepassword" method="post" onsubmit="return validateForm()">
    <div class="container">
        <h1>Reset Password</h1>
        <hr>
        <input type="hidden" id="adminId" name="adminId" value="${getbyid.id}">
        <label for=""><b>New Password <span class="validation">*</span></b></label>
        <input type="password" placeholder="Enter New Password" name="newPassword" id="newPassword" autocomplete="off"/>
        <br>
        <hr>
        <button type="submit" class="registerbtn">Reset Password</button>
    </div>
</form>
</div>
     
     <!-- Load footer -->
     <div id="footerContainer"></div>
</body>
</html>