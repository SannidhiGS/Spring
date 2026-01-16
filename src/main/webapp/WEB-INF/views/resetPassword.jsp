<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Reset Password</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        .error {
            color: red;
            font-size: 0.9rem;
        }
    </style>
</head>

<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom shadow-sm">
    <div class="container">
        <a class="navbar-brand" href="#">Xworkz App</a>
    </div>
</nav>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-5">

            <div class="card shadow p-4">
                <h4 class="text-center mb-4">Reset Your Password</h4>

                <form action="reset-password" method="post">

                    <!-- Email (hidden) -->
                    <input type="hidden" name="email" value="${email}" />

                    <!-- New Password -->
                    <div class="mb-3">
                        <label class="form-label">New Password</label>
                        <input type="password"
                               name="newPassword"
                               class="form-control"
                               placeholder="Enter new password"
                               required />
                    </div>

                    <!-- Confirm Password -->
                    <div class="mb-3">
                        <label class="form-label">Confirm Password</label>
                        <input type="password"
                               name="confirmPassword"
                               class="form-control"
                               placeholder="Confirm new password"
                               required />
                    </div>

                    <!-- Error Message -->
                    <c:if test="${not empty error}">
                        <div class="mb-3">
                            <span class="error">${error}</span>
                        </div>
                    </c:if>

                    <!-- Submit -->
                    <div class="text-center">
                        <button type="submit" class="btn btn-success px-4">
                            Reset Password
                        </button>
                    </div>

                </form>
            </div>

        </div>
    </div>
</div>

</body>
</html>
