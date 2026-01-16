<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .error {
            font-size: 0.9rem;
            color: red;
            font-weight: 500;
        }
    </style>
</head>

<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom shadow-sm">
    <div class="container">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link active" href="#">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="signUp">Sign Up</a></li>
                <li class="nav-item"><a class="nav-link" href="signIn">Sign In</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <div class="card p-4">
        <h4 class="text-center mb-4">User Registration</h4>

        <form action="welcome" method="post" onsubmit="return validateForm()">

            <!-- NAME -->
            <div class="mb-3">
                <label class="form-label">Name</label>
                <input type="text" id="name" name="name"
                       class="form-control"
                       value="${param.name}"
                       oninput="validateName()">
                <span id="nameError" class="error"></span>
            </div>

            <!-- EMAIL -->
            <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="email" id="email" name="email"
                       class="form-control"
                       value="${param.email}"
                       oninput="validateEmail()">
                <span id="emailError" class="error"></span>

                <c:if test="${not empty emailError}">
                    <span class="error">${emailError}</span>
                </c:if>
            </div>

            <!-- PHONE -->
            <div class="mb-3">
                <label class="form-label">Phone Number</label>
                <input type="text" id="phone" name="phoneNumber"
                       class="form-control" maxlength="10"
                       value="${param.phoneNumber}"
                       oninput="validatePhone()">
                <span id="phoneError" class="error"></span>

                <c:if test="${not empty phoneError}">
                    <span class="error">${phoneError}</span>
                </c:if>
            </div>

            <!-- AGE -->
            <div class="mb-3">
                <label class="form-label">Age</label>
                <input type="number" id="age" name="age"
                       class="form-control"
                       value="${param.age}"
                       oninput="validateAge()">
                <span id="ageError" class="error"></span>
            </div>

            <!-- GENDER -->
            <div class="mb-3">
                <label class="form-label">Gender</label>
                <select id="gender" name="gender"
                        class="form-select"
                        onchange="validateGender()">
                    <option value="">Select</option>
                    <option ${param.gender == 'Male' ? 'selected' : ''}>Male</option>
                    <option ${param.gender == 'Female' ? 'selected' : ''}>Female</option>
                    <option ${param.gender == 'Other' ? 'selected' : ''}>Other</option>
                </select>
                <span id="genderError" class="error"></span>
            </div>

            <!-- ADDRESS -->
            <div class="mb-3">
                <label class="form-label">Address</label>
                <textarea id="address" name="address"
                          class="form-control"
                          oninput="validateAddress()">${param.address}</textarea>
                <span id="addressError" class="error"></span>
            </div>

            <!-- PASSWORD -->
            <div class="mb-3">
                <label class="form-label">Password</label>
                <input type="password" id="password" name="password"
                       class="form-control"
                       oninput="validatePassword()">
                <span id="passwordError" class="error"></span>
            </div>

           <!-- CONFIRM PASSWORD -->
           <div class="mb-3">
               <label class="form-label">Confirm Password</label>
               <input type="password"
                      id="confirmPassword"
                      name="confirmPassword"
                      class="form-control"
                      oninput="validateConfirmPassword()">
               <span id="confirmPasswordError" class="error"></span>
           </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary px-4">Register</button>
            </div>
        </form>
    </div>
</div>

<script>
    function validateName() {
        const name = document.getElementById("name").value;
        document.getElementById("nameError").innerText =
            (!/^[A-Za-z ]{1,15}$/.test(name) && name !== "") ?
                "Only alphabets allowed (max 15)" : "";
    }

    function validateEmail() {
        const email = document.getElementById("email").value;
        document.getElementById("emailError").innerText =
            (!/^[a-zA-Z0-9._%+-]+@(gmail\.com|outlook\.com)$/.test(email) && email !== "") ?
                "Email must be gmail.com or outlook.com" : "";
    }

    function validatePhone() {
        const phone = document.getElementById("phone").value;
        document.getElementById("phoneError").innerText =
            (!/^[6-9][0-9]{9}$/.test(phone) && phone !== "") ?
                "Phone must start with 6–9 and be 10 digits" : "";
    }

    function validateAge() {
        document.getElementById("ageError").innerText =
            (document.getElementById("age").value <= 0) ?
                "Enter valid age" : "";
    }

    function validateGender() {
        document.getElementById("genderError").innerText =
            (document.getElementById("gender").value === "") ?
                "Please select gender" : "";
    }

    function validateAddress() {
        document.getElementById("addressError").innerText =
            (document.getElementById("address").value.trim() === "") ?
                "Address cannot be empty" : "";
    }

    function validatePassword() {
        document.getElementById("passwordError").innerText =
            (document.getElementById("password").value.length < 6 &&
                document.getElementById("password").value !== "") ?
                "Password must be at least 6 characters" : "";
    }

    function validateConfirmPassword() {
        document.getElementById("confirmPasswordError").innerText =
            (document.getElementById("password").value !==
                document.getElementById("confirmPassword").value &&
                document.getElementById("confirmPassword").value !== "") ?
                "Passwords do not match" : "";
    }

    function validateForm() {
        validateName();
        validateEmail();
        validatePhone();
        validateAge();
        validateGender();
        validateAddress();
        validatePassword();
        validateConfirmPassword();

        return Array.from(document.querySelectorAll(".error"))
            .every(e => e.innerText === "");
    }
</script>

</body>
</html>
