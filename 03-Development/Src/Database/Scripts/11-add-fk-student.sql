ALTER TABLE student ADD id_user INTEGER NOT NULL;
ALTER TABLE student ADD CONSTRAINT FK_student_user 
    FOREIGN KEY (id_user) REFERENCES users(id_user);