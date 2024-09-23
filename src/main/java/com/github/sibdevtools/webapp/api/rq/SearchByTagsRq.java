package com.github.sibdevtools.webapp.api.rq;

import jakarta.annotation.Nonnull;
import lombok.Builder;

import java.util.List;

/**
 * Search by tags request
 *
 * @param tags     tags to lookup
 * @param page     page number
 * @param pageSize page size
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
