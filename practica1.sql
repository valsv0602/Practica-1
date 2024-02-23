drop schema if exists practica;
drop user if exists usuario_practica;


create database practica; 
create user 'usuario_practica'@'%' identified by 'la_Clave';

/*Se asignan los prvilegios sobr ela base de datos TechShop al usuario creado */
grant all privileges on practica.* to 'usuario_practica'@'%';
flush privileges;
use practica;
create table arbol (
	id_arbol INT NOT NULL AUTO_INCREMENT,
    nombre_comun VARCHAR(50) NOT NULL,
    nombre_cientifico VARCHAR(50) NOT NULL,
    region VARCHAR(50) NOT NULL,
    altura double NOT NULL,
    ruta_imagen varchar(1024),
    PRIMARY KEY(id_arbol))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;