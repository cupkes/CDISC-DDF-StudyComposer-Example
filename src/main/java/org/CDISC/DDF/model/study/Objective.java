package org.CDISC.DDF.model.study;

import java.util.ArrayList;
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
    private List<Endpoint> endpoints = new ArrayList<>();
    private final UUID id;
    private final ObjectiveLevel level;

    public Objective(String description, UUID id, ObjectiveLevel level) {
        this.description = description;
        this.id = id;
        this.level = level;
    }

    public Objective(String description, List<Endpoint> endpoints, UUID id, ObjectiveLevel level) {
        this.description = description;
        this.endpoints = endpoints;
        this.id = id;
        this.level = level;
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

    public void addEndpoint(Endpoint endpoint){

        this.endpoints.add(endpoint);
    }

    public void removeEndpoint(Endpoint endpoint)
    {
        this.endpoints.remove(endpoint);

    }


    public UUID getId() {
        return id;
    }

    public ObjectiveLevel getLevel() {
        return level;
    }
}
