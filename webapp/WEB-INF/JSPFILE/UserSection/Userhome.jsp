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
	<link rel="stylesheet" href="<c:url value='/resources/UserCSSFile/UserHome.css' />">
	
	<!-- Include jQuery -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	
	     <!-- JQUERY File Link -->
	<script src="<c:url value='/resources/UserJsFile/UserHomeJs.js' />"></script>
	
	<title>User Home</title>
</head>
<body>

<!-- Load header -->
     <div id="UserHeaderContainer"></div>
     
     <!-- Load main -->
     <div class="main">
          <div class="home">
               <h1 class="swift-up-text"><span>Welcome To User Panel</span></h1>
               <h1 class="swift-up-text"><i>Explore Yourself</i></h1>
          </div>
     </div>
     
     
      
     
     <!-- Load header -->
     <div id="UserFooterContainer"></div>

</body>
</html>