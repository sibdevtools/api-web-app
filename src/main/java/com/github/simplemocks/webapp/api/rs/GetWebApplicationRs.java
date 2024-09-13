package com.github.simplemocks.webapp.api.rs;

import com.github.simplemocks.common.api.dto.ErrorRsDto;
import com.github.simplemocks.common.api.rs.StandardBodyRs;
import com.github.simplemocks.webapp.api.dto.WebApplication;
import jakarta.annotation.Nonnull;

/**
 * Get web application response dto
 *
 * @author sibmaks
 * @since 0.0.3
 */
public class GetWebApplicationRs extends StandardBodyRs<WebApplication> {

    /**
     * Construct get web application response
     *
     * @param webApplication web application
     */
    public GetWebApplicationRs(@Nonnull WebApplication webApplication) {
        super(webApplication);
    }

    /**
     * Construct get web application response with error
     *
     * @param error happened error
     */
    public GetWebApplicationRs(@Nonnull ErrorRsDto error) {
        super(error);
    }

}
