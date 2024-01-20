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

<title>Admin Profile</title>
<!-- Include jQuery -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	
	<!-- JQUERY File Link -->
	<script src="<c:url value='/resources/AdminJsFile/AdminProfile.js' />"></script>
	<!--=============== CSS ===============-->
<link rel="stylesheet"
	href="<c:url value='/resources/AdminCSSFile/AdminProfileCss.css' />">

</head>
<body>
<!-- Load header -->
     <div id="headerContainer"></div>
     
     
<div class="main">
    <div class="container">
     <div class="card">
        <div class="infos">
          <div class="name">
          
            <h1>Admin Profile</h1>
            <h2>Username:</h2>
            <h4>${getadmindata.username}</h4>
          </div>
          <div class="links">
            <a href="AdminforgotPassword?id=${getadmindata.id}" class="follow">Update Password</a>
          </div>
        </div>
      </div>
  </div>
</div>
<!-- Load footer -->
     <div id="footerContainer"></div>
</body>
</html>