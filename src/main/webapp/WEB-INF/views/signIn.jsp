<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Sign In</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
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
    <div class="card p-4">
        <h4 class="text-center mb-4">Sign In</h4>

        <!-- SHOW BACKEND ERROR -->
        <div class="text-danger text-center mb-2">
            ${error}
        </div>

        <form action="login" method="post" onsubmit="return validateLogin()">

            <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="email" id="email" name="email"
                       class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Password</label>
                <input type="password" id="password" name="password"
                       class="form-control" required>
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-success px-4">
                    Sign In
                </button>
            </div>

        </form>
    </div>
</div>

<script>
function validateLogin() {
    let email = document.getElementById("email").value.trim();
    let password = document.getElementById("password").value;

    let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (!emailRegex.test(email)) {
        alert("Enter valid email");
        return false;
    }

    if (password.length < 6) {
        alert("Password must be at least 6 characters");
        return false;
    }
    return true;
}
</script>

</body>
</html>
