<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!--=============== REMIXICONS ===============-->
<link
	href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css"
	rel="stylesheet">

<!--=============== CSS ===============-->
<link rel="stylesheet"
	href="<c:url value='/resources/AdminCSSFile/Header.css' />">
	
<title>admin header</title>
</head>
<body>
 <!--=============== HEADER ===============-->
        <header class="header">
            <nav class="nav container">
                <div class="nav__data">
                    <a href="AdminPanel" class="nav__logo">
                        <i class="ri-admin-line"></i>  Admin Panel
                    </a>
    
                    <div class="nav__toggle" id="nav-toggle">
                        <i class="ri-menu-line nav__toggle-menu"></i>
                        <i class="ri-close-line nav__toggle-close"></i>
                    </div>
                </div>

                <!--=============== NAV MENU ===============-->
                <div class="nav__menu" id="nav-menu">
                    <ul class="nav__list">

                        <li>
                            <a href="AdminPanel" class="nav__link" target="_self">Home</a>
                        </li>

                        <!--=============== DROPDOWN 1 ===============-->
                        <li class="dropdown__item">                        
                            <div class="nav__link dropdown__button">
                                Most Visited Places<i class="ri-arrow-down-s-line dropdown__arrow"></i>
                            </div>

                            <div class="dropdown__container">
                                <div class="dropdown__content">
                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                            <img src="<c:url value='/resources/IMAGES/most_visited_places.png' />" alt="visited_place"/>
                                        </div>
    
                                        <span class="dropdown__title">Most Visited Places</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="AddMostVisitedPlace" class="dropdown__link" target="_self">Add Visited Places</a>
                                            </li>
                                            <li>
                                                <a href="ListMostVisitedPlace" class="dropdown__link" target="_self">List Visited Places</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </li>

                        

                        <!--=============== DROPDOWN  2===============-->
                        <li class="dropdown__item">
                            <div class="nav__link dropdown__button">
                                More Places<i class="ri-arrow-down-s-line dropdown__arrow"></i>
                            </div>

                            <div class="dropdown__container">
                                <div class="dropdown__content">
                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                            <img src="<c:url value='/resources/IMAGES/hospital_icon.png' />" alt="hospital_icon"/>
                                        </div>
    
                                        <span class="dropdown__title">Hospitals</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="AddHospital" class="dropdown__link" target="_self">Add Hospitals</a>
                                            </li>
                                            <li>
                                                <a href="ListHospital" class="dropdown__link" target="_self">List Hospitals</a>
                                            </li>
                                        </ul>
                                    </div>
                                    

                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                            <img src="<c:url value='/resources/IMAGES/mall_icon.png' />" alt="mall_icon"/>
                                        </div>
    
                                        <span class="dropdown__title">Malls</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="AddMalls" class="dropdown__link" target="_self">Add Malls</a>
                                            </li>
                                            <li>
                                                <a href="ListMalls" class="dropdown__link" target="_self">List Malls</a>
                                            </li>
                                        </ul>
                                    </div>

                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                            <img src="<c:url value='/resources/IMAGES/temple_icon.png' />" alt="temple_icon"/>
                                        </div>
    
                                        <span class="dropdown__title">Temples</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="AddTemple" class="dropdown__link" target="_self">Add Temples</a>
                                            </li>
                                            <li>
                                                <a href="ListTemple" class="dropdown__link" target="_self">List Temples</a>
                                            </li>
                                        </ul>
                                    </div>

                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                            <img src="<c:url value='/resources/IMAGES/restaurant_icon.png' />" alt="restaurant_icon"/>
                                        </div>
    
                                        <span class="dropdown__title">Restaurants</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="AddRestaurant" class="dropdown__link" target="_self">Add Restaurants</a>
                                            </li>
                                            <li>
                                                <a href="ListRestaurant" class="dropdown__link"target="_self">List Restaurants</a>
                                            </li>
                                        </ul>
                                    </div>

                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                            <img src="<c:url value='/resources/IMAGES/brts_icon.png' />" alt="brts_icon"/>
                                        </div>
    
                                        <span class="dropdown__title">BRTS Stations</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="AddBRTS" class="dropdown__link" target="_self">Add BRTS Station</a>
                                            </li>
                                            <li>
                                                <a href="ListBRTS" class="dropdown__link" target="_self">List BRTS Station</a>
                                            </li>
                                        </ul>
                                    </div>

                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                            <img src="<c:url value='/resources/IMAGES/metro_icon.png' />" alt="metro_icon"/>
                                        </div>
    
                                        <span class="dropdown__title">Metro Stations</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="AddMetro" class="dropdown__link" target="_self">Add Metro Station</a>
                                            </li>
                                            <li>
                                                <a href="ListMetro" class="dropdown__link"target="_self">List Metro Station</a>
                                            </li>
                                        </ul>
                                    </div>
                                    
                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                            <img src="<c:url value='/resources/IMAGES/train_icon.png' />" alt="metro_icon"/>
                                        </div>
    
                                        <span class="dropdown__title">Railway Stations</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="AddRailway" class="dropdown__link" target="_self">Add Railway Station</a>
                                            </li>
                                            <li>
                                                <a href="ListRailway" class="dropdown__link"target="_self">List Railway Station</a>

                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </li>


                         <!--=============== DROPDOWN 3 ===============-->
                         <li class="dropdown__item">                        
                            <div class="nav__link dropdown__button">
                                More <i class="ri-arrow-down-s-line dropdown__arrow"></i>
                            </div>

                            <div class="dropdown__container">
                                <div class="dropdown__content">
                                
                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                            <img src="<c:url value='/resources/IMAGES/admin_view_feedback.png' />" alt="visited_place"/>
                                        </div>
    
                                        <span class="dropdown__title">View FeedBack</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="AdminViewFeedBack" class="dropdown__link" target="_self">List View FeedBack</a>
                                            </li>
                                        </ul>
                                    </div>
                                    
                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                            <img src="<c:url value='/resources/IMAGES/admin_view_user.png' />" alt="view_user"/>
                                        </div>
    
                                        <span class="dropdown__title">View User</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="AdminViewUser" class="dropdown__link" target="_self">List View User</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </li>
                        
                         <!--=============== DROPDOWN 4 ===============-->
                         <li class="dropdown__item">
                            <div class="nav__link dropdown__button">
                                Profile<i class="ri-arrow-down-s-line dropdown__arrow"></i>
                            </div>

                            <div class="dropdown__container">
                                <div class="dropdown__content">
                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                            <img src="<c:url value='/resources/IMAGES/profile_icon.png' />" alt="security_question_icon"/>
                                        </div>
    
                                        <span class="dropdown__title">Admin Profile</span>
    
                                        <ul class="dropdown__list">
                                        	<li>
                                                <a href="AdminProfile?id=${AdminUserId}" class="dropdown__link" target="_self">Show Profile</a>
                                            </li>
                                            
                                            <li>
                                                <a href="LogoutAdmin" class="dropdown__link" target="_self">Logout</a>
                                            </li>
                                           
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </li>

                        
                    </ul>
                </div>
            </nav>
        </header>


 <!--=============== HEADER JS ===============-->
        <script src="<c:url value='/resources/AdminJsFile/HeaderJS.js' />"></script>
</body>
</html>