package io.davorpatech.fwk.service;

import io.davorpatech.fwk.model.Entitier;

import java.io.Serializable;

/**
 * Basic service that generically defines the most important
 * CRUD operations for a specific data type.
 *
 * <ul>
 * <li>Create
 * <li>Retrieve (all, one, existence, count... and other read-only operations)
 * <li>Update
 * <li>Delete
 * </ul>
 *
 * @param <T> component type representing the domain entity
 * @param <ID> component type of the field that uniquely identifies said entity
 * @see Entitier
 * @see io.davorpatech.fwk.model.Identifiable Identifiable
 */
public interface CrudEntityService<T extends Entitier<ID>, ID extends Serializable> // NOSONAR
        extends ReadableEntityService<T, ID>, // NOSONAR
                ServiceReadOps<T, ID>, // NOSONAR
                ServiceWriteOps<T, ID> // NOSONAR
{

}
