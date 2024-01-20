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
	<link rel="stylesheet" href="<c:url value='/resources/UserCSSFile/UserFeedBackForm.css' />">
	
	<!-- Include jQuery -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	
	<!-- JQUERY File Link -->
	<script src="<c:url value='/resources/UserJsFile/UserFeedBackFormJs.js' />"></script>
	
	<title>User FeedBack Form</title>
</head>
<body>

<!-- Load header -->
     <div id="UserHeaderContainer"></div>
     
     <!-- load main -->
     
     <div class="main">
        <form:form action="UserInsertFeedback" method="post" modelAttribute="userfeedback">
        <div class="container">
            <h1>FeedBack Form</h1>
            <hr>
            <label for=""><b>Full Name <span class="validation">*</span></b></label>
            <form:input path="feedbackfullname" placeholder="Enter Your Full Name" autocomplete="off" />
            <form:errors path="feedbackfullname" class="validation" />
            <br>
            <label for=""><b>Comments <span class="validation">*</span></b></label>
            <form:textarea path="feedbackcomments" rows="4" cols="2"  placeholder="Enter Comments"/>
            <form:errors path="feedbackcomments" class="validation" />
            <br>
            <hr>
            <button type="submit" class="registerbtn">Submit</button>
        </div>
    </form:form>
    </div>
    
     <!-- Load header -->
     <div id="UserFooterContainer"></div>
     
     
     

</body>
</html>