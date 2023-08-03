package io.davorpatech.fwk.model;

import io.davorpatech.fwk.lang.Stringer;

import java.io.Serializable;

/**
 * Contract that marks those entities of the data model
 * and that want to use some form of data access (DAO, Repository...)
 * <p>
 * Such entities shall implement {@link #hashCode()} and
 * {@link #equals(Object)} using the field {@link #getId()} provided
 * by the {@link Identifiable} interface.
 *
 * @param <ID> serializable component type that is handled for the identifier
 */
public interface Entitier<ID extends Serializable> // NOSONAR
        extends Serializable, Stringer, Identifiable<ID> // NOSONAR
{
    /**
     * Gets the value of the artificial key that uniquely identifies
     * the underlying persistence entity.
     *
     * @return the value of the artificial key that uniquely identifies
     *         the underlying persistence entity. Never {@code null}.
     */
    @Override
    ID getId();

    /**
     * Two instances representing a persistence entity are equal if
     * implements {@link #hashCode()} and {@link #equals(Object)}
     * on any of its keys, whether artificial or natural.
     *
     * @param obj the instance to compare with
     * @return {@code true} if are equivalent
     * @see #getId()
     */
    @Override
    boolean equals(final Object obj);

    /**
     * Two instances representing a persistence entity are equal if
     * implements {@link #hashCode()} and {@link #equals(Object)}
     * on any of its keys, whether artificial or natural.
     *
     * @return the hashcode of this object
     * @see #getId()
     */
    @Override
    int hashCode();

    /**
     * Gets a textual representation of the underlying persistence entity.
     * <p>
     * In general, the {@code toString} method returns a string that
     * "textually represents" this object. The result should be a
     * concise but informative representation that is easy for a
     * person to read.
     *
     * @return a textual representation of the underlying persistence entity.
     */
    @Override
    String toString();
}
