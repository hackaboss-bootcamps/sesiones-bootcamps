-- ------------------------------------------------
-- DDL
-- ------------------------------------------------

DROP TABLE IF EXISTS mapamundi.ciudad;
DROP TABLE IF EXISTS mapamundi.estado;
DROP TABLE IF EXISTS mapamundi.pais;
DROP TABLE IF EXISTS mapamundi.continente;

CREATE SCHEMA IF NOT EXISTS mapamundi;

CREATE TABLE IF NOT EXISTS mapamundi.continente(
    id              BIGINT          NOT NULL AUTO_INCREMENT,
    nombre          VARCHAR(255)    NOT NULL,

    CONSTRAINT PK_mapamundi_continente_id
            PRIMARY KEY(id)
);


CREATE TABLE IF NOT EXISTS mapamundi.pais(
    id               BIGINT         NOT NULL AUTO_INCREMENT,
    nombre           VARCHAR(255)   NOT NULL,
    continente_id    BIGINT         NOT NULL,

    CONSTRAINT PK_mapamundi_pais_id
            PRIMARY KEY(id),
    CONSTRAINT FK_mapamundi_pais_continente_id
            FOREIGN KEY (continente_id)
            REFERENCES mapamundi.continente(id)
);


CREATE TABLE IF NOT EXISTS mapamundi.estado(
    id              BIGINT          NOT NULL AUTO_INCREMENT,
    nombre          VARCHAR(255)    NOT NULL,
    pais_id         BIGINT          NOT NULL,

    CONSTRAINT PK_mapamundi_estado_id
            PRIMARY KEY(id),
    CONSTRAINT FK_mapamundi_estado_pais_id
            FOREIGN KEY (pais_id)
            REFERENCES mapamundi.pais(id)
);

CREATE TABLE IF NOT EXISTS mapamundi.ciudad(
    id              BIGINT          NOT NULL AUTO_INCREMENT,
    nombre          VARCHAR(255)    NOT NULL,
    codigo_postal   VARCHAR(10)     NOT NULL,
    estado_id       BIGINT          NOT NULL,

    CONSTRAINT PK_mapamundi_ciudad_id
            PRIMARY KEY(id),
    CONSTRAINT FK_mapamundi_ciudad_estado_id
            FOREIGN KEY (estado_id)
            REFERENCES mapamundi.estado(id)
);





-- ------------------------------------------------
-- DML
-- ------------------------------------------------

INSERT INTO mapamundi.continente(nombre) VALUES
    ('Europa'),
    ('África'),
    ('Asia'),
    ('América'),
    ('Oceanía'),
    ('Antártida');

SELECT * FROM mapamundi.continente;

INSERT INTO mapamundi.pais(nombre, continente_id) VALUES
    ('España',          SELECT id FROM mapamundi.continente WHERE nombre = 'Europa'),
    ('Francia',         SELECT id FROM mapamundi.continente WHERE nombre = 'Europa'),
    ('Marruecos',       SELECT id FROM mapamundi.continente WHERE nombre = 'África'),
    ('Estados Unidos',  SELECT id FROM mapamundi.continente WHERE nombre = 'América'),
    ('Japón',           SELECT id FROM mapamundi.continente WHERE nombre = 'Asia'),
    ('Colombia',        SELECT id FROM mapamundi.continente WHERE nombre = 'América'),
    ('Australia',       SELECT id FROM mapamundi.continente WHERE nombre = 'Oceanía'),
    ('Corea del Norte', SELECT id FROM mapamundi.continente WHERE nombre = 'Asia');

SELECT * FROM mapamundi.pais;
