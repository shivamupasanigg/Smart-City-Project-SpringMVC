<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

   <!--=============== FAVICON ===============-->
   <link rel="shortcut icon" href="<c:url value='/resources/IMAGES/favicon1.png' />" type="image/x-icon">

   <!--=============== Icons ===============-->
   <link href="https://cdn.jsdelivr.net/npm/remixicon@3.5.0/fonts/remixicon.css" rel="stylesheet">
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css"/>

   <!--=============== CSS ===============-->
   <link rel="stylesheet" href="<c:url value='/resources/CSSFILE/Index.css' />">
   
   <!--=============== JS ===============-->
   
   <script>
        setTimeout(() => {window.history.forward() }, 1000);
   </script>
   
<title>Smart City</title>
</head>
<body>
<!--==================== HEADER ====================-->
   <header class="header" id="header">
      <nav class="nav container">
         <a href="#" class="nav__logo">
           <img src="<c:url value='/resources/IMAGES/logo.gif' />" alt="" height="" width="">
         </a>

         <div class="nav__menu" id="nav-menu">

            <ul class="nav__list">
               <li class="nav__item">
                  <a href="#home" class="nav__link">Home</a>
               </li>

               <li class="nav__item">
                  <a href="#about" class="nav__link">About</a>
               </li>

               <li class="nav__item">
                  <a href="#popular" class="nav__link">Popular</a>
               </li>

               <li class="nav__item">
                  <a href="#explore" class="nav__link">Explore</a>
               </li>
               <li class="nav__item">
                  <a href="adminloginForm" class="active">Admin Login</a>
               </li>
               <li class="nav__item">
                  <a href="UserSignIn" class="active">User Login</a>
               </li>

            </ul>

            <!-- Close button -->

            <div class="nav__close" id="nav-close">
               <i class="ri-close-line"></i>
            </div>
         </div>

         <!-- Toggle button -->
         <div class="nav__toggle" id="nav-toggle">
            <i class="ri-menu-line"></i>
         </div>
      </nav>
   </header>
   
   <!--==================== MAIN ====================-->
   <main class="main">
      <!--==================== HOME ====================-->
      <section class="home section" id="home">
         <img src="<c:url value='/resources/IMAGES/home-bg.jpg' />" alt="home image" class="home__bg">
         <div class="home__shadow"></div>
         <div class="home__container container grid">
            <div class="home__data">
               <h3 class="home__subtitle">
                  Welcome To Smart City
               </h3>

               <h1 class="home__title">
                  Explore <br> Ahmedabad
               </h1>

               <p class="home__description">
                  The smart city is a gift, a chance to transform old and slow systems and structures into a smart
                  future. The city of tomorrow is here today, with smart solutions paving the way for a brighter future.
                  Visit us now🌆.
               </p>

               <a href="UserSignIn" class="button">
                  Start Your Journey <i class="ri-arrow-right-line"></i>
               </a>
            </div>

            <div class="home__cards grid">
               <article class="home__card">
                  <img src="<c:url value='/resources/IMAGES/home-lake.jpg' />" alt="home image" class="home__card-img">
                  <h3 class="home__card-title"> Kakariya Lake</h3>
                  <div class="home__card-shadow"></div>
               </article>

               <article class="home__card">
                  <img src="<c:url value='/resources/IMAGES/teendarwaja.jpg' />" alt="home image" class="home__card-img">
                  <h3 class="home__card-title"> Teen Darwaza </h3>
                  <div class="home__card-shadow"></div>
               </article>

               <article class="home__card">
                  <img src="<c:url value='/resources/IMAGES/isro-image.jpg' />" alt="home image" class="home__card-img">
                  <h3 class="home__card-title">ISRO</h3>
                  <div class="home__card-shadow"></div>
               </article>

               <article class="home__card">
                  <img src="<c:url value='/resources/IMAGES/Vaishno-Devi-Temple.webp' />" alt="home image" class="home__card-img">
                  <h3 class="home__card-title">Vaishno Devi Temple</h3>
                  <div class="home__card-shadow"></div>
               </article>
            </div>
         </div>
      </section>
      
      <!--==================== ABOUT ====================-->
      <section class="about section" id="about">
         <div class="about__container container grid">
            <div class="about__data">
               <h2 class="section__title">
                  Learn More <br>
                  About Smart City
               </h2>

               <p class="about__description">
                  A smart city is a modern urban area that uses technology to collect data and improve operations. Smart
                  cities use sensors and other electronic methods to collect data. They use this data to manage
                  resources, services, and assets more efficiently🌆.
               </p>
               <a href="#" class="button">
                  Explore Smart City <i class="ri-arrow-right-line"></i>
               </a>
            </div>

            <div class="about__image">
               <img src="<c:url value='/resources/IMAGES/home-lake.jpg' />" alt="about__img" class="about__img">
               <div class="about__shadow"></div>
            </div>
         </div>
      </section>
      
      <!--==================== POPULAR ====================-->
      <section class="popular section" id="popular">
         <h2 class="section__title">
            Enjoy The Beauty <br>
            Of The City
         </h2>

         <div class="popular__container container grid">
            <article class="popular__card">

               <div class="popular__image">
                  <img src="<c:url value='/resources/IMAGES/teendarwaja.jpg' />" alt="popular image" class="popular__img">
                  <div class="popular__shadow"></div>
               </div>
               <h2 class="popular__title">
                  Teen Darwaza
               </h2>

               <div class="popular__location">
                  <i class="ri-map-pin-line"></i>
                  <span>Bhadra, Ahmedabad</span>
               </div>
            </article>

            <article class="popular__card">

               <div class="popular__image">
                  <img src="<c:url value='/resources/IMAGES/Vaishno-Devi-Temple.webp' />" alt="popular image" class="popular__img">
                  <div class="popular__shadow"></div>
               </div>
               <h2 class="popular__title">
                  Vaishno Devi Temple
               </h2>

               <div class="popular__location">
                  <i class="ri-map-pin-line"></i>
                  <span>Khodiyar, Ahmedabad</span>
               </div>
            </article>

            <article class="popular__card">

               <div class="popular__image">
                  <img src="<c:url value='/resources/IMAGES/isro-image.jpg' />" alt="popular image" class="popular__img">
                  <div class="popular__shadow"></div>
               </div>
               <h2 class="popular__title">
                  ISRO
               </h2>

               <div class="popular__location">
                  <i class="ri-map-pin-line"></i>
                  <span> Satellite, Ahmedabad</span>
               </div>
            </article>
         </div>
      </section>
      
      <!--==================== EXPLORE ====================-->
      <section class="explore section" id="explore">

         <div class="explore__container">
            <div class="explore__image">
               <img src="<c:url value='/resources/IMAGES/explore-beach.jpg' />" alt="explore image" class="explore__img">
               <div class="explore__shadow"></div>
            </div>

            <div class="explore__content container grid">
               <div class="explore__data">
                  <h2 class="section__title">
                     Explore The <br>
                     Best Paradises
                  </h2>

                  <p class="explore__description">
                     Ahmedabad is a city where history harmoniously blends with modernity.In Ahmedabad, every street
                     tells a story of the city’s rich cultural heritage🚗.
                  </p>
               </div>

               <div class="explore__user">
                  <img src="<c:url value='/resources/IMAGES/explore-perfil.png' />" alt="explore image" class="explore__perfil">
                  <span class="explore__name">
                     Paul Jeams
                  </span>
               </div>
            </div>
         </div>
      </section>
      
       <!--==================== JOIN ====================-->
      <section class="join section">
         <div class="join__container container grid">
            <div class="join__data">
               <h2 class="section__title">
                  Your Journey <br>
                  Starts Here
               </h2>

               <p class="join__description">
                  Get up to date with the latest
                  travel and information from us.
               </p>

               <form action="#" class="join__form">
                  <input type="email" placeholder="Enter your Email" class="join__input">

                  <button class="join__button button">
                     Subscribe Our Newsletter <i class="ri-arrow-right-line"></i>
                  </button>
               </form>
            </div>
            <div class="join__image">
               <img src="<c:url value='/resources/IMAGES/ahemdabad-join1.avif' />" alt="join image" class="join__img">
               <div class="join__shadow"></div>
            </div>
         </div>
      </section>
   </main>
   
   <!--==================== FOOTER ====================-->
   <footer class="footer">
      <div class="footer__container container grid">
         <div class="footer__content grid">
            <div>
               <a href="#" class="footer__logo">
                  Smart City
               </a>

               <p class="footer__description">
                  Captivating Smart Cities, Inspiring Progress.<br>
                  Smart Solutions, Sustainable Growth.
               </p>
            </div>

            <div class="footer__data grid">
               <div>
                  <h3 class="footer__title">Home</h3>

                  <ul class="footer__links">
                     <li>
                        <a href="#home" class="footer__link">Home</a>
                     </li>
                  </ul>
               </div>

               <div>
                  <h3 class="footer__title">About</h3>

                  <ul class="footer__links">
                     <li>
                        <a href="#about" class="footer__link">About</a>
                     </li>
                  </ul>
               </div>

               <div>
                  <h3 class="footer__title">Popular</h3>

                  <ul class="footer__links">
                     <li>
                        <a href="#popular" class="footer__link">Popular</a>
                     </li>
                  </ul>
               </div>

               <div>
                  <h3 class="footer__title">Explore</h3>

                  <ul class="footer__links">
                     <li>
                        <a href="#explore" class="footer__link">Explore</a>
                     </li>
                  </ul>
               </div>
            </div>
         </div>

         <div class="footer__group">
            <div class="footer__social">
               <a href="#" target="_blank" class="footer__social-link">
                  <i class="fa-brands fa-facebook"></i>
               </a>
               <a href="#" target="_blank" class="footer__social-link">
                  <i class="fa-brands fa-x-twitter"></i>
               </a>
               <a href="#" target="_blank" class="footer__social-link">
                  <i class="fa-brands fa-linkedin"></i>
               </a>
               <a href="#" target="_blank" class="footer__social-link">
                  <i class="fa-brands fa-instagram"></i>
               </a>
            </div>

            <span class="footer__copy">
               &#169; Copyright 2023 Smart City | All rights reserved
            </span>
         </div>
      </div>
   </footer>

   <!--========== SCROLL UP ==========-->
   <a href="#" class="scrollup" id="scroll-up">
      <i class="ri-arrow-up-line"></i>
   </a>

   <!--=============== SCROLLREVEAL ===============-->
   <script src="<c:url value='/resources/JSFILE/scrollreveal.min.js' />"></script>

   <!--=============== MAIN JS ===============-->
   <script src="<c:url value='/resources/JSFILE/main.js' />"></script>
   <script src="<c:url value='/resources/JSFILE/scrollreveal.js' />"></script>
   <script src="<c:url value='/resources/JSFILE/scrollbutton.js' />"></script>
      
   
   
</body>
</html>