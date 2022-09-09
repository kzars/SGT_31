
CREATE TABLE users(
	userID int NOT NULL AUTO_INCREMENT,
    username varchar(45) NOT NULL,
    password varchar(45) NOT NULL,
    fullname varchar (45) NOT NULL,
    email varchar (45),
    PRIMARY KEY (userID)
);


INSERT INTO users (username, password, fullname, email)
VALUES ('trumwall', 'mexico', 'Donald Trump', 'maga@gmail.com');

INSERT INTO users (username, password, fullname)
VALUES ('joeRogan', '12345678', ' Joe Rogan');

INSERT INTO users (username, password, email)
VALUES ('Obama333', '123', 'obama@gmail.com');

INSERT INTO users (username, password, email, fullname)
VALUES ('Obama333', '123', 'obama@gmail.com', 'Barack Obama');

SELECT * FROM users;

DROP TABLE IF EXISTS users;