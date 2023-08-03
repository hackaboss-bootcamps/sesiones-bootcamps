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
@Table(name = "BOOTCAMP_ALUMNO")
@org.hibernate.annotations.Cache(
        usage = CacheConcurrencyStrategy.READ_WRITE
)
@NaturalIdCache
public class Alumno extends BaseEntity<Long> // NOSONAR
{
    private static final long serialVersionUID = 7421101598367640587L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bootcamp_alumno_generator")
    @SequenceGenerator(
            name = "bootcamp_alumno_generator", sequenceName = "bootcamp_alumno_seq",
            initialValue = 1, allocationSize = 50)
    private Long id;

    @NaturalId(mutable = false)
    @Column(name = "nid", length = 50, nullable = false, updatable = false)
    private String nid;

    @Column(name = "fullname", length = 255, nullable = false)
    private String fullname;

    @OneToMany(mappedBy = "alumno", orphanRemoval = true)
    @OrderBy("clase.id ASC, fecha ASC")
    private Set<Asistencia> asistencias = new LinkedHashSet<>();

    public Alumno() {
        super();
    }

    public Alumno(final String nid, final String fullname) {
        super();
        setNid(nid);
        setFullname(fullname);
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = Objects.requireNonNull(id, "id must not be null!");
    }

    public String getNid() {
        return nid;
    }

    public void setNid(final String nid) {
        this.nid = Objects.requireNonNull(nid, "nid must not be null!");
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(final String fullname) {
        this.fullname = Objects.requireNonNull(fullname, "fullname must not be null!");
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
        asistencia.setAlumno(this);
    }

    public void removeAsistencia(final Asistencia asistencia) {
        Objects.requireNonNull(asistencia, "asistencia to remove must not be null!");
        asistencias.remove(asistencia);
        asistencia.setAlumno(null);
    }

    public Set<Clase> getClases() {
        return this.asistencias
                .stream()
                .map(Asistencia::getClase)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno other = (Alumno) o;
        return Objects.equals(nid, other.nid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nid);
    }

    @Override
    protected String defineObjAttrs() {
        return String.format("id=%s, nid='%s', fullname='%s', asistencias=%s, clases=%s",
                id, nid, fullname, asistencias.size(), getClases().size());
    }
}
