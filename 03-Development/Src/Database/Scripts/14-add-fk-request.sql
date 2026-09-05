ALTER TABLE request ADD CONSTRAINT FK_request_student 
    FOREIGN KEY (id_student) REFERENCES student(id_student);

ALTER TABLE request ADD CONSTRAINT FK_request_official 
    FOREIGN KEY (id_official) REFERENCES official(id_official);

ALTER TABLE request ADD CONSTRAINT FK_request_type 
    FOREIGN KEY (type_id_request) REFERENCES request_type(id_request_type);

