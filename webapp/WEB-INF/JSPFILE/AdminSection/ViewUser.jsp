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
	<script src="<c:url value='/resources/AdminJsFile/ViewUser.js' />"></script>
	<!--=============== CSS ===============-->
<link rel="stylesheet"
	href="<c:url value='/resources/AdminCSSFile/ViewUser.css' />">
<title>View User</title>
</head>
<body>
<!-- Load header -->
     <div id="headerContainer"></div>
     
     <div class="main">
		<div class="container">
			<h1>View User List</h1>
			<hr>

			<table class="table">
				<thead>
					<tr>
                        <th>ID</th>
						<th>Full Name</th>
						<th>User Name</th>
					</tr>
				</thead>
                <c:forEach var="userview" items="${userview}">
				<tbody>
					<tr>
                        <td>${userview.id}</td>
						<td>${userview.fullname}</td>
						<td>${userview.username}</td>
					</tr>
				</tbody>
				</c:forEach>
			</table>

		</div>
	</div>
     
      <!-- Load footer -->
     <div id="footerContainer"></div>
</body>
</html>