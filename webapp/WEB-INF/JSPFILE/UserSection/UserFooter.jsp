<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css"/>
    <title>User Footer</title>
    <!-- CSS File-->
	<link rel="stylesheet" href="<c:url value='/resources/UserCSSFile/UserFooter.css' />">
</head>
<body>
<br>
    <footer class="footer">
        <ul class="social-icon">
          <li class="social-icon__item"><a class="social-icon__link" href="#">
              <i class="fa-brands fa-facebook"></i>
            </a></li>
          <li class="social-icon__item"><a class="social-icon__link" href="#">
              <i class="fa-brands fa-x-twitter"></i>
            </a></li>
          <li class="social-icon__item"><a class="social-icon__link" href="#">
              <i class="fa-brands fa-linkedin"></i>
            </a></li>
          <li class="social-icon__item"><a class="social-icon__link" href="#">
              <i class="fa-brands fa-instagram"></i>
            </a></li>
        </ul>
        <p>&copy;2023 Smart City | All Rights Reserved</p>
      </footer>
</body>
</html>