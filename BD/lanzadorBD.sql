CREATE DATABASE IF NOT EXISTS `pint` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `pint`;

CREATE TABLE IF NOT EXISTS usuario (
  idUser int(11) NOT NULL AUTO_INCREMENT,
  Alias varchar(45) NOT NULL UNIQUE,
  Contrasenia varchar(6) NOT NULL,
  Nombre varchar(45) DEFAULT NULL,
  Apellido varchar(45) DEFAULT NULL,
  Email varchar(70) NOT NULL,
  Fecha_Nacim date DEFAULT NULL,
  esAvanzado bool DEFAULT FALSE,
  esVaron bool DEFAULT NULL,
  imagen varchar (80) DEFAULT NULL,
  PRIMARY KEY (idUser));

CREATE TABLE IF NOT EXISTS review (
  idReview int(11) NOT NULL AUTO_INCREMENT,
  Autor varchar(45) NOT NULL,
  idUser int(11) NOT NULL,
  Titulo varchar(45) NOT NULL,
  ValMedia decimal(2,0) NOT NULL,
  PRIMARY KEY (`idReview`), FOREIGN KEY (idUser) REFERENCES usuario (idUser));

CREATE TABLE IF NOT EXISTS comentario (
idComentario int(11) NOT NULL,
fecha date NOT NULL,
hora time (3) NOT NULL,
texto varchar(250) NOT NULL,
valoracion int(2) NOT NULL,
idUser int(11) NOT NULL,
idReview int (11) NOT NULL,
PRIMARY KEY (`idComentario`), FOREIGN KEY (idUser) REFERENCES usuario (idUser),
FOREIGN KEY (idReview) REFERENCES review (idReview));

CREATE TABLE IF NOT EXISTS genero (
idGen int (11) NOT NULL,
Nombre varchar (45) NOT NULL,
PRIMARY KEY (idGen));

CREATE TABLE IF NOT EXISTS generoJuego (
idGen int (11) NOT NULL,
Nombre varchar (45) NOT NULL,
PRIMARY KEY (idGen));

CREATE TABLE IF NOT EXISTS juego (
  idReview int(11) NOT NULL,
  productora varchar(45) NOT NULL,
  num_jug int(11) NOT NULL,
  idGen int (11) NOT NULL,
  PRIMARY KEY (`idReview`),
  FOREIGN KEY (idReview) REFERENCES review (idReview),
  FOREIGN KEY (idGen) REFERENCES generoJuego (idGen)
);

CREATE TABLE IF NOT EXISTS serie (
  idReview int(11) NOT NULL,
  temporadas int(2) NOT NULL,
  dura_cap int(4) NOT NULL,
  productora varchar(45) NOT NULL,
  idGen int (11) NOT NULL,
  PRIMARY KEY (`idReview`),
  FOREIGN KEY (idReview) REFERENCES review (idReview),
  FOREIGN KEY (idGen) REFERENCES genero (idGen)
);

CREATE TABLE IF NOT EXISTS libro (
  idReview int(11) NOT NULL,
  autor varchar(45) NOT NULL,
  editorial varchar(45) NOT NULL,
  paginas int(11) NOT NULL,
  idGen int (11) NOT NULL,
  PRIMARY KEY (`idReview`),
  FOREIGN KEY (idReview) REFERENCES review (idReview),
  FOREIGN KEY (idGen) REFERENCES genero (idGen)
);

CREATE TABLE IF NOT EXISTS pelicula (
  idReview int(11) NOT NULL,
  director varchar(45) NOT NULL,
  productora varchar(45) NOT NULL,
  duracion int(11) NOT NULL,
  fecha_estreno date NOT NULL,
  idGen int (11) NOT NULL,
  PRIMARY KEY (`idReview`),
  FOREIGN KEY (idReview) REFERENCES review (idReview),
  FOREIGN KEY (idGen) REFERENCES genero (idGen)
);