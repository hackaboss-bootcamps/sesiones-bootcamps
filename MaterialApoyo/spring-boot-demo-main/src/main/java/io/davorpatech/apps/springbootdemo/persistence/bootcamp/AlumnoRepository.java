package io.davorpatech.apps.springbootdemo.persistence.bootcamp;

import io.davorpatech.apps.springbootdemo.model.bootcamp.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Repositorio de datos para la entidad de dominio {@link Alumno}.
 */
@Repository
@Transactional(readOnly = true)
public interface AlumnoRepository extends JpaRepository<Alumno, Long>
{
    /**
     * Busca un alumno por su clave natural (documento nacional de indentidad).
     *
     * @param nid número de documento nacional de indentidad del alumno,
     *            nunca {@code null}.
     * @return nunca {@code null}, {@literal Optional.empty()} si el
     *         registro no existe.
     */
    Optional<Alumno> findByNid(@NonNull String nid);

    /**
     * Comprueba si un alumno existe dada su clave natural
     * (documento nacional de indentidad).
     *
     * @param nid número de documento nacional de indentidad del alumno,
     *            nunca {@code null}.
     * @return @{@code true} si existe
     */
    boolean existsByNid(@NonNull String nid);

    /**
     * Busca todos los alumnos dadas sus claves naturales
     * (documento nacional de indentidad).
     * <p>
     * Los {@literal nid} que no se hayan encontrado no se tendrán en cuenta
     * para el retorno, es decir, el método podrá retornar menos resultados
     * que {@literal nids} de entrada.
     *
     * @param nids números de documento nacional de indentidad de
     *             los alumnos, nunca {@code null}.
     * @return la lista de registros, nunca {@code null}.
     */
    @Query("SELECT e FROM #{#entityName} e WHERE e.nid IN ?1")
    List<Alumno> findAllByNid(@NonNull Iterable<String> nids);

    /**
     * Elimina un alumno por su clave natural
     * (documento nacional de indentidad).
     * <p>
     * Si no se encuentra ningún alumno con dicho {@literal nid},
     * el sistema no hace nada.
     *
     * @param nid número de documento nacional de indentidad del alumno,
     *            nunca {@code null}.
     */
    @Transactional
    @Modifying
    @Query("DELETE FROM #{#entityName} e WHERE e.nid = ?1")
    void deleteByNid(@NonNull String nid);

    /**
     * Elimina alumnos por su clave natural
     * (documento nacional de indentidad).
     * <p>
     * Aquellos registros que no se hayan podido encontrar por su {@literal nid},
     * es como si ya no existieran, volviendo al flujo del programa
     * silenciosamente.
     *
     * @param nids números de documento nacional de indentidad de los alumnos,
     *            nunca {@code null}.
     */
    @Transactional
    @Modifying
    @Query("DELETE FROM #{#entityName} e WHERE e.nid IN ?1")
    void deleteAllByNid(@NonNull Iterable<String> nids);
}
