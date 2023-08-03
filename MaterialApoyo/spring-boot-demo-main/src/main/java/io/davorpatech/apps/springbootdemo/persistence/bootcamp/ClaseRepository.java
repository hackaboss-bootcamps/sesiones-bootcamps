package io.davorpatech.apps.springbootdemo.persistence.bootcamp;

import io.davorpatech.apps.springbootdemo.model.bootcamp.Clase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Repositorio de datos para la entidad de dominio {@link Clase}.
 */
@Repository
@Transactional(readOnly = true)
public interface ClaseRepository extends JpaRepository<Clase, Long>
{
    /**
     * Busca una clase por su clave natural (código).
     *
     * @param codigo código de la clase a identificar,
     *            nunca {@code null}.
     * @return nunca {@code null}, {@literal Optional.empty()} si el
     *         registro no existe.
     */
    Optional<Clase> findByCodigo(@NonNull String codigo);

    /**
     * Comprueba si una clase existe dada su clave natural
     * (código).
     *
     * @param codigo código de la clase a identificar,
     *            nunca {@code null}.
     * @return @{@code true} si existe
     */
    boolean existsByCodigo(@NonNull String codigo);

    /**
     * Busca todos las clases por sus claves naturales
     * (código).
     * <p>
     * Los {@literal codigos} que no se hayan encontrado no se tendrán en cuenta
     * para el retorno, es decir, el método podrá retornar menos resultados
     * que {@literal codigos} de entrada.
     *
     * @param nids codigos de las clases, nunca {@code null}.
     * @return la lista de registros, nunca {@code null}.
     */
    @Query("SELECT e FROM #{#entityName} e WHERE e.codigo IN ?1")
    List<Clase> findAllByCodigo(@NonNull Iterable<String> codigos);

    /**
     * Elimina una clase por su clave natural
     * (código).
     * <p>
     * Si no se encuentra ninguna clase con dicho {@literal codigo},
     * el sistema no hace nada.
     *
     * @param codigo código de la clase, nunca {@code null}.
     */
    @Transactional
    @Modifying
    @Query("DELETE FROM #{#entityName} e WHERE e.codigo = ?1")
    void deleteByCodigo(@NonNull String codigo);

    /**
     * Elimina clases por su clave natural
     * (código).
     * <p>
     * Aquellos registros que no se hayan podido encontrar por su
     * {@literal codigo}, es como si ya no existieran, volviendo
     * al flujo del programa silenciosamente.
     *
     * @param codigos códigos de la clases, nunca {@code null}.
     */
    @Transactional
    @Modifying
    @Query("DELETE FROM #{#entityName} e WHERE e.codigo IN ?1")
    void deleteAllByCodigo(@NonNull Iterable<String> codigos);
}
