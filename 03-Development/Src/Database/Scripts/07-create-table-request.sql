CREATE TABLE request(
id_request INTEGER PRIMARY KEY AUTO_INCREMENT,
request_id_number VARCHAR(20) NOT NULL UNIQUE,
creation_date DATE NOT NULL, 
request_description VARCHAR(280) NULL,
id_student INTEGER NOT NULL,
id_official INTEGER NULL,
type_id_request INTEGER NOT NULL,
request_status VARCHAR(15) NOT NULL,
last_update_date DATE NULL
);