Create database xworkz;
use xworkz;
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE,
    phoneNumber VARCHAR(15) NOT NULL,
    age INT,
    gender VARCHAR(10),
    address VARCHAR(255),
    password VARCHAR(255) NOT NULL,
    confirmPassword VARCHAR(255) NOT NULL
);

ALTER TABLE users
DROP COLUMN confirmPassword;

Select * from users;


ALTER TABLE users
ADD failed_attempts INT DEFAULT 0,
ADD account_locked BOOLEAN DEFAULT FALSE,
ADD otp VARCHAR(6),
ADD otp_expiry TIMESTAMP;

CREATE TABLE batches (
    id INT PRIMARY KEY AUTO_INCREMENT,
    batch_name VARCHAR(50)
);

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    dob DATE,
    year_of_passout INT,
    tenth_percentage DOUBLE,
    twelfth_percentage DOUBLE,
    degree_type VARCHAR(50),
    degree_percentage DOUBLE,
    batch_id INT,
    FOREIGN KEY (batch_id) REFERENCES batches(id)
);
CREATE TABLE batches (
    id INT PRIMARY KEY AUTO_INCREMENT,
    batch_name VARCHAR(100) NOT NULL
);
Select * from batches;
