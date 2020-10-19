-- 
-- Setup DB
-- 

-- Database creation
CREATE DATABASE IF NOT EXISTS lol;
USE lol;

-- Default user creation
CREATE USER IF NOT EXISTS 'root'@'localhost' IDENTIFIED BY 'root';
GRANT SELECT, INSERT, DELETE, UPDATE ON lol.* TO 'root'@'localhost';
FLUSH PRIVILEGES;