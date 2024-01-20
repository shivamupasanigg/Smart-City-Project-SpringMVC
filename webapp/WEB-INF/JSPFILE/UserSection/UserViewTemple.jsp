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

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css" />
<!-- CSS File-->
<link rel="stylesheet"
	href="<c:url value='/resources/UserCSSFile/UserViewTemple.css' />">

<!-- Include jQuery -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<!-- JQUERY File Link -->
<script
	src="<c:url value='/resources/UserJsFile/UserViewTempleJs.js' />"></script>

<title>View Temple</title>
</head>
<body>
<!-- Load header -->
	<div id="UserHeaderContainer"></div>

	<!-- Load Main-->

	<div class="Main">
		<div class="main box-show">
			<h1>Temple Images</h1>
			<!-- First Inner Div for Image Slider -->
			<div class="details">
				<div class="swiper mySwiper">

					<div class="swiper-wrapper">
						<div class="swiper-slide">
							<img src="data:image/jpeg;base64,${TempleImageOne}" alt="">
						</div>
						<div class="swiper-slide">
							<img src="data:image/jpeg;base64,${TempleImageTwo}" alt="">
						</div>
					</div>

					<div class="swiper-button-next"></div>
					<div class="swiper-button-prev"></div>
					<div class="swiper-pagination"></div>
				</div>

				<h1>Temple Details</h1>
				<!-- Horizontal Rule -->
				<hr>
				<!-- Second Inner Div for Details -->
				<div class="details">
					<table>
						<tr>
							<th class="heading">Temple Name :</th>
							<td class="input">${ViewTemple.temple_name}</td>
						</tr>
						<tr>
							<th class="heading">Temple Address :</th>
							<td class="input">${ViewTemple.temple_address}</td>
						</tr>
						<tr>
							<th class="heading">Temple Phone :</th>
							<td class="input">${ViewTemple.temple_phone}</td>
						</tr>
						<tr>
							<th class="heading">Morning Time :</th>
							<td class="input">${ViewTemple.temple_amtime}&nbsp;<span>AM</span></td>
						</tr>
						<tr>
							<th class="heading">Evening Time :</th>
							<td class="input">${ViewTemple.temple_pmtime}&nbsp;<span>PM</span></td>
						</tr>
					</table>
					
					<h1>Temple Map</h1>
					<hr>
					<br>
					<div class="google-map">
						<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d235013.74842920963!2d72.41492881144384!3d23.020474101422135!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x395e848aba5bd449%3A0x4fcedd11614f6516!2sAhmedabad%2C%20Gujarat!5e0!3m2!1sen!2sin!4v1704783088208!5m2!1sen!2sin" width="200%" height="200%" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
					</div>
				</div>
			</div>
		</div>
	</div>
	<br>

	<!-- Load header -->
	<div id="UserFooterContainer"></div>

	<!-- Swiper JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.js"></script>
	<!-- Initialize Swiper -->
	<script>
		var swiper = new Swiper(".mySwiper", {
			spaceBetween : 30,
			centeredSlides : true,
			autoplay : {
				delay : 2500,
				disableOnInteraction : false,
			},
			pagination : {
				el : ".swiper-pagination",
				clickable : true,
			},
			navigation : {
				nextEl : ".swiper-button-next",
				prevEl : ".swiper-button-prev",
			},
		});
	</script>
</body>
</html>