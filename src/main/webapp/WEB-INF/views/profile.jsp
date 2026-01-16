<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>My Profile</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <div class="card shadow">
        <div class="card-header bg-primary text-white">
            <h4>My Profile</h4>
        </div>
        <div class="card-body">
            <p><strong>Name:</strong> ${user.name}</p>
            <p><strong>Email:</strong> ${user.email}</p>
            <p><strong>Mobile:</strong> ${user.mobile}</p>
            <p><strong>Course:</strong> ${user.course}</p>
            <p><strong>Registered On:</strong> ${user.createdAt}</p>
        </div>
        <div class="card-footer text-end">
            <a href="home" class="btn btn-secondary">Back</a>
        </div>
    </div>
</div>
</body>
</html>
