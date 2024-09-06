package com.github.simplemocks.webapp.api.rq;

import jakarta.annotation.Nonnull;
import lombok.Builder;

import java.util.List;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@Builder
public record SearchByTagsRq(
        @Nonnull List<String> tags,
        int page,
        int pageSize
) {
}
