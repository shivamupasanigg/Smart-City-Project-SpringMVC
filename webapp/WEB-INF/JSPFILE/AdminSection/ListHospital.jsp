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
<title>List Hospital</title>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" />
<!--=============== CSS ===============-->

<link rel="stylesheet"
	href="<c:url value='/resources/AdminCSSFile/ListHospital.css' />">

	
	<!-- JQUERY LINK -->
	<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	<script src="<c:url value='/resources/AdminJsFile/ListHospital.js' />"></script>
	
</head>
<body>
<!-- Load header -->
     <div id="headerContainer"></div>
     
     <div class="main">
		<div class="container">
		  <h1>Hospital List</h1>
		  <hr>
	  
		  <table class="table">
			<tr>
			  <th> Hospital ID</th>
			</tr>
			<c:forEach var="listhospital" items="${listhospital}">
			<tr>
			  <td style="height: 239px;">${listhospital.id}</td>
			</tr>
			</c:forEach>
		  </table>
	  
		  <table class="table">
			<tr>
			  <th>Hospital Images</th>
			</tr>
			<c:forEach var="HospitalImage" items="${HospitalImage}">
			<tr>
			  <td style="height: 239px;"><img src="data:image/png;base64,${HospitalImage}" alt="Image" height="200" width="200"></td>
			</tr>
			</c:forEach>
		  </table>
	  
		  <table class="table">
			<tr>
			  <th>Hospital Name</th>
			  <th>Actions</th>
			</tr>
			<c:forEach var="listhospital" items="${listhospital}">
			<tr>
			  <td style="height: 239px;">${listhospital.hospital_name}</td>
			  <td style="height: 239px;"><a href="UpdateHospital?id=${listhospital.id}" class="button button2"><i class="fa-solid fa-pen-to-square fa-beat"></i></a><a href="DeleteHospital?id=${listhospital.id}" class="button button2"><i class="fa-solid fa-trash fa-beat"></i></a></td>
			</tr>
			</c:forEach>
		  </table>
		</div>
	  </div>
     
     
     
     <!-- Load footer -->
     <div id="footerContainer"></div>
</body>
</html>