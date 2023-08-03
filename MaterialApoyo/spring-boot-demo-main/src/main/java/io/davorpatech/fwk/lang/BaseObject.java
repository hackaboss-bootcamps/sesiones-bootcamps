package io.davorpatech.fwk.lang;

/**
 * Base implementation of {@link Stringer} using the name of the class
 * of which the object is an instance following of a concise description
 * of its relevant attributes and values.
 */
public abstract class BaseObject implements Stringer // NOSONAR
{
    /**
     * {@inheritDoc}
     * <p>
     * The {@literal toString} method for class {@link BaseObject}
     * returns a string consisting of the name of the class of which the
     * object is an instance, following of a concise description of its
     * relevant attributes and values wrapped with {@code {}}.
     * In other words, this method returns a string equal to the value of:
     *
     * <pre>{@code
     * getClass().getSimpleName() + '{' + defineObjAttrs() + '}'
     * }</pre>
     *
     * @see #defineObjType()
     * @see #defineObjAttrs()
     */
    @Override
    public String toString() {
        return String.format("%s{%s}", defineObjType(), defineObjAttrs());
    }


    /**
     * Describes the type of this object.
     * <p>
     * By default returns a string consisting of the name of the class
     * of which the object is an instance. In other words, this method
     * returns a string equal to the value of:
     *
     * <pre>{@code
     * getClass().getSimpleName()
     * }</pre>
     *
     * @return a textual representation of this object type.
     */
    protected String defineObjType() {
        return getClass().getSimpleName();
    }

    /**
     * Describes the relevant attributes present in this object.
     *
     * An example of an object should return might be...
     * <pre>{@code
     * String.format("fullname='%s', birthdate='%s', age=%s",
     *               fullname, birthdate, age);
     * }</pre>
     *
     * where {@code fullname}, {@code birthdate}, {@code age}
     * are fields of the object to describe.
     *
     * @return a textual representation with each relevant
     *         attribute-value present in this object.
     */
    protected abstract String defineObjAttrs();
}
