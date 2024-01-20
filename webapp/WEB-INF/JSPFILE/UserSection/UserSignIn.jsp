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
	<link rel="stylesheet" href="<c:url value='/resources/UserCSSFile/UserSignIn.css' />">
	
	<title>UserSignIn</title>
</head>
<body>

<main>
    <div class="box">
      <div class="inner-box">
        <div class="forms-wrap">
        
          <form:form action="UserLogin" modelAttribute="userlogin" method="post" autocomplete="off" class="sign-in-form">
            <div class="logo">
              <img src="<c:url value='/resources/IMAGES/favicon1.png' />" alt="SmartCity" />
              <h4>Smart City</h4>
            </div>

            <div class="heading">
              <h2>Welcome Back</h2>
              <h6>Not registered yet?</h6>
              <a href="UserSignUp" class="toggle">Sign up</a>
            </div>
            <div class="actual-form">
              <div class="input-wrap">
              <form:input path="username" placeholder="Enter User Name *" class="input-field" autocomplete="off" />
              </div>
              <div class="validation">
                <form:errors path="username" />
              </div>
              <div class="input-wrap">
              <form:input path="password" placeholder="Enter Password *"  type="password" class="input-field" autocomplete="off" />
              </div>
              <div class="validationone">
               <form:errors path="password" />
              </div>
              <br>
              <input type="submit" value="Sign In" class="sign-btn" />
              <a href="index" class="goto">Go to User Deshboard</a>
            </div>
          </form:form>
        </div>
        
        <div class="carousel">
          <div class="images-wrapper">
            <img src="<c:url value='/resources/IMAGES/image3.png' />" class="image img-3 show" alt="" />
          </div>

          <div class="text-slider">
            <div class="text-wrap">
              <div class="text-group">
                <h2>Smarter thinking, smarter living</h2>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </main>
  
  <!-- JS File-->
    <script src="<c:url value='/resources/JSFILE/UserSignUpLoginJs.js' />"></script>
</body>
</html>