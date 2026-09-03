CREATE TABLE request_type(
id_request_type INTEGER PRIMARY KEY AUTO_INCREMENT,
request_type_name VARCHAR(20) NOT NULL,
request_type_description VARCHAR(280) NOT NULL,
documents VARCHAR(280) NOT NULL,
estimated_response_time VARCHAR(20) NULL
);