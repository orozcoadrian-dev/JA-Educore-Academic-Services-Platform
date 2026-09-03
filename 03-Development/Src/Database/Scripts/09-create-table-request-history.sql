CREATE TABLE request_history(
id_history INTEGER PRIMARY KEY AUTO_INCREMENT,
id_request INTEGER NOT NULL,
last_status VARCHAR(20) NOT NULL,
current_status VARCHAR(20) NOT NULL,
change_date DATE NULL,
id_user INTEGER NULL,
observation VARCHAR(200) NULL
);