package io.davorpatech.fwk.lang;

/**
 * An interface that enables to create a textual representation
 * of any object.
 */
public interface Stringer // NOSONAR
{
    /**
     * Returns a string representation of the object.
     * <p>
     * In general, the {@code toString} method returns a string that
     * "textually represents" this object. The result should be a
     * concise but informative representation that is easy for a
     * person to read.
     *
     * @return a string representation of the object.
     */
    String toString();
}
