package com.github.simplemocks.webapp.api.service;

import com.github.simplemocks.webapp.api.dto.WebApplication;
import com.github.simplemocks.webapp.api.rq.GetApplicationRq;
import com.github.simplemocks.webapp.api.rq.SearchByTagsRq;
import jakarta.annotation.Nonnull;

import java.util.List;

/**
 * Service for interacting with web applications
 *
 * @author sibmaks
 * @since 0.0.1
 */
public interface WebApplicationService {

    /**
     * Look up for an application by its code.<br/>
     * If the application is not found an exception is thrown.
     *
     * @param rq looking request
     * @return web application instance
     */
    @Nonnull
    WebApplication getByCode(@Nonnull GetApplicationRq rq);

    /**
     * Search applications by tags.<br/>
     * If none of applications are found then return empty list.
     *
     * @param rq searching request
     * @return found applications
     */
    @Nonnull
    List<WebApplication> searchByTags(@Nonnull SearchByTagsRq rq);
}
