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

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" />
<!--=============== CSS ===============-->

<link rel="stylesheet"
	href="<c:url value='/resources/AdminCSSFile/ListRailway.css' />">

	
	<!-- JQUERY LINK -->
	<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	<script src="<c:url value='/resources/AdminJsFile/ListRailway.js' />"></script>
	
<title>List Railway Stations</title>
</head>
<body>
<!-- Load header -->
     <div id="headerContainer"></div>
     
     <div class="main">
		<div class="container">
		  <h1>Railway Station List</h1>
		  <hr>
	  
		  <table class="table">
			<tr>
			  <th>Station ID</th>
			</tr>
			<c:forEach var="Railwaylist" items="${Railwaylist}">
			<tr>
			  <td style="height: 239px;">${Railwaylist.id}</td>
			</tr>
			</c:forEach>
		  </table>
	  
		  <table class="table">
			<tr>
			  <th>Station Images</th>
			</tr>
			<c:forEach var="ListRailwayImage" items="${ListRailwayImage}">
			<tr>
			  <td style="height: 239px;"><img src="data:image/png;base64,${ListRailwayImage}" alt="Image" height="200" width="200"></td>
			</tr>
			</c:forEach>
		  </table>
	  
		  <table class="table">
			<tr>
			  <th> Station Name</th>
			  <th>Actions</th>
			</tr>
			<c:forEach var="Railwaylist" items="${Railwaylist}">
			<tr>
			  <td style="height: 239px;">${Railwaylist.railway_Station_name}</td>
			  <td style="height: 239px;"><a href="UpdateRailway?id=${Railwaylist.id}" class="button button2"><i class="fa-solid fa-pen-to-square fa-beat"></i></a><a href="DeleteRailway?id=${Railwaylist.id}" class="button button2"><i class="fa-solid fa-trash fa-beat"></i></a></td>
			</tr>
			</c:forEach>
		  </table>
		</div>
	  </div>
     
     
     
     <!-- Load footer -->
     <div id="footerContainer"></div>
</body>
</html>