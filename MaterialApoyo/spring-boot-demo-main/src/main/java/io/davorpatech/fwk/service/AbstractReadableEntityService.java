package io.davorpatech.fwk.service;

import io.davorpatech.fwk.model.Entitier;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * Base implementation that delegates to the JPA repository the most
 * important read operations for a specific data type.
 *
 * @param <T> component type representing the domain entity
 * @param <ID> component type of the field that uniquely identifies said entity
 *
 * @see #getRepository()
 */
public abstract class AbstractReadableEntityService<T extends Entitier<ID>, ID extends Serializable> // NOSONAR
        extends AbstractEntityService<T, ID> // NOSONAR
        implements ReadableEntityService<T, ID> // NOSONAR
{
    @Transactional(readOnly = true)
    @Override
    public List<T> findAll() {
        return getRepository().findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<T> findById(
            final @NotNull ID id) {
        return getRepository().findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public boolean existsById(
            final @NotNull ID id) {
        return getRepository().existsById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public long countAll() {
        return getRepository().count();
    }

}
