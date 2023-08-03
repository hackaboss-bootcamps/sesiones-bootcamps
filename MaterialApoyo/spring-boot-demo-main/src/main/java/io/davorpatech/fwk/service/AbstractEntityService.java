package io.davorpatech.fwk.service;

import io.davorpatech.fwk.model.Entitier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * Implementations must delegate most of their operations to the JPA repository of duty.
 *
 * @param <T> component type representing the domain entity
 * @param <ID> component type of the field that uniquely identifies said entity
 *
 * @see #getRepository()
 */
public abstract class AbstractEntityService<T extends Entitier<ID>, ID extends Serializable> // NOSONAR
        extends ServiceCommonSupport // NOSONAR
        implements EntityService<T, ID> // NOSONAR
{
    private Class<T> entityClass;

    @SuppressWarnings("unchecked")
    protected Class<T> getEntityClass()
    {
        if (entityClass == null) {
            //only works if one extends AbstractEntityService, we will take care of it with CDI
            ParameterizedType clazz = (ParameterizedType) getClass().getGenericSuperclass();
            // 0: <T> value type
            // 1: <ID> value type
            entityClass = (Class<T>) clazz.getActualTypeArguments()[0];
        }
        return entityClass;
    }


    private Class<ID> primaryKeyClass;

    @SuppressWarnings("unchecked")
    protected Class<ID> getPrimaryKeyClass()
    {
        if (primaryKeyClass == null) {
            //only works if one extends AbstractEntityService, we will take care of it with CDI
            ParameterizedType clazz = (ParameterizedType) getClass().getGenericSuperclass();
            // 0: <T> value type
            // 1: <ID> value type
            primaryKeyClass = (Class<ID>) clazz.getActualTypeArguments()[1];
        }
        return primaryKeyClass;
    }


    /**
     * Gets the repository that handles the data of this domain entity service.
     *
     * @return the JPA repository
     */
    protected abstract JpaRepository<T, ID> getRepository();
}
