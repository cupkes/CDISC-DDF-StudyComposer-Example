package org.CDISC.DDF.model.common;

import java.util.Date;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.Amendment is an abstract class used to provide requisite properties for amendments used by both
 * protocols and studies or other study elements.
 *
 * @author Chris Upkes
 */

public abstract class Amendment {

    private final Date amendmentEffectiveDate;
    private final String version;
    private final UUID id;

    public Amendment(Date amendmentDate, String version, UUID id) {
        this.amendmentEffectiveDate = amendmentDate;
        this.version = version;
        this.id = id;
    }


    public Date getAmendmentEffectiveDate() {
        return amendmentEffectiveDate;
    }

    public String getVersion() {
        return version;
    }

    public UUID getId() {
        return id;
    }
}
