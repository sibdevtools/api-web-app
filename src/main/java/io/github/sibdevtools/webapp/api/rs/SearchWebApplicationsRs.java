package io.github.sibdevtools.webapp.api.rs;

import io.github.sibdevtools.webapp.api.dto.WebApplication;
import io.github.sibdevtools.common.api.dto.ErrorRsDto;
import io.github.sibdevtools.common.api.rs.StandardBodyRs;
import jakarta.annotation.Nonnull;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Search web applications response dto
 *
 * @author sibmaks
 * @since 0.0.3
 */
public class SearchWebApplicationsRs extends StandardBodyRs<ArrayList<WebApplication>> {

    /**
     * Construct search web applications response
     *
     * @param webApplications found web applications
     */
    public SearchWebApplicationsRs(ArrayList<WebApplication> webApplications) {
        super(
                Optional.ofNullable(webApplications)
                        .map(ArrayList::new)
                        .orElseGet(ArrayList::new)
        );
    }

    /**
     * Construct search web applications response with error
     *
     * @param error happened error
     */
    public SearchWebApplicationsRs(@Nonnull ErrorRsDto error) {
        super(error);
    }

}
