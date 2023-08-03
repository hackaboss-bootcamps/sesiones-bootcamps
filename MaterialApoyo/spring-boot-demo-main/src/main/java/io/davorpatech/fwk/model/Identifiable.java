package io.davorpatech.fwk.model;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * A record can be considered {@literal Identifiable} if it has
 * a field that emits {@literal non-null} values with which
 * can be uniquely identified.
 *
 * @param <ID> component type that is handled for the identifier
 */
public interface Identifiable<ID> // NOSONAR
{
    /**
     * Gets the value of the artificial key that uniquely identifies
     * the underlying record.
     *
     * @return the value of the artificial key that uniquely identifies
     *         the underlying record. Never {@code null}.
     */
    ID getId();

    /**
     * Compose a {@link Predicate} to filter by {@link Identifiable}s.
     * <p>
     * It will accept all those records whose {@code id} is identical
     * to the passed by parameter.
     *
     * @param <T> component type {@link Identifiable} to inspect
     * @param <ID> component type identifier to inspect
     * @param id identifier value to accept
     * @return a @{@literal Predicate}
     *
     * @see Objects#equals(Object, Object)
     * @see #getId()
     */
    static <T extends Identifiable<ID>, ID> Predicate<T> idfinder(final ID id) { // NOSONAR
        return e -> Objects.equals(e.getId(), id);
    }
}
