<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .error { font-size: 0.9rem; color: red; font-weight: 500; }
    </style>
</head>
<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom shadow-sm">
    <div class="container">
        <ul class="navbar-nav ms-auto">
            <li class="nav-item"><a class="nav-link active" href="home">Home</a></li>
            <li class="nav-item"><a class="nav-link" href="signUp">Sign Up</a></li>
            <li class="nav-item"><a class="nav-link" href="signIn">Sign In</a></li>
        </ul>
    </div>
</nav>

<div class="container mt-5">
    <div class="card p-4">
        <h4 class="text-center mb-4">User Registration</h4>

        <c:if test="${not empty error}">
            <div class="alert alert-danger">${error}</div>
        </c:if>
        <c:if test="${not empty success}">
            <div class="alert alert-success">${success}</div>
        </c:if>

        <form action="welcome" method="post" enctype="multipart/form-data" onsubmit="return validateForm()">

            <div class="mb-3">
                <label class="form-label">Name</label>
                <input type="text" name="name" class="form-control" value="${appDTO.name}">
            </div>

            <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="email" name="email" class="form-control" value="${appDTO.email}">
            </div>

            <div class="mb-3">
                <label class="form-label">Phone Number</label>
                <input type="text" name="phoneNumber" maxlength="10" class="form-control" value="${appDTO.phoneNumber}">
            </div>

            <div class="mb-3">
                <label class="form-label">Age</label>
                <input type="number" name="age" class="form-control" value="${appDTO.age}">
            </div>

            <div class="mb-3">
                <label class="form-label">Gender</label>
                <select name="gender" class="form-select">
                    <option value="">Select</option>
                    <option ${appDTO.gender == 'Male' ? 'selected' : ''}>Male</option>
                    <option ${appDTO.gender == 'Female' ? 'selected' : ''}>Female</option>
                    <option ${appDTO.gender == 'Other' ? 'selected' : ''}>Other</option>
                </select>
            </div>

            <div class="mb-3">
                <label class="form-label">Address</label>
                <textarea name="address" class="form-control">${appDTO.address}</textarea>
            </div>

            <div class="mb-3">
                <label class="form-label">Password</label>
                <input type="password" name="password" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Confirm Password</label>
                <input type="password" name="confirmPassword" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Profile Photo</label>
                <input type="file" name="profilePhoto" class="form-control"/>
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary px-4">Register</button>
            </div>

        </form>
    </div>
</div>

</body>
</html>
