package io.davorpatech.apps.springbootdemo.persistence.bootcamp;

import io.davorpatech.apps.springbootdemo.model.bootcamp.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * Repositorio de datos para la entidad de dominio {@link Asistencia}.
 */
@Repository
@Transactional(readOnly = true)
public interface AsistenciaRepository extends JpaRepository<Asistencia, Long>
{
    /**
     * Busca los registros de asistencia a clase de un determinado alumno
     * por sus claves primarias.
     *
     * @param claseId  identificador de la clase, nunca {@code null}
     * @param alumnoId identificador del alumno, nunca {@code null}
     * @return una lista de resultados, nunca {@code null}
     */
    @Query("SELECT e FROM #{#entityName} e " +
            " WHERE e.clase.id = ?1 AND e.alumno.id = ?2 " +
            " ORDER BY e.clase.nombre ASC, e.alumno.fullname ASC")
    List<Asistencia> findAllBy(
            @NonNull Long claseId,
            @NonNull Long alumnoId);

    /**
     * Busca los registros de asistencia a clase de un determinado alumno
     * por sus claves naturales.
     *
     * @param claseCodigo identificador de la clase, nunca {@code null}
     * @param alumnoNid   identificador del alumno, nunca {@code null}
     * @return una lista de resultados, nunca {@code null}
     */
    @Query("SELECT e FROM #{#entityName} e " +
            " WHERE e.clase.codigo = ?1 AND e.alumno.nid = ?2 " +
            " ORDER BY e.clase.nombre ASC, e.alumno.fullname ASC")
    List<Asistencia> findAllBy(
            @NonNull String claseCodigo,
            @NonNull String alumnoNid);

    /**
     * Busca una asistencia de clase por su clave compuesta.
     *
     * @param claseId  identificador de la clase, nunca {@code null}
     * @param alumnoId identificador del alumno, nunca {@code null}
     * @param fecha    fecha de asistencia, nunca {@code null}
     * @return nunca {@code null}, {@literal Optional.empty()} si el
     *         registro no existe
     */
    @Query("SELECT e FROM #{#entityName} e WHERE e.clase.id = ?1 AND e.alumno.id = ?2 AND e.fecha = ?3")
    Optional<Asistencia> findById(
            @NonNull Long claseId,
            @NonNull Long alumnoId,
            @NonNull LocalDate fecha);

    /**
     * Averigua la existencia de una asistencia de clase por su clave compuesta.
     *
     * @param claseId  identificador de la clase, nunca {@code null}
     * @param alumnoId identificador del alumno, nunca {@code null}
     * @param fecha    fecha de asistencia, nunca {@code null}
     * @return @{@code true} si existe
     */
    @Query("SELECT count(e.id) = 1 FROM #{#entityName} e WHERE e.clase.id = ?1 AND e.alumno.id = ?2 AND e.fecha = ?3")
    boolean existsById(
            @NonNull Long claseId,
            @NonNull Long alumnoId,
            @NonNull LocalDate fecha);

    /**
     * Elimina una asistencia de clase por su clave compuesta.
     * <p>
     * Si no se encuentra ningún registro dada dicha tupla de datos,
     * el sistema no hace nada, siguiendo con su flujo normal.
     *
     * @param claseId  identificador de la clase, nunca {@code null}
     * @param alumnoId identificador del alumno, nunca {@code null}
     * @param fecha    fecha de asistencia, nunca {@code null}
     */
    @Transactional
    @Modifying
    @Query("DELETE FROM #{#entityName} e WHERE e.clase.id = ?1 AND e.alumno.id = ?2 AND e.fecha = ?3")
    void deleteById(
            @NonNull Long claseId,
            @NonNull Long alumnoId,
            @NonNull LocalDate fecha);

    /**
     * Busca una asistencia de clase por su clave natural compuesta.
     *
     * @param claseCodigo identificador de la clase, nunca {@code null}
     * @param alumnoNid   identificador del alumno, nunca {@code null}
     * @param fecha       fecha de asistencia, nunca {@code null}
     * @return nunca {@code null}, {@literal Optional.empty()} si el
     *         registro no existe
     */
    @Query("SELECT e FROM #{#entityName} e WHERE e.clase.codigo = ?1 AND e.alumno.nid = ?2 AND e.fecha = ?3")
    Optional<Asistencia> findById(
            @NonNull String claseCodigo,
            @NonNull String alumnoNid,
            @NonNull LocalDate fecha);

    /**
     * Averigua la existencia de una asistencia de clase por su clave natural compuesta.
     *
     * @param claseCodigo identificador de la clase, nunca {@code null}
     * @param alumnoNid   identificador del alumno, nunca {@code null}
     * @param fecha       fecha de asistencia, nunca {@code null}
     * @return nunca {@code null}, {@literal Optional.empty()} si el
     *         registro no existe
     */
    @Query("SELECT count(e.id) = 1 FROM #{#entityName} e WHERE e.clase.codigo = ?1 AND e.alumno.nid = ?2 AND e.fecha = ?3")
    boolean existsById(
            @NonNull String claseCodigo,
            @NonNull String alumnoNid,
            @NonNull LocalDate fecha);

    /**
     * Elimina una asistencia de clase por su clave natural compuesta.
     * <p>
     * Si no se encuentra ningún registro dada dicha tupla de datos,
     * el sistema no hace nada, siguiendo con su flujo normal.
     *
     * @param claseCodigo identificador de la clase, nunca {@code null}
     * @param alumnoNid   identificador del alumno, nunca {@code null}
     * @param fecha       fecha de asistencia, nunca {@code null}
     */
    @Transactional
    @Modifying
    @Query("DELETE FROM #{#entityName} e WHERE e.clase.codigo = ?1 AND e.alumno.nid = ?2 AND e.fecha = ?3")
    void deleteById(
            @NonNull String claseCodigo,
            @NonNull String alumnoNid,
            @NonNull LocalDate fecha);
}
