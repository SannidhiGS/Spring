🧩 Sannidhi-XWorkz-Module

A Java Web Application built using Spring MVC, Hibernate/JPA, and JSP that manages Batches and Students with a clean MVC architecture.
This project is designed as part of the XWorkz training module to demonstrate real-world backend + frontend integration.

🚀 Features

🔐 User Registration & Login

🧱 Batch Management

👨‍🎓 Student Management

📋 View Students by Batch

🧭 Dynamic Navbar with Batch Dropdown

🗄️ Database persistence using Hibernate/JPA

🎨 Responsive UI using Bootstrap

🛠️ Tech Stack
Backend

Java (Core Java)

Spring MVC

Hibernate / JPA

JDBC

Frontend

JSP

JSTL

HTML5

CSS3

Bootstrap 5

Database

MySQL

Server & Tools

Apache Tomcat

Maven

Git & GitHub

📂 Project Structure (Simplified)
Sannidhi-XWorkz-Module
│
├── src/main/java
│   ├── controller
│   ├── service
│   ├── dao
│   ├── dto
│   └── entity
│
├── src/main/webapp
│   ├── WEB-INF
│   │   └── views
│   │       ├── header.jsp
│   │       ├── batchDetails.jsp
│   │       └── other JSP pages
│   └── resources
│
├── pom.xml
└── README.md

🧭 Application Flow

User logs in to the application

Navbar loads available Batches dynamically

Clicking a batch opens Student List Page

Students are displayed based on selected batch

📄 Key Pages

header.jsp – Navigation bar with batch dropdown

batchDetails.jsp – Displays students of selected batch

Login / Register Pages – Authentication flow

🗃️ Database Tables (Example)

batch

student

user

Relationships:

One Batch → Many Students

⚙️ Setup Instructions

Clone the repository

git clone https://github.com/your-username/Sannidhi-XWorkz-Module.git


Import project into Eclipse / IntelliJ as a Maven project

Configure MySQL database and update application.properties

Deploy on Apache Tomcat

Access application via browser

🎯 Learning Outcomes

Hands-on experience with Spring MVC architecture

Understanding of Hibernate/JPA relationships

JSP + JSTL dynamic rendering

Real-world MVC project structure

👩‍💻 Author

Sannidhi
Java & Web Development Trainee
XWorkz Training Institute
