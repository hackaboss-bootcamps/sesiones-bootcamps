package io.davorpatech.fwk.model;

import io.davorpatech.fwk.lang.Stringer;

import java.io.Serializable;

/**
 * Contract that marks those value objects of the data model
 * (DTO, VO, Entity...) and that want to use some form of
 * data access (DAO, Repository...)
 *
 * <p>
 * A value object is a small object that represents a simple
 * entity whose equality is not based on identity: i.e. two
 * value objects are equal when they have the same value, not
 * necessarily being the same object.
 * <p>
 * Examples of value objects are objects representing an amount
 * of money or a date range.
 * <p>
 * Being small, one can have multiple copies of the same value
 * object that represent the same entity: it is often simpler
 * to create a new object rather than rely on a single instance
 * and use references to it.
 * <p>
 * Value objects should be immutable: this is required for the
 * implicit contract that two value objects created equal, should
 * remain equal. It is also useful for value objects to be immutable,
 * as client code cannot put the value object in an invalid state or
 * introduce buggy behaviour after instantiation.
 */
public interface ValueObject // NOSONAR
        extends Serializable, Stringer // NOSONAR
{
    /**
     * Two instances representing a value object are equal if
     * implements {@link #hashCode()} and {@link #equals(Object)}
     * on any of its keys, whether artificial or natural.
     *
     * @param obj the instance to compare with
     * @return {@code true} if are equivalent
     */
    @Override
    boolean equals(final Object obj);

    /**
     * Two instances representing a value object are equal if
     * implements {@link #hashCode()} and {@link #equals(Object)}
     * on any of its keys, whether artificial or natural.
     *
     * @return the hashcode of this object
     */
    @Override
    int hashCode();

    /**
     * Gets a textual representation of this underlying value object.
     * <p>
     * In general, the {@code toString} method returns a string that
     * "textually represents" this object. The result should be a
     * concise but informative representation that is easy for a
     * person to read.
     *
     * @return a textual representation of this underlying value object.
     */
    @Override
    String toString();
}
