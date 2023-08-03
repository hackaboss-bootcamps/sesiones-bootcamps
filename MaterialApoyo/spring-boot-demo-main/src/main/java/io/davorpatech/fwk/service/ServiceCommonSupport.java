package io.davorpatech.fwk.service;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.core.env.Environment;

/**
 * This support class acts as the root class having the
 * functionality needed by most of {@literal Service}s.
 */
public abstract class ServiceCommonSupport // NOSONAR
        implements Service, EnvironmentAware, MessageSourceAware // NOSONAR
{
    protected Environment environment;

    protected MessageSource messageSource;

    @Override
    public void setMessageSource(final MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public void setEnvironment(final Environment environment) {
        this.environment = environment;
    }
}
