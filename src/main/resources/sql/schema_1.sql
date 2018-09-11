 CREATE SCHEMA IF NOT EXISTS db3;|
 USE db3;|

 CREATE TABLE IF NOT EXISTS users(
  id INT NOT NULL,
  name VARCHAR(45) NULL,
  password VARCHAR(45) NULL,
  PRIMARY KEY (id));|


 CREATE TABLE IF NOT EXISTS information(
  infoid INT NOT NULL,
  country VARCHAR(45) NULL,
  PRIMARY KEY (infoid));|

 CREATE TABLE IF NOT EXISTS book(
  bookid INT NOT NULL,
  bookname VARCHAR(45) NULL,
  publish VARCHAR(45) NULL,
  PRIMARY KEY (bookid));|
