package com.github.sibdevtools.webapp.api.dto;

/**
 * Health status code
 *
 * @author sibmaks
 * @since 0.0.1
 */
public enum HealthStatus {
    /**
     * Service is down
     */
    DOWN,
    /**
     * Service is up, but not ready for requests
     */
    WAITING,
    /**
     * Service is up and ready for requests
     */
    UP
}
