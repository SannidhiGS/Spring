<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Successful</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(135deg, #e3f2fd, #ffffff);
            min-height: 100vh;
        }
        .success-card {
            max-width: 500px;
            margin: auto;
            border-radius: 15px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.1);
        }
        .success-icon {
            font-size: 4rem;
            color: #28a745;
        }
    </style>
</head>

<body>

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-light bg-white border-bottom shadow-sm">
    <div class="container">
        <a class="navbar-brand fw-bold text-primary" href="#">Xworkz</a>

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

<!-- SUCCESS CONTENT -->
<div class="container d-flex align-items-center justify-content-center mt-5">
    <div class="card success-card text-center p-4">
        <div class="card-body">
            <div class="success-icon mb-3">✔</div>
            <h3 class="text-success mb-3">Registration Successful</h3>
            <p class="text-muted">
                Your data has been saved successfully.
                You can now sign in using your credentials.
            </p>

            <div class="d-grid gap-2 mt-4">
                <a href="signIn" class="btn btn-success">Go to Sign In</a>
                <a href="signUp" class="btn btn-outline-primary">Register Another User</a>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
