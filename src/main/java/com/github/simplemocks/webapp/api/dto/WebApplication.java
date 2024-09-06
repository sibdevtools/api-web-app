package com.github.simplemocks.webapp.api.dto;

import jakarta.annotation.Nonnull;

import java.util.Set;

/**
 * Web application description. Used to visualize the application.
 *
 * @author sibmaks
 * @since 0.0.1
 */
public interface WebApplication {

    /**
     * Web application code, used for application identification.<br/>
     * Example: {@code utils.converter.base64}
     *
     * @return application code
     */
    @Nonnull
    String getCode();

    /**
     * Web application frontend url.<br/>
     * Example: {@code /apps/utils/converter/base64}
     *
     * @return frontend url
     */
    @Nonnull
    String getFrontendUrl();

    /**
     * Web application icon code
     *
     * @return icon code
     */
    @Nonnull
    String getIconCode();

    /**
     * Web application title localization code
     *
     * @return title localization code
     */
    @Nonnull
    String getTitleCode();

    /**
     * Web application description localization code
     *
     * @return description localization code
     */
    @Nonnull
    String getDescriptionCode();

    /**
     * Web application tags. Tags are used for filtering web applications.
     *
     * @return application tags
     */
    @Nonnull
    Set<String> getTags();

    /**
     * Get current web application health status.
     *
     * @return current health status
     */
    @Nonnull
    HealthStatus getHealthStatus();
}