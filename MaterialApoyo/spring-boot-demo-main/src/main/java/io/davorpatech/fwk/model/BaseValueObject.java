package io.davorpatech.fwk.model;

import io.davorpatech.fwk.lang.BaseObject;

/**
 * Base implementation of a {@literal Value Object}.
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
public abstract class BaseValueObject // NOSONAR
        extends BaseObject // NOSONAR
        implements ValueObject // NOSONAR
{

}
