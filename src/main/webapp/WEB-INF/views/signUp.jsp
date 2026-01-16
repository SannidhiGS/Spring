<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html>
<head>
    <title>Sign Up</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">
<div class="container mt-5">
    <div class="card p-4">

        <h4 class="text-center">User Registration</h4>


        <form action="${pageContext.request.contextPath}/welcome"
              method="post"
              enctype="multipart/form-data">

            <input type="text" name="name" class="form-control mb-2" placeholder="Name" required>
            <input type="email" name="email" class="form-control mb-2" placeholder="Email" required>
            <input type="text" name="phoneNumber" class="form-control mb-2" placeholder="Phone" required>
            <input type="number" name="age" class="form-control mb-2" placeholder="Age" required>

            <select name="gender" class="form-control mb-2" required>
                <option value="">Select Gender</option>
                <option>Male</option>
                <option>Female</option>
                <option>Other</option>
            </select>

            <textarea name="address" class="form-control mb-2" placeholder="Address"></textarea>

            <input type="password" name="password" class="form-control mb-2" placeholder="Password" required>
            <input type="password" name="confirmPassword" class="form-control mb-2" placeholder="Confirm Password" required>


            <input type="file" name="profilePhoto" class="form-control mb-3">

            <button class="btn btn-primary w-100">Register</button>
        </form>

    </div>
</div>
</body>
</html>
