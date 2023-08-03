package io.davorpatech.fwk.service;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Contract that generically defines the most important read operations
 * for a specific data type.
 *
 * <ul>
 * <li>Retrieve all
 * <li>Retrieve one
 * <li>Check existence
 * <li>Count records
 * </ul>
 *
 * @param <T> component type that represents the data object
 * @param <ID> component type identifying that data object
 */
public interface ServiceReadOps<T, ID> // NOSONAR
{
    /**
     * Gets all records representing this domain data.
     *
     * @return a collection with all elements, never {@code null}.
     */
    List<T> findAll();

    /**
     * Gets a concrete record given it identifier.
     *
     * @param id the identifier used to query by detail, never {@code null}.
     * @return never {@code null}, {@literal Optional.empty()} if a record doesn't exist.
     */
    Optional<T> findById(final @NotNull ID id);

    /**
     * Check if exists a concrete record given it identifier.
     *
     * @param id the identifier used to check existence, never {@code null}.
     * @return @code {@code true} if exists.
     */
    boolean existsById(final @NotNull ID id);


    /**
     * Counts the number of records available.
     *
     * @return the number of items in the collection
     */
    default long countAll() {
        final AtomicLong counter = new AtomicLong(0L);
        findAll().stream().forEach(t -> counter.incrementAndGet());
        return counter.get();
    }
}
