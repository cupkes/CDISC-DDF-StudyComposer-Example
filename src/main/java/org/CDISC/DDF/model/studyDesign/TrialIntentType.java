package org.CDISC.DDF.model.studyDesign;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.studyDesign.TrialIntentType is an enum used in study design
 *
 * @author Chris Upkes
 */

public class TrialIntentType {

    private final UUID id;
    private final String type;


    public TrialIntentType(UUID id, String type) {
        this.id = id;
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
