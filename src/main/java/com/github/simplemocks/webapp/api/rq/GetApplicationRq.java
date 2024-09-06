package com.github.simplemocks.webapp.api.rq;

import jakarta.annotation.Nonnull;
import lombok.Builder;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@Builder
public record GetApplicationRq(
        @Nonnull String code
) {
}
