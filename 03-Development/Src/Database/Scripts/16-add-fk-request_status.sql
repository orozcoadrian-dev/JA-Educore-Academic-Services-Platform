ALTER TABLE request_status ADD CONSTRAINT FOREIGN KEY (id_status)
REFERENCES request_status(id_status);

