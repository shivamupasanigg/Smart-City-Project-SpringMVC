<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

   <!--=============== FAVICON ===============-->
   <link rel="shortcut icon" href="<c:url value='/resources/IMAGES/favicon1.png' />" type="image/x-icon">

   <!--=============== REMIXICONS ===============-->
   <link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"/>

   <!--=============== CSS ===============-->
   <link rel="stylesheet" href="<c:url value='/resources/AdminCSSFile/Admin.css' />">
   
   <script type="text/javascript">
	window.history.forward();
	</script>
	
<title>Smart City</title>
</head>
<body>
<img class="wave" src="<c:url value='/resources/IMAGES/wave.png' />">
	<div class="container">
		<div class="img">
			<img src="<c:url value='/resources/IMAGES/bg.svg' />">
		</div>
		<div class="login-content">
			<form:form method="post" action="Login" modelAttribute="adminlogin">
                <h2 class="title">SMART CITY</h2>
				<h2 class="title">Admin Panel</h2>
				<div class="input-div one">
					<div class="i	">
						<i class="fas fa-user"></i>
					</div>
					<div class="div">
						<form:input path="username" class="input" autocomplete="off" placeholder="Enter Username"/>
					</div>	
				</div><div class="span">
					<span><form:errors path="username"></form:errors></span>
				</div>
				<br>
				<br>
				<div class="input-div pass">
					<div class="i">
						<i class="fas fa-lock"></i>
					</div>
					<div class="div">
						<form:password  path="password" class="input" placeholder="Enter Password"/>
					</div>
				</div><div class="span">
					<span><form:errors path="password"></form:errors></span>
				</div>
				<br>
				<input type="submit" class="btn" value="Login">
				<h1><a href="index">Go To User dashboard &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></h1>
			</form:form>
		</div>
	</div>	
	<script type="text/javascript" src="<c:url value='/resources/AdminJsFile/AdminLoginJS.js' />"></script>
	
</body>
</html>