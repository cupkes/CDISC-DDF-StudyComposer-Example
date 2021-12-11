package org.CDISC.DDF.model.study;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.study.Endpoint is A defined variable intended to reflect an outcome of interest
 * that is statistically analyzed to address a particular research question.
 *
 * @author Chris Upkes
 */

public class Endpoint {



    private final String description;
    private final EndpointPurpose purpose;
    private final UUID id;
    private final OutcomeLevel outcomeLevel;


    public Endpoint(String description, EndpointPurpose purpose, UUID id, OutcomeLevel outcomeLevel) {
        this.description = description;
        this.purpose = purpose;
        this.id = id;
        this.outcomeLevel = outcomeLevel;
    }

    public String getDescription() {
        return description;
    }

    public EndpointPurpose getPurpose() {
        return purpose;
    }


    public UUID getId() {
        return id;
    }

    public OutcomeLevel getOutcomeLevel() {
        return outcomeLevel;
    }
}
