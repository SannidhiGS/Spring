create database file;
use file;

//Creating the TABLE
CREATE TABLE restaurant (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    owner VARCHAR(100) NOT NULL,
    phone VARCHAR(15) NOT NULL,
    email VARCHAR(100),
    location VARCHAR(150),
    pincode VARCHAR(10),
    fssai VARCHAR(20),
    code VARCHAR(50),
    sign VARCHAR(50),
    cuisine VARCHAR(50)
);
select * from restaurant;