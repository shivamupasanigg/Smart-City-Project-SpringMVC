<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css"/>
<title>footer</title>
<style>
.footer {
    position: relative;
     width: 100%; 
    background: black;
    min-height: 100px;
    padding: 20px 50px;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
  }
  
  .social-icon,
  .menu {
    position: relative;
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 10px 0;
    flex-wrap: wrap;
  }
  
  .social-icon__item,
  .menu__item {
    list-style: none;
  }
  
  .social-icon__link {
    font-size: 2rem;
    color: #fff;
    margin: 0 10px;
    display: inline-block;
    transition: 0.5s;
  }
  .social-icon__link:hover {
    transform: translateY(-10px);
  }
  
  .menu__link {
    font-size: 1.2rem;
    color: #fff;
    margin: 0 10px;
    display: inline-block;
    transition: 0.5s;
    text-decoration: none;
    opacity: 0.75;
    font-weight: 300;
  }
  
  .menu__link:hover {
    opacity: 1;
  }
  
  .footer p {
    color: #fff;
    margin: 15px 0 10px 0;
    font-size: 1rem;
    font-weight: 300;
  }
  @keyframes animateWaves {
    0% {
      background-position-x: 1000px;
    }
    100% {
      background-positon-x: 0px;
    }
  }
  
  @keyframes animate {
    0% {
      background-position-x: -1000px;
    }
    100% {
      background-positon-x: 0px;
    }
  }
    </style>
</head>
<body>
<footer class="footer">
        <ul class="social-icon">
          <li class="social-icon__item"><a class="social-icon__link" href="#">
              <i class="fa-brands fa-facebook"></i>
            </a></li>
          <li class="social-icon__item"><a class="social-icon__link" href="#">
              <i class="fa-brands fa-x-twitter" ></i>
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