-- Create table students in Ja_Educore database.
CREATE TABLE student(
id_student INTEGER PRIMARY KEY AUTO_INCREMENT,
student_id_number VARCHAR(20) NOT NULL UNIQUE,
semester INT NOT NULL, 
academic_program VARCHAR(100) NOT NULL, 
academic_status VARCHAR(20) NOT NULL,
date_of_entry DATE NOT NULL
);