package io.davorpatech.fwk.service;

import io.davorpatech.fwk.model.Entitier;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;

/**
 * Contract for those {@literal Service}s that work on business model entities.
 *
 * @param <T> component type for the business entity
 * @param <ID> component type for the business entity ID.
 * @see Entitier
 * @see io.davorpatech.fwk.model.Identifiable Identifiable
 */
@Validated
public interface EntityService<T extends Entitier<ID>, ID extends Serializable> // NOSONAR
        extends Service // NOSONAR
{

}
