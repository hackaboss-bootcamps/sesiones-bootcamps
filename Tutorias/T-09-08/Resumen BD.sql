-- Se requiere un programa que permita realizar el seguimiento de la ruta de envio de un producto.

-- producto[id, nombre, precio]
-- cliente[id, dni, nombre, telefono, direccion]
-- factura[id, numero_factura, fecha, cliente_id]
-- factura_linea [id, factura_id, producto_id, valor_unitario, cantidad, por_iva, por_des]
-- seguimiento [id, factura_id, descripcion]


-- Eliminar 
drop table IF EXISTS seguimiento;
drop table IF EXISTS factura_linea;
drop table IF EXISTS factura;
drop table IF EXISTS producto;
drop table IF EXISTS cliente;
drop database IF EXISTS tienda;



-- CREATE SCHEMA IF NOT EXISTS tienda;
-- use tienda;

-- crear base de datos
create database tienda;
use tienda;

-- crear entidades de la base datos
create table producto(
	id int primary key auto_increment, 
	nombre VARCHAR(100) not null, 
	precio decimal(8,2) not null
);

create table cliente(
	id int primary key auto_increment,
	dni VARCHAR(20) not null unique,  
	nombre VARCHAR(100) not null, 
	telefono VARCHAR(20) not null, 
	direccion VARCHAR (255) not null
);

create table factura(
	id int primary key auto_increment,
	numero_factura VARCHAR(20) not null, 
	fecha datetime, 
	cliente_id int not null,
	FOREIGN key (cliente_id) REFERENCES cliente(id)
);
create table factura_linea(
	id int primary key auto_increment,
	factura_id int not null, 
	producto_id int not null, 
	valor_unitario decimal(8,2) not null, 
	cantidad int not null, 
	por_iva decimal(2,2) DEFAULT 0, 
	por_des decimal(2,2) DEFAULT 0,
	FOREIGN key (factura_id) REFERENCES factura(id),
	FOREIGN key (producto_id) REFERENCES producto(id)
);

create table seguimiento(
	id int primary key auto_increment,
	factura_id int not null, 
	descripcion VARCHAR(200) not null,
	FOREIGN key (factura_id) REFERENCES factura(id)
);





