Byte: Unidad más pequeña de infomación [j]
Dato: Conjunto de byte [3015554646]
Registro: Conjunto de datos [Jesús Ariel 305554646]
Tablas(entidades): Grupo de registros
Base de datos: Conjunto de tablas

Familia SQL => Base de datos relacionales
	SQL=> Lenguaje estructurado de consulta.
	SQL=> DDL => Lenguaje de definición de datos 
	SQL=> DML => Lenguaje de manipulación de datos
	
	----------------------
	create table estudiante(
		id bigint primary key auto_increment,
		nombre varchar(50),
		dni varchar(12),
		correo varchar(50),
		telefono varchar(20),
		contrasenia varchar(50)
	);
	create table materia(
		id bigint primary key auto_increment,
		codigo varchar(10),
		materia varchar(50),
		descripcion varchar(200)
	);
	
	create table matricula(
		id bigint primary key auto_increment,
		estudiante_id bigint,
		materia_id bigint,
		nota DECIMAL(5,1),
		CONSTRAINT fk_matricula_estudiante_id_estudiante_id FOREIGN key (estudiante_id) REFERENCES estudiante(id),
		CONSTRAINT fk_matricula_materia_id_materia_id FOREIGN key (materia_id) REFERENCES materia(id)
	);
	
	
	-- Eliminar las tablas 
	drop table IF EXISTS MATRICULA;
	drop table IF EXISTS ESTUDIANTE;
	drop table IF EXISTS MATERIA;

	
	-- DML 
	insert into materia(
		codigo,
		materia,
		descripcion
	)VALUES(
		'1010',
		'Java',
		'Programaciòn JAVA'
	);
	
	-- Registrar la lista de materias.
	insert into materia(codigo,materia,descripcion)VALUES
	('1010','Java','Programaciòn JAVA'),
	('1011','Spring Boot','Programaciòn JAVA'),
	('1012','Hibernate','Programaciòn JAVA'),
	('1013','Java wint Ant','Programaciòn JAVA'),
	('1014','Java Maven','Programaciòn JAVA');
	
	insert into estudiante(dni,nombre,correo, telefono, contrasenia)VALUES
	('12312','Jesús González','jesus@', '3125455', 'abcd'),
	('10544','Karol Johana','karol@', '3215487', 'qwerty'),
	('12458','Pepito Peréz','pepito@', '3245852', '889944');
	
	insert into matricula(estudiante_id,materia_id, nota)VALUES(1,1,4.5);
	insert into matricula(estudiante_id,materia_id, nota)VALUES(1,2,2.3);
	insert into matricula(estudiante_id,materia_id, nota)VALUES(2,2,4.3);
	insert into matricula(estudiante_id,materia_id, nota)VALUES(1,5,4.7);
	insert into matricula(estudiante_id,materia_id, nota)VALUES(3,4,3.0);
	
	update materia set 
		materia = 'Spring Boot',
			descripcion = 'Programación JAVA' 
	where id = 2
	
	delete from materia where id = 8;
	
	select * from materia;
	
	select codigo, materia from materia;
	
	select 
		codigo, 
		materia 
	from 
		materia
	where materia like '%o%' or materia like '%i%';
	
	
	select 
		codigo, 
		materia 
	from 
		materia
	order by materia asc;
	
	-- Mostrar el promedio de un estudiante?
	-- Mostrar solo el nombre y la nota de cada materia?
	SELECT 
		e.nombre,
		m.nota,
		ma.materia
		
	FROM 
		estudiante e
	INNER JOIN matricula m ON e.id = m.estudiante_id
	INNER JOIN materia ma ON ma.id = m.materia_id;
	
	-- promedio de un estudiante
	SELECT 
		AVG(matricula.nota) as promedio
	FROM
		matricula 
		INNER JOIN materia ON matricula.materia_id = materia.id
		INNER JOIN estudiante ON estudiante.id = matricula.estudiante_id 
	WHERE estudiante.id = 2
		
	-- promedio de un estudiante
	SELECT 
		round(AVG(matricula.nota),1) as promedio
	FROM
		matricula 
		INNER JOIN materia ON matricula.materia_id = materia.id
		INNER JOIN estudiante ON estudiante.id = matricula.estudiante_id 
	WHERE estudiante.id = 3
	
	
	Motores de BD: 
		*H2
		*Mysql
		*SQLServer
		*Oracle BD
		*PostgreSQL
		*SQLite
		
	SMBD[dbms][SGBD] => Sistema manejador de base de datos
		DBeaver(Aplica como SMBD para todo sql)
		*H2
			Console h2
		*Mysql
			workbench => 
			sqlyog
			phpmyadmin
			appserver
			cmd
		*SQLServer
			mssql management studio
		*Oracle BD
			DBeaver
			Oracle Developer https://dbeaver.io/
			Oracle console
		*PostgreSQL
			pgAdmin
		*SQLite
			DB Browser
		*DB2(IBM)
		*Informix
		*firebird
Familia NoSQL => Base de datos no relacionales
	Lenguaje javascript [json]
	
	mongoDB
	Cansandra
	Firebase
	Redis
	CouchDB
	
	R[Tablas] => NR[colecciones]
	R[Registros] => NR[documentos]
	R[Columnas o atributos] => NR[dato]