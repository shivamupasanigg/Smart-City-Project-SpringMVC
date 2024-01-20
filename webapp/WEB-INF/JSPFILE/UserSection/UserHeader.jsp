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

<!-- CSS File-->
	<link rel="stylesheet" href="<c:url value='/resources/UserCSSFile/UserHeader.css' />">
	
	<title>User Panel</title>

</head>
<body>

<!--=============== HEADER ===============-->
        <header class="header">
            <nav class="nav container">
                <div class="nav__data">
                    <a href="UserHome" class="nav__logo">
                        <i class="ri-user-line"></i>  User Panel
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
                            <a href="UserHome" class="nav__link" target="_self">Home</a>
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
                                            <img src="<c:url value='/resources/UserImage/user_most_visited_places.png' />" alt="visited_place"/>
                                        </div>
    
                                        <span class="dropdown__title">Most Visited Places</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="UserListMostVisitedPlace" class="dropdown__link" target="_self">List Most Visited Places</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </li>

                        

                        <!--=============== DROPDOWN  2 ===============-->
                        <li class="dropdown__item">
                            <div class="nav__link dropdown__button">
                                More Places<i class="ri-arrow-down-s-line dropdown__arrow"></i>
                            </div>

                            <div class="dropdown__container">
                                <div class="dropdown__content">
                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                            <img src="<c:url value='/resources/UserImage/user_hospital_icon.png' />" alt="hospital_icon"/>
                                        </div>
    
                                        <span class="dropdown__title">Hospitals</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="UserListHospital" class="dropdown__link" target="_self">List Hospitals</a>
                                            </li>
                                        </ul>
                                    </div>
                                    

                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                            <img src="<c:url value='/resources/UserImage/user_mall_icon.png' />" alt="mall_icon"/>
                                        </div>
    
                                        <span class="dropdown__title">Malls</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="UserListMall" class="dropdown__link" target="_self">List Malls</a>
                                            </li>
                                        </ul>
                                    </div>

                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                         <img src="<c:url value='/resources/UserImage/user_temple_icon.png' />" alt="temple_icon"/>
                                        </div>
    
                                        <span class="dropdown__title">Temples</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="UserListTemple" class="dropdown__link" target="_self">List Temples</a>
                                            </li>
                                        </ul>
                                    </div>

                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                         <img src="<c:url value='/resources/UserImage/user_restaurant_icon.png' />" alt="temple_icon"/>
                                        </div>
    
                                        <span class="dropdown__title">Restaurants</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="UserListRestaurent" class="dropdown__link"target="_self">List Restaurants</a>
                                            </li>
                                        </ul>
                                    </div>

                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                        <img src="<c:url value='/resources/UserImage/user_brts_icon.png' />" alt="temple_icon"/>
                                        </div>
    
                                        <span class="dropdown__title">BRTS Stations</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="UserListBRTS" class="dropdown__link" target="_self">List BRTS Stations</a>
                                            </li>
                                        </ul>
                                    </div>

                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                        <img src="<c:url value='/resources/UserImage/user_metro_icon.png' />" alt="temple_icon"/>
                                        </div>
    
                                        <span class="dropdown__title">Metro Stations</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="UserListMetro" class="dropdown__link"target="_self">List Metro Stations</a>
                                            </li>
                                        </ul>
                                    </div>

                                    <div class="dropdown__group">
                                        <div class="dropdown__icon">
                                        <img src="<c:url value='/resources/UserImage/user_train_icon.png' />" alt="temple_icon"/>
                                        </div>
    
                                        <span class="dropdown__title">Railway Stations</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="UserListRailway" class="dropdown__link"target="_self">List Railway Stations</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </li>


                         <!--=============== DROPDOWN 3 ===============-->
                         <li>
                            <a href="UserFeedBackForm" class="nav__link" target="_self">FeedBack Form</a>
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
                                         <img src="<c:url value='/resources/UserImage/user_profile.png' />" alt="temple_icon"/>
                                        </div>
    
                                        <span class="dropdown__title">User Profile</span>
    
                                        <ul class="dropdown__list">
                                            <li>
                                                <a href="GetUserProfile?id=${UserId}" class="dropdown__link" target="_self">Show Profile</a>
                                            </li>
                                            <li>
                                                <a href="LogoutUser" class="dropdown__link" target="_self">Logout</a>
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



<!--=============== MAIN JS ===============-->
<script src="<c:url value='/resources/UserJsFile/UserHeaderjs.js' />"></script>
</body>
</html>