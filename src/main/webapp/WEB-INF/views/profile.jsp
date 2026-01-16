<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>My Profile</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-dark bg-dark px-4">
    <a class="navbar-brand fw-bold" href="#">ShivaniR_Xworkz_Module</a>
</nav>

<div class="container mt-5">

    <!-- If user exists -->
    <c:if test="${not empty user}">
        <div class="card shadow">
            <div class="card-header bg-primary text-white">
                <h4>My Profile</h4>
            </div>

            <div class="card-body">
                <p><strong>Name:</strong> ${user.name}</p>
                <p><strong>Email:</strong> ${user.email}</p>
                <p><strong>Mobile:</strong> ${user.phoneNumber}</p>
                <p><strong>Gender:</strong> ${user.gender}</p>
                <p><strong>Age:</strong> ${user.age}</p>
                <p><strong>Address:</strong> ${user.address}</p>
            </div>

            <div class="card-footer text-end">
                <a href="${pageContext.request.contextPath}/home"
                   class="btn btn-secondary">
                    Back
                </a>
            </div>
        </div>
    </c:if>

    <!-- If user is NULL -->
    <c:if test="${empty user}">
        <div class="alert alert-danger mt-4">
            User profile not found. Please login again.
        </div>
        <a href="${pageContext.request.contextPath}/signIn"
           class="btn btn-primary">
            Login
        </a>
    </c:if>

</div>

</body>
</html>
