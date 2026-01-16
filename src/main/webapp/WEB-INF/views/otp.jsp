<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<!doctype html>
<html>
<head>
    <title>Verify OTP</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom shadow-sm">
    <div class="container">
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
    <div class="card p-4 mx-auto" style="max-width: 400px">
        <h4 class="text-center mb-3">Verify OTP</h4>

        <form action="verifyOtp" method="post">

            <input type="hidden" name="email" value="${email}"/>

            <div class="mb-3">
                <label>Enter OTP</label>
                <input type="text" name="otp" class="form-control" required>
            </div>

            <div class="text-danger text-center">${error}</div>

            <button class="btn btn-primary w-100">Verify</button>
        </form>
    </div>
</div>

</body>
</html>
