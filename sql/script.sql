create database archivos;
use archivos;

CREATE USER usuarchivo IDENTIFIED BY 'passarchivo';
grant usage on *.* to usuarchivo@localhost identified by 'passarchivo';
grant all privileges on archivos.* to usuarchivo@localhost;

CREATE TABLE archivo (
        idarchivo INT NOT NULL AUTO_INCREMENT,
        rutaAbsoluta VARCHAR(200),
		nombreExtension VARCHAR(200),
		nombre VARCHAR(200),
		extension VARCHAR(200),
		contenido longblob,
        PRIMARY KEY (idarchivo)
);

// AUMENTAR QUERYS PARA BLOB
//SET GLOBAL max_allowed_packet = 1024*1024*14;

/*
SELECT * FROM archivos.archivo;
DELETE  FROM archivos.archivo;
*/