<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sannidhi-Xworkz</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Favicon -->
    <link rel="icon" type="image/png"
          href="<c:url value='/images/logo.png' />">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
    <div class="container">

        <!-- Logo -->
        <a class="navbar-brand" href="#">
            <img src="<c:url value='/images/logo.png' />"
                 alt="Logo"
                 width="40"
                 height="40">
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

<!-- Content -->
<div class="container mt-4 text-center">
    <h3>Welcome to Sannidhi-Xworkz</h3>
    <p class="text-muted">Please sign up or sign in to continue</p>

    <a href="signUp" class="btn btn-primary me-2">Sign Up</a>
    <a href="signIn" class="btn btn-outline-primary">Sign In</a>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
