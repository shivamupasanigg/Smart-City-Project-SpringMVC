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
	<!--=============== CSS ===============-->
<link rel="stylesheet"
	href="<c:url value='/resources/CSSFILE/IndexPageLoader.css' />">
<title>Smart City</title>
</head>
<body>
<div class="loader">
        <div class="bounce1"></div>
        <div class="bounce2"></div>
        <div class="bounce3"></div>
        <div class="logo">
            <img src="<c:url value='/resources/IMAGES/favicon1.png' />" alt="" />
        </div>
    </div>
    
    <script>
         setTimeout(function () {
        window.location = "UserHome";
    }, 2000); 
    </Script>
</body>
</html>