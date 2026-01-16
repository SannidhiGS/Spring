<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>X-Workz Institute</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background-color: #f4f6f8;
        }

        header {
            background-color: #0a66c2;
            color: white;
            padding: 40px 20px;
            text-align: center;
        }

        header h1 {
            margin: 0;
            font-size: 2.5em;
        }

        header p {
            font-size: 1.2em;
            margin-top: 10px;
        }

        .hero {
            display: flex;
            align-items: center;
            justify-content: center;
            flex-wrap: wrap;
            padding: 50px 20px;
            background-color: #ffffff;
        }

        .hero img {
            max-width: 300px;
            border-radius: 10px;
            margin: 20px;
        }

        .hero .intro {
            max-width: 600px;
            margin: 20px;
        }

        .intro h2 {
            font-size: 2em;
            color: #0a66c2;
        }

        .about, .courses {
            padding: 50px 20px;
            text-align: center;
        }

        .course-list {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
            gap: 20px;
            margin-top: 30px;
        }

        .course {
            background-color: white;
            padding: 20px 30px;
            border-radius: 10px;
            box-shadow: 0 5px 15px rgba(0,0,0,0.1);
            font-weight: bold;
        }

        footer {
            background-color: #222;
            color: white;
            text-align: center;
            padding: 20px;
        }
    </style>
</head>

<body>

<header>
    <h1>X-Workz Institute</h1>
    <p>Empowering Students with Knowledge and Skills</p>
</header>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow-sm">
    <div class="container">

        <a class="navbar-brand fw-bold" href="home">X-Workz Institute</a>

        <button class="navbar-toggler" type="button"
                data-bs-toggle="collapse"
                data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto align-items-center">

                <li class="nav-item">
                    <a class="nav-link active" href="home">Home</a>
                </li>

                <c:choose>
                    <c:when test="${not empty sessionScope.loggedInEmail}">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle"
                               href="#"
                               role="button"
                               data-bs-toggle="dropdown"
                               aria-expanded="false">
                                <svg xmlns="http://www.w3.org/2000/svg"
                                     width="28"
                                     height="28"
                                     fill="white"
                                     viewBox="0 0 16 16">
                                    <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0"/>
                                    <path fill-rule="evenodd"
                                          d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8
                                             m8-7a7 7 0 0 0-5.468 11.37
                                             C3.242 11.226 4.805 10 8 10
                                             s4.757 1.225 5.468 2.37
                                             A7 7 0 0 0 8 1"/>
                                </svg>
                            </a>

                            <ul class="dropdown-menu dropdown-menu-end">
                                <li><a class="dropdown-item" href="profile">My Profile</a></li>
                                <li><a class="dropdown-item" href="logout">Logout</a></li>
                            </ul>
                        </li>
                    </c:when>

                    <c:otherwise>
                        <li class="nav-item">
                            <a class="nav-link" href="signUp">Sign Up</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="signIn">Sign In</a>
                        </li>
                    </c:otherwise>
                </c:choose>

            </ul>
        </div>
    </div>
</nav>

<section class="hero">
    <img src="https://tse3.mm.bing.net/th/id/OIP.8jfNWYTXHMWaTqvJ76AGkwHaE7" alt="Institute Image">
    <div class="intro">
        <h2>Welcome to X-Workz Institute!</h2>
        <p>
            We provide high-quality education and hands-on training to help students
            achieve their career goals with real-time projects.
        </p>
    </div>
</section>

<section class="about">
    <h2>About Us</h2>
    <p>
        X-Workz Institute has been nurturing talent for over a decade.
        We specialize in Java, Spring Boot, Full Stack & Database technologies.
    </p>
</section>

<section class="courses">
    <h2>Courses We Offer</h2>
    <div class="course-list">
        <div class="course">HTML & CSS</div>
        <div class="course">JavaScript</div>
        <div class="course">Java & Spring Boot</div>
        <div class="course">React</div>
        <div class="course">SQL</div>
    </div>
</section>

<footer>
    © 2026 X-Workz Institute | All Rights Reserved
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
