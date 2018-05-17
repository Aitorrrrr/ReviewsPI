CREATE DEFINER=`root`@`localhost` PROCEDURE `InsercionUser`(
	IN `Ali` VARCHAR(45),
	IN `Nom` VARCHAR(45),
	IN `Apell` VARCHAR(45),
	IN `FechaIns` INT



,
	OUT `err1` INT


)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT ''
BEGIN

DECLARE CONTINUE HANDLER FOR 1062 SET err1=0;

SET err1=1;

INSERT INTO usuario (Alias, Nombre, Apellido, Fecha_Inscrip) VALUES (Ali, Nom, Apell, FechaIns);

END