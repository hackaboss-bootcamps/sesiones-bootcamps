-- Crear SCHEMA
CREATE SCHEMA IF NOT EXISTS geografia;

USE geografia;

CREATE TABLE IF NOT EXISTS continente(
	id Bigint PRIMARY KEY AUTO_INCREMENT,
	nombre VARCHAR(50) NOT NULL,
	estado bit default 1,
	fecha_creacion TIMESTAMP default CURRENT_TIMESTAMP,
	fecha_modificacion TIMESTAMP  NULL,
	fecha_eliminacion TIMESTAMP NULL
);

CREATE TABLE IF NOT EXISTS pais(
	id Bigint PRIMARY KEY AUTO_INCREMENT,
	nombre VARCHAR(50) NOT NULL,
	estado bit default 1,
	fecha_creacion TIMESTAMP default CURRENT_TIMESTAMP,
	fecha_modificacion TIMESTAMP  NULL,
	fecha_eliminacion TIMESTAMP NULL,
	continente_id Bigint,
	FOREIGN KEY (continente_id) REFERENCES continente(id)
);

CREATE TABLE IF NOT EXISTS estado(
	id Bigint PRIMARY KEY AUTO_INCREMENT,
	nombre VARCHAR(50) NOT NULL,
	estado bit default 1,
	fecha_creacion TIMESTAMP default CURRENT_TIMESTAMP,
	fecha_modificacion TIMESTAMP  NULL,
	fecha_eliminacion TIMESTAMP NULL,
	pais_id Bigint,
	FOREIGN KEY (pais_id) REFERENCES pais(id)
);

CREATE TABLE IF NOT EXISTS ciudad(
	id Bigint PRIMARY KEY AUTO_INCREMENT,
	nombre VARCHAR(50) NOT NULL,
	postal VARCHAR(15) NOT NULL,
	estado bit default 1,
	fecha_creacion TIMESTAMP default CURRENT_TIMESTAMP,
	fecha_modificacion TIMESTAMP  NULL,
	fecha_eliminacion TIMESTAMP NULL,
	estado_id Bigint,
	FOREIGN KEY (estado_id) REFERENCES estado(id)
);