
ALTER TABLE official ADD id_user INTEGER NOT NULL;
ALTER TABLE official ADD CONSTRAINT FK_official_user 
    FOREIGN KEY (id_user) REFERENCES users(id_user);