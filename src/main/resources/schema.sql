create table students(
	id int NOT NULL AUTO_INCREMENT,
	nombre varchar(100) not null,
	apellido varchar(100) not null,
	contraseña varchar(100) not null,
	email varchar(100),
	PRIMARY KEY(id)
);