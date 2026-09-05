ALTER TABLE request_history ADD CONSTRAINT FK_history_request 
    FOREIGN KEY (id_request) REFERENCES request(id_request);

ALTER TABLE request_history ADD CONSTRAINT FK_history_user 
    FOREIGN KEY (id_user) REFERENCES users(id_user);