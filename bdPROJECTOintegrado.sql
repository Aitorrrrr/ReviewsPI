-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.1.21-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para pint
CREATE DATABASE IF NOT EXISTS `pint` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `pint`;

-- Volcando estructura para tabla pint.comentario
CREATE TABLE IF NOT EXISTS `comentario` (
  `idComentario` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time(3) NOT NULL,
  `texto` varchar(250) NOT NULL,
  `valoracion` int(2) NOT NULL,
  `idUser` int(11) NOT NULL,
  PRIMARY KEY (`idComentario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla pint.juego
CREATE TABLE IF NOT EXISTS `juego` (
  `idReview` int(11) NOT NULL,
  `productora` varchar(45) NOT NULL,
  `num_jug` int(11) NOT NULL,
  `genero` varchar(45) NOT NULL,
  PRIMARY KEY (`idReview`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla pint.libro
CREATE TABLE IF NOT EXISTS `libro` (
  `idReview` int(11) NOT NULL,
  `autor` varchar(45) NOT NULL,
  `editorial` varchar(45) NOT NULL,
  `paginas` int(11) NOT NULL,
  `genero` varchar(45) NOT NULL,
  PRIMARY KEY (`idReview`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla pint.pelicula
CREATE TABLE IF NOT EXISTS `pelicula` (
  `idReview` int(11) NOT NULL,
  `director` varchar(45) NOT NULL,
  `productora` varchar(45) NOT NULL,
  `duracion` int(11) NOT NULL,
  `fecha_estreno` date NOT NULL,
  `genero` varchar(45) NOT NULL,
  PRIMARY KEY (`idReview`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla pint.review
CREATE TABLE IF NOT EXISTS `review` (
  `idReview` int(11) NOT NULL,
  `Autor` varchar(45) NOT NULL,
  `idUser` int(11) NOT NULL,
  `Titulo` varchar(45) NOT NULL,
  `ValMedia` decimal(2,0) NOT NULL,
  PRIMARY KEY (`idReview`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla pint.serie
CREATE TABLE IF NOT EXISTS `serie` (
  `idReview` int(11) NOT NULL,
  `temporadas` varchar(45) NOT NULL,
  `dura_cap` varchar(45) NOT NULL,
  `productora` varchar(45) NOT NULL,
  `genero` varchar(45) NOT NULL,
  PRIMARY KEY (`idReview`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla pint.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `idUser` int(11) NOT NULL,
  `Alias` varchar(45) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Apellido` varchar(45) DEFAULT NULL,
  `Fecha_Inscrip` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
