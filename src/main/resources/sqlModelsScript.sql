CREATE DATABASE IF NOT EXISTS `currency_exchange`;
CREATE DATABASE IF NOT EXISTS `ec_test`;
USE `currency_exchange`;
USE `ec_test`;

show databases;
show tables;
drop database `ec_test`;

# roles table

CREATE TABLE roles (
  id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(60) NOT NULL UNIQUE,
  created_at datetime NOT NULL,
  updated_at datetime NOT NULL

) ENGINE=INNODB CHARACTER SET utf8 COLLATE utf8_general_ci;

INSERT INTO roles(name, created_at, updated_at) VALUES('ROLE_USER', '2018/10/20', '2018/10/20');
INSERT INTO roles(name, created_at, updated_at) VALUES('ROLE_ADMIN', '2018/10/20', '2018/10/20');
INSERT INTO roles(name, created_at, updated_at) VALUES('ROLE_MANAGER', '2018/10/20', '2018/10/20');

SELECT * FROM `roles`;

# users table

CREATE TABLE users (
  id INT(11) AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(60) NOT NULL UNIQUE,
  username VARCHAR(60) DEFAULT NULL,
  email VARCHAR(60) NOT NULL UNIQUE,
  password VARCHAR(60) NOT NULL,
  created_at datetime NOT NULL,
  updated_at datetime NOT NULL

) ENGINE=INNODB CHARACTER SET utf8 COLLATE utf8_general_ci;

INSERT INTO users(name, username, email, password, created_at, updated_at)
  VALUE ('Peet', 'Petr Gulchuk', 'peet@gmail.com', '1111', '2018/10/20', '2018/10/20');

SELECT * FROM `users`;

# user_role table

CREATE TABLE `user_role` (
  `user_id` INT(11) NOT NULL,
  `role_id` INT(11) NOT NULL,

  PRIMARY KEY (`user_id`, `role_id`),

  KEY `FK_STUDENT_idx` (`role_id`),

  CONSTRAINT `FK_USER`
  FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),

  CONSTRAINT `FK_ROLE`
  FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`)
) ENGINE=INNODB CHARACTER SET utf8 COLLATE utf8_general_ci;

SELECT * FROM user_role;

# exchange_currency table

DROP TABLE exchange_company;

TRUNCATE TABLE exchange_company;

INSERT INTO exchange_company VALUES (1, '2018/10/20', '2018/10/21', 'some_3', 'some_4', 'some_5', 'some_6', 1.1, 'some_8', 'some_9', 1, 1);

SELECT * FROM exchange_company;
SELECT * FROM exchange_company INNER JOIN exchange_company_detail ON exchange_company.exchange_company_detail_id = exchange_company_detail.id;
SELECT * FROM exchange_company LEFT JOIN comments ON exchange_company.id = comments.exchange_company_id;

SELECT * FROM exchange_company LEFT JOIN currency_rate ON exchange_company.id = currency_rate.exchange_company_id;
SELECT * FROM exchange_company LEFT JOIN exchange_company_parse_data ON exchange_company.exchange_company_parse_data_id = exchange_company_parse_data.id;

# exchange_currency_detail table

DROP TABLE exchange_company_detail;
TRUNCATE TABLE exchange_company_detail;

INSERT INTO exchange_company_detail VALUES (1, 'description', 'email@.some.ru', '1234567890', 'website.com');

SELECT * FROM exchange_company_detail;

# Comments table

INSERT INTO comments VALUES (1, '2018/10/20', '2018/10/21', true, false, 'Name', 'text', 'title', 1);
INSERT INTO comments VALUES (2, '2018/10/20', '2018/10/21', true, false, 'Name2', 'text2', 'title2', 2);
INSERT INTO comments VALUES (3, '2018/10/20', '2018/10/21', false, true, 'Name3', 'text3', 'title3', 3);
INSERT INTO comments VALUES (4, '2018/10/20', '2018/10/21', false, true, 'Name4', 'text4', 'title4', 1);

SELECT * FROM comments;
TRUNCATE TABLE comments;

# currency_rate table

SELECT * FROM currency_rate;
TRUNCATE TABLE currency_rate;

INSERT INTO currency_rate VALUES (1, '2018/10/20', '2018/10/21', 4.020, 'Dollar', 'USD', 4.0012, 1);
INSERT INTO currency_rate VALUES (2, '2018/10/20', '2018/10/21', 4.020, 'Dollar', 'USD', 4.0012, 1);
INSERT INTO currency_rate VALUES (3, '2018/10/20', '2018/10/21', 4.02, 'Dollar', 'USD', 4.00, 2);

# exchange_company_parse_data table

SELECT * FROM exchange_company_parse_data;
TRUNCATE TABLE exchange_company_parse_data;

INSERT INTO exchange_company_parse_data VALUES (1, 'selector sell', 'selector currency amount', 'selector currency type', true, 'params', 'selector row', 'selector sell', 'url');

# working_time table

SELECT * FROM working_time;

DROP TABLE working_time;
TRUNCATE TABLE working_time;