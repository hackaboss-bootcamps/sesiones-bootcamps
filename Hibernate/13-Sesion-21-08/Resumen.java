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



//Idea
Quizás se pueda gestionar por un listener de persistencia @PrePersist @PreUdate @PreRemove

===============================================
Si agregas tanto @MappedSuperclass como @Entity en la misma clase, el comportamiento puede variar según cómo esté configurado tu proveedor JPA y Hibernate.

En términos generales, colocar ambas anotaciones en la misma clase puede causar conflictos o comportamientos inesperados debido a que @MappedSuperclass se supone que no es una entidad persistente en sí misma, sino una clase base para otras entidades. La anotación @Entity se usa para marcar clases como entidades persistentes que deben ser mapeadas a tablas en la base de datos. Al combinar ambas anotaciones, estás introduciendo una ambigüedad en la definición de la clase: ¿debería ser una entidad persistente o solo una superclase para otras entidades?

En muchos casos, el comportamiento puede ser inconsistente o dependiente de la implementación específica de JPA y Hibernate en uso. Puede que la clase sea tratada como una entidad, lo que podría llevar a comportamientos inesperados al interactuar con la base de datos, como la creación de una tabla para la clase que en teoría debería ser solo una superclase.

Para mantener la claridad y evitar confusiones, es una buena práctica no mezclar @MappedSuperclass y @Entity en la misma clase. Si necesitas una superclase para compartir atributos y comportamientos entre múltiples entidades, utiliza @MappedSuperclass y crea entidades separadas que extiendan esa superclase. Si deseas que una clase sea una entidad persistente por sí misma, usa solo la anotación @Entity en esa clase.

Recuerda revisar la documentación y guías específicas de tu proveedor de JPA y Hibernate para comprender cómo se manejan estas anotaciones en tu entorno particular.

==================================
Concluimos que toda clase entidad que queramos que la procese JPA/Hibernate debe tener @Entity o @MappedSuperclass?
Se establece como @MappedSuperclass cuando esta no debe ser mapeada como entidad, al contrario, entrega sus atributos a aquellas clases que si van a tener el contexto de @Entity. En este sentido, puede generar, la creación de todo en una misma tabla porque la estrategia por defecto de @Inheritance es SINGLE_TABLE

@Entity se establece como toda clase que deba ser mapeada por el JPA/hibernate para que esta sea construida como tabla en la base de datos.

