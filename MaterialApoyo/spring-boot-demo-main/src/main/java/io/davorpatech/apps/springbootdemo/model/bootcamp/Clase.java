package io.davorpatech.apps.springbootdemo.model.bootcamp;

import io.davorpatech.fwk.model.BaseEntity;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.NaturalIdCache;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "BOOTCAMP_CLASE")
@org.hibernate.annotations.Cache(
        usage = CacheConcurrencyStrategy.READ_WRITE
)
@NaturalIdCache
public class Clase extends BaseEntity<Long> // NOSONAR
{
    private static final long serialVersionUID = 4541825044455915092L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bootcamp_clase_generator")
    @SequenceGenerator(
            name = "bootcamp_clase_generator", sequenceName = "bootcamp_clase_seq",
            initialValue = 1, allocationSize = 50)
    private Long id;

    @NaturalId(mutable = false)
    @Column(name = "codigo", nullable = false, unique = true, updatable = false)
    private String codigo;

    @Column(name = "nombre", length = 255, nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "clase", orphanRemoval = true)
    @OrderBy("alumno.id ASC, fecha ASC")
    private Set<Asistencia> asistencias = new LinkedHashSet<>();

    public Clase() {
        super();
    }

    public Clase(final String codigo, final String nombre) {
        super();
        setCodigo(codigo);
        setNombre(nombre);
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = Objects.requireNonNull(id, "id must not be null!");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(final String codigo) {
        this.codigo = Objects.requireNonNull(codigo, "codigo must not be null!");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = Objects.requireNonNull(nombre, "nombre must not be null!");
    }

    public Set<Asistencia> getAsistencias() {
        return Set.copyOf(asistencias);
    }

    public void setAsistencias(final Set<Asistencia> asistencias) {
        this.asistencias = Objects.requireNonNull(asistencias, "asistencias must not be null!");
    }

    public void addAsistencia(final Asistencia asistencia) {
        Objects.requireNonNull(asistencia, "asistencia to add must not be null!");
        asistencias.add(asistencia);
        asistencia.setClase(this);
    }

    public void removeAsistencia(final Asistencia asistencia) {
        Objects.requireNonNull(asistencia, "asistencia to remove must not be null!");
        asistencias.remove(asistencia);
        asistencia.setClase(null);
    }

    public Set<Alumno> getAlumnos() {
        return this.asistencias
                .stream()
                .map(Asistencia::getAlumno)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clase other = (Clase) o;
        return Objects.equals(codigo, other.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    protected String defineObjAttrs() {
        return String.format("id=%s, codigo='%s', nombre='%s', asistencias=%s, alumnos=%s",
                id, codigo, nombre, asistencias.size(), getAlumnos().size());
    }
}
