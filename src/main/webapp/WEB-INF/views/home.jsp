<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>X-Workz Institute | Home</title>

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

        .intro {
            max-width: 600px;
            margin: 20px;
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

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark px-4">
    <a class="navbar-brand fw-bold" href="home">X-Workz Institute</a>

    <button class="navbar-toggler" type="button"
            data-bs-toggle="collapse"
            data-bs-target="#mainNavbar">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="mainNavbar">

        <!-- LEFT MENU -->
        <ul class="navbar-nav me-auto ms-3">

            <li class="nav-item">
                <a class="nav-link active" href="home">Home</a>
            </li>

            <!-- BATCH DROPDOWN -->
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle"
                   href="#"
                   role="button"
                   data-bs-toggle="dropdown"
                   aria-expanded="false">
                    Batches
                </a>

                <ul class="dropdown-menu">
                    <c:forEach items="${batches}" var="batch">
                        <li>
                            <a class="dropdown-item"
                               href="${pageContext.request.contextPath}/batch/${batch.id}">
                                ${batch.batchName}
                            </a>
                        </li>
                    </c:forEach>

                    <c:if test="${empty batches}">
                        <li class="dropdown-item text-muted text-center">
                            No batches available
                        </li>
                    </c:if>
                </ul>
            </li>

            <li class="nav-item">
                <a class="nav-link" href="signUp">Sign Up</a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href="signIn">Sign In</a>
            </li>
        </ul>

        <!-- PROFILE DROPDOWN (RIGHT) -->
        <div class="dropdown">
            <button class="btn btn-light dropdown-toggle"
                    data-bs-toggle="dropdown">
                Profile
            </button>

            <ul class="dropdown-menu dropdown-menu-end">
                <li class="dropdown-item-text text-center fw-bold">
                    ${sessionScope.loggedInEmail}
                </li>

                <li><hr class="dropdown-divider"></li>

                <li>
                    <a class="dropdown-item"
                       href="${pageContext.request.contextPath}/profile">
                        My Profile
                    </a>
                </li>

                <li>
                    <a class="dropdown-item text-danger"
                       href="${pageContext.request.contextPath}/logout">
                        Logout
                    </a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- LOGIN MESSAGE -->
<div class="container text-center mt-4">
    <h1 class="text-success fw-bold">LOGIN SUCCESSFUL</h1>
    <p class="fs-5">Welcome to your dashboard</p>
</div>

<!-- HERO -->
<section class="hero">
    <img src="https://tse3.mm.bing.net/th/id/OIP.8jfNWYTXHMWaTqvJ76AGkwHaE7"
         alt="Institute Image">
    <div class="intro">
        <h2 class="text-primary">Welcome to X-Workz Institute!</h2>
        <p>
            At X-Workz Institute, we provide high-quality education and
            hands-on training to help students achieve their career goals.
        </p>
    </div>
</section>

<section class="about">
    <h2>About Us</h2>
    <p>
        X-WorkZ Institute specializes in full-stack development,
        data science, AI & ML with industry-ready training.
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
    © 2026 XYZ Institute | All Rights Reserved
</footer>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
