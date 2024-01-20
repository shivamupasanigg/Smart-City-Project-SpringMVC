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
	<link rel="stylesheet" href="<c:url value='/resources/UserCSSFile/UserProfile.css' />">
	
	<!-- Include jQuery -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	
  <!-- JQUERY File Link -->
	<script src="<c:url value='/resources/UserJsFile/UserProfileJs.js' />"></script>
	
	<title>User Profile</title>
</head>
<body>
<!-- Load header -->
     <div id="UserHeaderContainer"></div>
     
     <!-- Load main -->
     <div class="main">
    <div class="container">
     <div class="card">
        <div class="infos">
          <div class="name">
          	<!--<h1>${getuserprofile.id}</h1>-->
            <h1>User Profile</h1>
            <h2>Full Name :</h2>
            <h4>${getuserprofile.fullname}</h4>
            <h2>Username :</h2>
            <h4>${getuserprofile.username}</h4>
          </div>
          <div class="links">
            <a href="UserforgotPassword?id=${getuserprofile.id}" class="follow">Edit Profile</a>
          </div>
        </div>
      </div>
  </div>
</div>
<br>
     
     <!-- Load header -->
     <div id="UserFooterContainer"></div>
</body>
</html>