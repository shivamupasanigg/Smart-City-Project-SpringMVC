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
	<link rel="stylesheet" href="<c:url value='/resources/UserCSSFile/UserListMall.css' />">
	
	<!-- Include jQuery -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	
	     <!-- JQUERY File Link -->
	<script src="<c:url value='/resources/UserJsFile/UserListMallJs.js' />"></script>
	
	<title>User List Mall</title>
</head>
<body>
<!-- Load header -->
     <div id="UserHeaderContainer"></div>
     
     <!-- Load main -->
     <div class="main">
		<div class="container">
		  <h1>Mall List</h1>
		  <hr>
	  
		  <table class="table">
			<tr>
			  <th> Mall ID</th>
			</tr>
			<c:forEach var="getMalls" items="${getMalls}">
			<tr>
			  <td style="height: 239px;">${getMalls.id}</td>
			</tr>
			</c:forEach>
		  </table>
	  
		  <table class="table">
			<tr>
			  <th>Mall Images</th>
			</tr>
			<c:forEach var="UserMallImage" items="${UserMallImage}">
			<tr>
			  <td style="height: 239px;"><img src="data:image/png;base64,${UserMallImage}" alt="Image" height="200" width="200"></td>
			</tr>
			</c:forEach>
		  </table>
	  
		  <table class="table">
			<tr>
			  <th>Mall Name</th>
			  <th>Show More</th>
			</tr>
			<c:forEach var="getMalls" items="${getMalls}">
			<tr>
			  <td style="height: 239px;">${getMalls.mall_name}</td>
			  <td style="height: 239px;"><a href="UserViewMall?id=${getMalls.id}" class="button button2"><i class="fas fa-external-link-alt"></i></a></td>
			</tr>
			</c:forEach>
		  </table>
		</div>
	  </div>
     
     <!-- Load header -->
     <div id="UserFooterContainer"></div>
</body>
</html>