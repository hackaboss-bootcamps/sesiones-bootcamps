Oficial: 
	https://gitlab.com/blueoceanstart/hack-a-boss/jvb01cg/backend-java.git

Respaldo o de apoyo:
	https://github.com/hackaboss-bootcamps/sesiones-bootcamps.git

Crear proyecto base 
https://start.spring.io/


Versión
LTS: Long Term Support
===================================================================
¿Cómo se define la ruta de ruta de una API?

{protocolo}{server}{port}{endpoint}
{http}{localhost}{9000}{api/...}


HIBERNATE:

# Crea la base de datos cada vez que se sube el servicio del proyecto.
spring.jpa.hibernate.ddl-auto = create

# Crea la base de datos cada vez que se sube el servicio del proyecto, pero cuando se detiene el servicio elimina la base de datos.
spring.jpa.hibernate.ddl-auto = create-drop

# Actualiza la base de datos de acuerdo con la estructura del Entity
spring.jpa.hibernate.ddl-auto = update


# Coinsidir la base datos con la estructura Entity
spring.jpa.hibernate.ddl-auto = validate


=================
Conectar a la base de datos  => application properties


server.port= 9000
spring.jpa.hibernate.ddl-auto = update 
spring.datasource.url = jdbc:h2:tcp://localhost/~/test
spring.datasource.username = sa
spring.datasource.password =


## DataSource properties
spring.datasource.generate-unique-name=false
spring.datasource.name=testdb
spring.datasource.url=
spring.datasource.username=
spring.datasource.password=

==================
Entity

@Entity
@Table(name="pais")
public class Pais {
    
	@Id    
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@Column(name = "nombre", length = 50)
    private String nombre;	
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "continente_id", nullable = false)
    private Continente continenteId;
	
	//Encapsuamiento
}

