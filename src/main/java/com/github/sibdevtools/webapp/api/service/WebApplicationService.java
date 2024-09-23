package com.github.sibdevtools.webapp.api.service;

import com.github.sibdevtools.webapp.api.rs.GetWebApplicationRs;
import com.github.sibdevtools.webapp.api.rq.GetApplicationRq;
import com.github.sibdevtools.webapp.api.rq.SearchByTagsRq;
import com.github.sibdevtools.webapp.api.rs.SearchWebApplicationsRs;
import jakarta.annotation.Nonnull;

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
    GetWebApplicationRs getByCode(@Nonnull GetApplicationRq rq);

    /**
     * Search applications by tags.<br/>
     * If none of applications are found then return empty list.
     *
     * @param rq searching request
     * @return found applications
     */
    @Nonnull
    SearchWebApplicationsRs searchByTags(@Nonnull SearchByTagsRq rq);
}
