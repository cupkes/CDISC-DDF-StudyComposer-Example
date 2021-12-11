package org.CDISC.DDF.model.study;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.study.Population is the population within the general population for which the study results can be generalized.
 *
 * @author Chris Upkes
 */
public class Population {

    private final UUID id;
    private final String description;


    public Population(UUID id, String description) {
        this.id = id;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
