<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>X-Workz</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom shadow-sm">
    <div class="container">

        <!-- LOGO ONLY -->
        <a class="navbar-brand" href="#">
            <img src="<c:url value='/images/logo.png' />"
                 alt="X-Workz Logo"
                 width="45"
                 height="45">
        </a>

        <button class="navbar-toggler" type="button"
                data-bs-toggle="collapse"
                data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="signUp">Sign Up</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="signIn">Sign In</a>
                </li>
            </ul>
        </div>

    </div>
</nav>

<div class="container mt-5">
    <div class="row align-items-center">

        <!-- TEXT CONTENT -->
        <div class="col-md-6">
            <h1 class="fw-bold">Build Your IT Career</h1>

            <p class="text-muted mt-3">
                Learn <strong>Java, Spring MVC, Hibernate, SQL & Web Technologies</strong>
                with real-time projects and placement-focused training.
            </p>

            <ul class="list-unstyled mt-3">
                <li>✅ Core Java & OOP</li>
                <li>✅ Spring MVC & Hibernate</li>
                <li>✅ SQL & Database</li>
                <li>✅ Real-Time Projects</li>
                <li>✅ Interview Preparation</li>
            </ul>

            <div class="mt-4">
                <a href="signUp" class="btn btn-primary btn-lg me-2">Get Started</a>
                <a href="signIn" class="btn btn-outline-primary btn-lg">Login</a>
            </div>
        </div>

        <!-- IMAGE -->
        <div class="col-md-6 text-center">
            <img
                src="<c:url value='/images/img.png' />"
                alt="Computer Learning"
                class="img-fluid rounded shadow">
        </div>

    </div>
</div>

<!-- ================= FOOTER ================= -->
<footer class="bg-light mt-5 py-3 border-top">
    <div class="container text-center text-muted">
        © 2026 X-Workz | Learn • Practice • Get Hired
    </div>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
