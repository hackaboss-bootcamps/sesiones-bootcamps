package io.davorpatech.fwk.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Base implementation for those entities of the data model
 * and that want to use some form of data access (DAO, Repository...)
 * <p>
 * Such entities shall implement {@link #hashCode()} and
 * {@link #equals(Object)} using the field {@link #getId()} provided
 * by the {@link Identifiable} interface.
 *
 * @param <ID> serializable component type that is handled for the identifier
 */
public abstract class BaseEntity<ID extends Serializable> // NOSONAR
        extends BaseValueObject // NOSONAR
        implements Entitier<ID> // NOSONAR
{
    private static final long serialVersionUID = 9152012390311413530L;

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Entitier)) return false;
        Entitier other = (Entitier) o; // NOSONAR
        return Objects.equals(getId(), other.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    protected String defineObjAttrs() {
        return String.format("id=%s", getId());
    }
}
