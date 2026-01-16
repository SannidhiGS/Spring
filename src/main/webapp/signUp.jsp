<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="card p-4">
        <h4 class="text-center mb-4">User Registration</h4>

        <!-- Correct single form -->
        <form action="welcome" method="post" onsubmit="return validateForm()">

            <div class="mb-3">
                <label class="form-label">Name</label>
                <input type="text" id="name" name="name" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="email" id="email" name="email" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Phone Number</label>
                <input type="text" id="phone" name="phoneNumber" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Age</label>
                <input type="number" id="age" name="age" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Gender</label>
                <select id="gender" name="gender" class="form-select">
                    <option value="">Select</option>
                    <option>Male</option>
                    <option>Female</option>
                    <option>Other</option>
                </select>
            </div>

            <div class="mb-3">
                <label class="form-label">Address</label>
                <textarea id="address" name="address" class="form-control"></textarea>
            </div>

            <div class="mb-3">
                <label class="form-label">Password</label>
                <input type="password" id="password" name="password" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Confirm Password</label>
                <input type="password" id="confirmPassword" name="confirmPassword" class="form-control">
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary px-4">Register</button>
            </div>
        </form>
    </div>
</div>

<script>
function validateForm() {

    let name = document.getElementById("name").value.trim();
    let email = document.getElementById("email").value.trim();
    let phone = document.getElementById("phone").value.trim();
    let age = document.getElementById("age").value;
    let gender = document.getElementById("gender").value;
    let address = document.getElementById("address").value.trim();
    let password = document.getElementById("password").value;
    let confirmPassword = document.getElementById("confirmPassword").value;

    // Name validation (letters only, max 15)
    let nameRegex = /^[A-Za-z]{1,15}$/;
    if (!nameRegex.test(name)) {
        alert("Name must contain only letters and max 15 characters");
        return false;
    }

    // Email validation
    let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
        alert("Enter valid email");
        return false;
    }

    // Phone validation
    let phoneRegex = /^[6-9][0-9]{9}$/;
    if (!phoneRegex.test(phone)) {
        alert("Phone number must be 10 digits and start with 6,7,8, or 9");
        return false;
    }

    // Age validation
    if (age <= 0) {
        alert("Enter valid age");
        return false;
    }

    if (gender === "") {
        alert("Please select gender");
        return false;
    }

    if (address === "") {
        alert("Address cannot be empty");
        return false;
    }

    if (password.length < 6) {
        alert("Password must be at least 6 characters");
        return false;
    }

    if (password !== confirmPassword) {
        alert("Password and Confirm Password must be same");
        return false;
    }

    return true;
}
</script>

</body>
</html>
