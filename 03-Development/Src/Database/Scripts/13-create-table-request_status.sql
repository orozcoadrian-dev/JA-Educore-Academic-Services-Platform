CREATE TABLE request_status(
id_status INTEGER PRIMARY KEY AUTO_INCREMENT,
status_name VARCHAR(20) NOT NULL UNIQUE,
status_description VARCHAR(200) NULL
);