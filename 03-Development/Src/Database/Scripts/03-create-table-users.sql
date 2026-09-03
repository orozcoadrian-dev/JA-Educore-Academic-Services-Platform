-- Create table users in Ja_Educore database if it does not exist in our SQL Server instance.
CREATE TABLE users(
id_user INTEGER PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(45) NOT NULL,
second_name VARCHAR(45) NULL,
first_surname VARCHAR(45) NOT NULL,
second_surname VARCHAR(45) NULL,
document_type VARCHAR(3) NOT NULL,
document_number VARCHAR(12) NOT NULL UNIQUE,
username VARCHAR(70) NOT NULL UNIQUE,
user_password VARCHAR(255) NOT NULL,
phone_number VARCHAR(15) NULL,
user_role VARCHAR(20) NOT NULL,
user_status VARCHAR(15) NOT NULL,
registration_date DATE NOT NULL
);