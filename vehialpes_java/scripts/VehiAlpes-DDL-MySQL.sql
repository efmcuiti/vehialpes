SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `VehiAlpes` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
SHOW WARNINGS;
USE `VehiAlpes` ;

-- -----------------------------------------------------
-- Table `VehiAlpes`.`CIUDAD`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `VehiAlpes`.`CIUDAD` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `VehiAlpes`.`CIUDAD` (
  `ID_CIUDAD` INT NOT NULL ,
  `CIUDAD` VARCHAR(30) NOT NULL ,
  PRIMARY KEY (`ID_CIUDAD`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `VehiAlpes`.`TALLER`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `VehiAlpes`.`TALLER` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `VehiAlpes`.`TALLER` (
  `ID_TALLER` INT NOT NULL ,
  `ID_CIUDAD` INT NOT NULL ,
  `NOMBRE_TALLER` VARCHAR(40) NOT NULL ,
  `DIRECCION` VARCHAR(50) NOT NULL ,
  `TELEFONO` VARCHAR(20) NULL ,
  PRIMARY KEY (`ID_TALLER`) ,
  CONSTRAINT `fk_TALLER_CIUDAD1`
    FOREIGN KEY (`ID_CIUDAD` )
    REFERENCES `VehiAlpes`.`CIUDAD` (`ID_CIUDAD` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `VehiAlpes`.`CLIENTE`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `VehiAlpes`.`CLIENTE` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `VehiAlpes`.`CLIENTE` (
  `ID_CLIENTE` INT NOT NULL ,
  `NOMBRE_RAZON_SOCIAL` VARCHAR(50) NOT NULL ,
  `DIRECCION` VARCHAR(40) NOT NULL ,
  `TELEFONO` VARCHAR(20) NOT NULL ,
  `E-MAIL` VARCHAR(40) NULL ,
  `ID_CIUDAD` INT NOT NULL ,
  PRIMARY KEY (`ID_CLIENTE`) ,
  CONSTRAINT `fk_CLIENTE_CIUDAD1`
    FOREIGN KEY (`ID_CIUDAD` )
    REFERENCES `VehiAlpes`.`CIUDAD` (`ID_CIUDAD` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `VehiAlpes`.`MARCA`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `VehiAlpes`.`MARCA` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `VehiAlpes`.`MARCA` (
  `ID_MARCA` INT NOT NULL ,
  `NOMBRE_MARCA` VARCHAR(45) NULL ,
  PRIMARY KEY (`ID_MARCA`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `VehiAlpes`.`VEHICULO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `VehiAlpes`.`VEHICULO` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `VehiAlpes`.`VEHICULO` (
  `PLACA` VARCHAR(6) NOT NULL ,
  `ID_CLIENTE` INT NOT NULL ,
  `ID_MARCA` INT NOT NULL ,
  `MODELO` SMALLINT NOT NULL ,
  PRIMARY KEY (`PLACA`, `ID_CLIENTE`) ,
  CONSTRAINT `fk_VEHICULO_MARCA`
    FOREIGN KEY (`ID_MARCA` )
    REFERENCES `VehiAlpes`.`MARCA` (`ID_MARCA` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_VEHICULO_CLIENTE1`
    FOREIGN KEY (`ID_CLIENTE` )
    REFERENCES `VehiAlpes`.`CLIENTE` (`ID_CLIENTE` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `VehiAlpes`.`TIPO_SERVICIO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `VehiAlpes`.`TIPO_SERVICIO` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `VehiAlpes`.`TIPO_SERVICIO` (
  `ID_TIPO_SERVICIO` INT NOT NULL ,
  `TIPO_SERVICIO` VARCHAR(20) NULL ,
  `DESCRIPCION` TEXT NULL ,
  PRIMARY KEY (`ID_TIPO_SERVICIO`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `VehiAlpes`.`ORDEN_SERVICIO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `VehiAlpes`.`ORDEN_SERVICIO` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `VehiAlpes`.`ORDEN_SERVICIO` (
  `ID_ORDEN_SERVICIO` INT NOT NULL ,
  `ID_CLIENTE` INT NOT NULL ,
  `PLACA` VARCHAR(6) NOT NULL ,
  `ID_TALLER` INT NOT NULL ,
  `ID_TIPO_SERVICIO` INT NOT NULL ,
  `FECHA_SERVICIO` DATE NOT NULL ,
  `CITA_SERVICIO` DATE NULL ,
  `DESCRIPCION` TEXT NULL ,
  PRIMARY KEY (`ID_ORDEN_SERVICIO`) ,
  CONSTRAINT `fk_ORDEN_SERVICIO_TALLER1`
    FOREIGN KEY (`ID_TALLER` )
    REFERENCES `VehiAlpes`.`TALLER` (`ID_TALLER` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ORDEN_SERVICIO_VEHICULO1`
    FOREIGN KEY (`PLACA` , `ID_CLIENTE` )
    REFERENCES `VehiAlpes`.`VEHICULO` (`PLACA` , `ID_CLIENTE` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ORDEN_SERVICIO_TIPO_SERVICIO1`
    FOREIGN KEY (`ID_TIPO_SERVICIO` )
    REFERENCES `VehiAlpes`.`TIPO_SERVICIO` (`ID_TIPO_SERVICIO` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `VehiAlpes`.`REPUESTO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `VehiAlpes`.`REPUESTO` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `VehiAlpes`.`REPUESTO` (
  `ID_REPUESTO` INT NOT NULL ,
  `REPUESTO` VARCHAR(40) NOT NULL ,
  `REFERENCIA` VARCHAR(15) NOT NULL ,
  `DESCRIPCION` VARCHAR(80) NULL ,
  `PRECIO` DECIMAL(10,2)  NULL ,
  PRIMARY KEY (`ID_REPUESTO`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `VehiAlpes`.`CONSUMIBLE`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `VehiAlpes`.`CONSUMIBLE` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `VehiAlpes`.`CONSUMIBLE` (
  `ID_CONSUMIBLE` INT NOT NULL ,
  `NOMBRE` VARCHAR(60) NOT NULL ,
  `DESCRIPCION` TEXT NULL ,
  `PRECIO` DECIMAL(10,2)  NOT NULL ,
  PRIMARY KEY (`ID_CONSUMIBLE`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `VehiAlpes`.`PRODUCTO_SERVICIO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `VehiAlpes`.`PRODUCTO_SERVICIO` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `VehiAlpes`.`PRODUCTO_SERVICIO` (
  `ID_PRODUCTO_SERVICIO` INT NOT NULL ,
  `ID_REPUESTO` INT NULL ,
  `ID_CONSUMIBLE` INT NULL ,
  `DESCRIPCION` TEXT NULL ,
  PRIMARY KEY (`ID_PRODUCTO_SERVICIO`) ,
  CONSTRAINT `fk_PRODUCTO_SERVICIO_REPUESTO1`
    FOREIGN KEY (`ID_REPUESTO` )
    REFERENCES `VehiAlpes`.`REPUESTO` (`ID_REPUESTO` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PRODUCTO_SERVICIO_CONSUMIBLE1`
    FOREIGN KEY (`ID_CONSUMIBLE` )
    REFERENCES `VehiAlpes`.`CONSUMIBLE` (`ID_CONSUMIBLE` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `VehiAlpes`.`DETALLE_ORDEN_SERVICIO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `VehiAlpes`.`DETALLE_ORDEN_SERVICIO` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `VehiAlpes`.`DETALLE_ORDEN_SERVICIO` (
  `ID_ORDEN_SERVICIO` INT NOT NULL ,
  `ID_PRODUCTO_SERVICIO` INT NOT NULL ,
  `CANTIDAD` SMALLINT NOT NULL ,
  `PRECIO_UNITARIO` DECIMAL(10,2)  NOT NULL ,
  `DESCUENTO` DECIMAL(10,0)  NOT NULL ,
  PRIMARY KEY (`ID_PRODUCTO_SERVICIO`, `ID_ORDEN_SERVICIO`) ,
  CONSTRAINT `fk_DETALLE_ORDEN_SERVICIO_ORDEN_SERVICIO1`
    FOREIGN KEY (`ID_ORDEN_SERVICIO` )
    REFERENCES `VehiAlpes`.`ORDEN_SERVICIO` (`ID_ORDEN_SERVICIO` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_DETALLE_ORDEN_SERVICIO_PRODUCTO_SERVICIO1`
    FOREIGN KEY (`ID_PRODUCTO_SERVICIO` )
    REFERENCES `VehiAlpes`.`PRODUCTO_SERVICIO` (`ID_PRODUCTO_SERVICIO` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `VehiAlpes`.`CONCESIONARIO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `VehiAlpes`.`CONCESIONARIO` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `VehiAlpes`.`CONCESIONARIO` (
  `ID_CONCESIONARIO` INT NOT NULL ,
  `NOMBRE_CONCESIONARIO` VARCHAR(40) NULL ,
  `DIRECCION` VARCHAR(50) NULL ,
  `CIUDAD_ID_CIUDAD` INT NOT NULL ,
  PRIMARY KEY (`ID_CONCESIONARIO`) ,
  CONSTRAINT `fk_CONCESIONARIO_CIUDAD1`
    FOREIGN KEY (`CIUDAD_ID_CIUDAD` )
    REFERENCES `VehiAlpes`.`CIUDAD` (`ID_CIUDAD` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `VehiAlpes`.`COMPRA`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `VehiAlpes`.`COMPRA` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `VehiAlpes`.`COMPRA` (
  `VEHICULO_PLACA` VARCHAR(6) NOT NULL ,
  `FECHA_COMRA` DATE NULL ,
  `ID_CONCESIONARIO` INT NOT NULL ,
  PRIMARY KEY (`VEHICULO_PLACA`) ,
  CONSTRAINT `fk_COMPRA_VEHICULO1`
    FOREIGN KEY (`VEHICULO_PLACA` )
    REFERENCES `VehiAlpes`.`VEHICULO` (`PLACA` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_COMPRA_CONCESIONARIO1`
    FOREIGN KEY (`ID_CONCESIONARIO` )
    REFERENCES `VehiAlpes`.`CONCESIONARIO` (`ID_CONCESIONARIO` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `VehiAlpes`.`REGISTRO_FOTOGRAFICO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `VehiAlpes`.`REGISTRO_FOTOGRAFICO` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `VehiAlpes`.`REGISTRO_FOTOGRAFICO` (
  `ID_REGISTRO_FOTOGRAFICO` INT NOT NULL ,
  `ORDEN_SERVICIO_ID_ORDEN_SERVICIO` INT NOT NULL ,
  `IMAGEN` BLOB NULL ,
  PRIMARY KEY (`ID_REGISTRO_FOTOGRAFICO`) ,
  CONSTRAINT `fk_REGISTRO_FOTOGRAFICO_ORDEN_SERVICIO1`
    FOREIGN KEY (`ORDEN_SERVICIO_ID_ORDEN_SERVICIO` )
    REFERENCES `VehiAlpes`.`ORDEN_SERVICIO` (`ID_ORDEN_SERVICIO` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;


-- -----------------------------------------------------
-- View `VehiAlpes`.`vHOJA_VIDA_VEHICULO`
-- -----------------------------------------------------
DROP VIEW IF EXISTS `VehiAlpes`.`vHOJA_VIDA_VEHICULO` ;
SHOW WARNINGS;
USE `VehiAlpes`;
CREATE  OR REPLACE VIEW `VehiAlpes`.`vHOJA_VIDA_VEHICULO` AS
	SELECT	V.PLACA, M.NOMBRE_MARCA, V.MODELO, C.ID_CLIENTE, C.NOMBRE_RAZON_SOCIAL, 
		OS.FECHA_SERVICIO, OS.DESCRIPCION AS DESCRIPCION_ORDEN_SERVICIO, TS.TIPO_SERVICIO,
		PS.DESCRIPCION AS DESCRIPCION_PRODUCTO_SERVICIO
	FROM	Vehiculo V, Cliente C, Marca M, Orden_Servicio OS, Detalle_Orden_Servicio DOS, 
		Tipo_Servicio TS,  Producto_Servicio PS
	WHERE	C.Id_Cliente = V.Id_Cliente
	AND	V.Id_Marca = M.Id_Marca
	AND	OS.Id_Cliente = C.Id_Cliente
	AND	OS.Placa = V.Placa
	AND	OS.Id_Orden_Servicio = DOS.Id_Orden_Servicio
	AND	OS.Id_Tipo_Servicio = TS.Id_Tipo_Servicio
	AND	DOS.Id_Producto_Servicio = PS.Id_Producto_Servicio;
SHOW WARNINGS;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;