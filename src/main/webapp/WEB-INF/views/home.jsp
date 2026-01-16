<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>XYZ Institute</title>
    <style>
        body {
            margin: 0;
            font-family: 'Arial', sans-serif;
            background-color: #f4f6f8;
        }

        header {
            background-color: #0a66c2;
            color: white;
            padding: 40px 20px;
            text-align: center;
        }

        header h1 {
            margin: 0;
            font-size: 2.5em;
        }

        header p {
            font-size: 1.2em;
            margin-top: 10px;
        }

        nav {
            background-color: #222;
            text-align: center;
            padding: 10px;
        }

        nav a {
            color: white;
            margin: 0 15px;
            text-decoration: none;
            font-weight: bold;
            transition: 0.3s;
        }

        nav a:hover {
            color: #0a66c2;
        }

        .hero {
            display: flex;
            align-items: center;
            justify-content: center;
            flex-wrap: wrap;
            padding: 50px 20px;
            background-color: #ffffff;
        }

        .hero img {
            max-width: 300px;
            border-radius: 10px;
            margin: 20px;
        }

        .hero .intro {
            max-width: 600px;
            margin: 20px;
        }

        .intro h2 {
            font-size: 2em;
            color: #0a66c2;
        }

        .intro p {
            font-size: 1.1em;
            line-height: 1.6;
        }

        .about, .courses {
            padding: 50px 20px;
            text-align: center;
        }

        .about h2, .courses h2 {
            font-size: 2em;
            color: #0a66c2;
            margin-bottom: 20px;
        }

        .about p {
            max-width: 700px;
            margin: 0 auto;
            font-size: 1.1em;
            line-height: 1.6;
        }

        .course-list {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
            gap: 20px;
            margin-top: 30px;
        }

        .course {
            background-color: white;
            padding: 20px 30px;
            border-radius: 10px;
            box-shadow: 0px 5px 15px rgba(0,0,0,0.1);
            font-weight: bold;
            transition: 0.3s;
        }

        .course:hover {
            transform: scale(1.05);
            box-shadow: 0px 8px 20px rgba(0,0,0,0.2);
        }

        footer {
            background-color: #222;
            color: white;
            text-align: center;
            padding: 20px;
        }

        @media(max-width: 768px) {
            .hero {
                flex-direction: column;
            }
        }
    </style>
</head>
<body>

<header>
    <h1>XYZ Institute</h1>
    <p>Empowering Students with Knowledge and Skills</p>
</header>

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

<section class="hero">
    <img src="https://tse3.mm.bing.net/th/id/OIP.8jfNWYTXHMWaTqvJ76AGkwHaE7?rs=1&pid=ImgDetMain&o=7&rm=3" alt="Institute Image">
    <div class="intro">
        <h2>Welcome to X-Workz Institute!</h2>
        <p>At X-Workz Institute, we provide high-quality education and hands-on training to help students achieve their career goals. Our expert faculty and modern infrastructure ensure a practical learning experience in every field.</p>
    </div>
</section>

<section class="about" id="about">
    <h2>About Us</h2>
    <p>X-WorkZ Institute has been nurturing talent for over a decade. We specialize in full-stack development, data science, AI & ML, and professional courses. Our mission is to provide industry-ready skills through practical and project-based learning.</p>
</section>

<section class="courses" id="courses">
    <h2>Courses We Offer</h2>
    <div class="course-list">
        <div class="course">HTML & CSS</div>
        <div class="course">JavaScript</div>
        <div class="course">Java & Spring Boot</div>
        <div class="course">React</div>
        <div class="course">SQL & Databases</div>
    </div>
</section>

<section class="about" id="contact">
    <h2>Contact Us</h2>
    <p>Email: xworkz@institute.com | Phone: +91 1234567890 | Address: Rajajinagar</p>
</section>

<footer>
    © 2026 XYZ Institute | All Rights Reserved
</footer>

</body>
</html>
