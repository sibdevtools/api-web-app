package com.github.sibdevtools.webapp.api.rq;

import jakarta.annotation.Nonnull;
import lombok.Builder;

/**
 * Get application request
 *
 * @param code application code
 * @author sibmaks
 * @since 0.0.1
 */
@Builder
public record GetApplicationRq(
        @Nonnull String code
) {
}
