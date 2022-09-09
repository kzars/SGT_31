

CREATE TABLE students(
	sid int not null,
    name text not null,
    PRIMARY KEY (sid)
);

CREATE TABLE teachers(
	tid int not null,
    name text not null,
    PRIMARY KEY(tid)
);

CREATE TABLE subjects(
	subid int not null,
    name text not null,
    PRIMARY KEY(subid)
);

CREATE TABLE grades(
	studentID int not null REFERENCES students(sid),
    teacherID int not null REFERENCES teachers(tid),
    subjectID int not null REFERENCES subjects(subid),
    grade int not null,
    PRIMARY KEY (studentID, teacherID, subjectID)
);

-- Insert data in students table

INSERT INTO students (sid, name) VALUES(1, 'Simon');
INSERT INTO students (sid, name) VALUES(2, 'Alvin');
INSERT INTO students (sid, name) VALUES(3, 'Theo');
INSERT INTO students (sid, name) VALUES(4, 'Brittany');
INSERT INTO students (sid, name) VALUES(5, 'Jenette');
INSERT INTO students (sid, name) VALUES(6, 'Elenor');
INSERT INTO students (sid, name) VALUES(7, 'Stu');

SELECT * FROM students;

-- Insert data in teachers table

INSERT INTO teachers (tid, name) VALUES (1, 'Washington');
INSERT INTO teachers (tid, name) VALUES (2, 'Adams');
INSERT INTO teachers (tid, name) VALUES (3, 'Jefferson');
INSERT INTO teachers (tid, name) VALUES (4, 'Lincoln');

SELECT * FROM teachers;

-- Insert data in subjects table

INSERT INTO subjects (subid, name) VALUES (1, 'History');
INSERT INTO subjects (subid, name) VALUES (2, 'Biology');
INSERT INTO subjects (subid, name) VALUES (3, 'Math');

SELECT * FROM subjects;

-- Insert data in grades table

INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 1, 9);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 2, 10);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 4, 3, 6);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 3, 2, 4);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (6, 2, 1, 5);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (2, 4, 3, 5);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (3, 4, 3, 8);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 3, 10);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 4, 1, 8);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 3, 3, 3);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (6, 2, 2, 5);

SELECT * FROM grades;


-- Students in order by name

SELECT * FROM students ORDER BY name ASC;
SELECT name FROM students ORDER BY name ASC;

-- Grade in History for Simon

SELECT grade FROM grades WHERE studentID = '1' AND subjectID = 1;


-- Names of students who have not yet taken any class

SELECT name FROM students WHERE sid NOT IN (SELECT studentID FROM grades);

-- Names of students who have  taken at least one class

SELECT name FROM students WHERE sid IN (SELECT studentID FROM grades);

-- Names of techers that have not yet taught any class

SELECT name FROM teachers WHERE tid NOT IN (SELECT teacherID FROM grades);


-- Names of teachers who have taught Biology

SELECT name FROM teachers WHERE tid IN (SELECT teacherID FROM grades WHERE subjectID IN 
	(SELECT subid FROM subjects WHERE name = 'Biology')
);

-- What is Biology id?

SELECT subid FROM subjects WHERE name = 'Biology';



-- Count rows

SELECT COUNT(*) FROM grades;

-- SUM column elements

SELECT SUM(grade) FROM grades;

SELECT SUM(grade) AS 'Total sum value of grades' FROM grades;

SELECT SUM(grade) AS 'Simons grades sum' FROM grades WHERE studentID IN (SELECT sid FROM students WHERE name = 'Simon');


-- AVERAGE

SELECT AVG(grade) FROM grades;

-- MIN

SELECT MIN(grade) FROM grades;

-- MAX

SELECT MAX(grade) FROM grades;










