package io.davorpatech.fwk.service;

import io.davorpatech.fwk.model.Entitier;

import java.io.Serializable;

/**
 * Contract for a basic service that generically defines the most important
 * reading operations for a specific data type.
 *
 * <li>Retrieve all
 * <li>Retrieve one
 * <li>Check existence
 *
 * @param <T> component type that represents the domain entity
 * @param <ID> component type identifying that domain entity
 * @see Entitier
 * @see io.davorpatech.fwk.model.Identifiable Identifiable
 */
public interface ReadableEntityService<T extends Entitier<ID>, ID extends Serializable> // NOSONAR
        extends EntityService<T, ID>, // NOSONAR
                ServiceReadOps<T, ID> // NOSONAR
{

}
