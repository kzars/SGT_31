/* Multi line 
	comment*/

-- Single line comment 

-- Create table

CREATE TABLE Persons(
	PersonID int,
    LastName varchar(100),
    FirstName varchar(100),
    Address varchar(255),
    City varchar(50),
    PRIMARY KEY (PersonID)
); 

-- Inserting records in table

INSERT INTO Persons (PersonID, LastName, FirstName, Address, City)
VALUES (1000, 'Trump', 'Donald', 'House is 515 North County Road, Palm Beach, Florida 33480', 'Florida');
 
INSERT INTO Persons VALUES (1001, 'Obama', 'Barack', '2500 W. Golf Road Hoffman Estates, IL 60169-1114', 'Florida' );

INSERT INTO Persons (PersonID, LastName, FirstName) VALUES (1002, 'Biden', 'Joe');

INSERT INTO Persons (PersonID, LastName, FirstName) VALUES (1003, 'George W.', 'Bush');


-- View table records 

SELECT * FROM persons;

SELECT LastName,City FROM persons;

SELECT LastName, City FROM persons WHERE City = 'Florida';

-- Update data

UPDATE Persons SET City = 'New York' WHERE PersonID = 1002;

-- Delete data

DELETE FROM persons WHERE PersonID = 1003;

-- DELETE TABLE

DROP TABLE Persons;


    