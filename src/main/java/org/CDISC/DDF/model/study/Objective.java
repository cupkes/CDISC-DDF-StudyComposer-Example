package org.CDISC.DDF.model.study;

import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.study.Objective is The reason for performing a trial in terms of the scientific questions to be answered
 * by the analysis of data collected during the trial.
 *
 * @author Chris Upkes
 */

public class Objective {



    private final String description;
    private List<Endpoint> endpoints = null;
    private final UUID id;

    public Objective(String description, UUID id) {
        this.description = description;
        this.id = id;
    }

    public Objective(String description, List<Endpoint> endpoints, UUID id) {
        this.description = description;
        this.endpoints = endpoints;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public List<Endpoint> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<Endpoint> endpoints) {
        this.endpoints = endpoints;
    }

    public void addEndpoint(OutcomeLevel outcomeLevel, Endpoint endpoint){

        // TO_DO
    }

    public void removeEndpoint(OutcomeLevel outcomeLevel, Endpoint endpoint)
    {
        // TO_DO

    }


    public UUID getId() {
        return id;
    }
}
