package org.CDISC.DDF.model.common;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.Observation is an abstract class used to provide a way to manage collections
 * of different types of events, such as visits.
 *
 * @author Chris Upkes
 */
public abstract class Encounter {

    private final UUID id;
    private final String name;
    private final String description;
    private final Rule startRule;
    private final Rule endRule;

    protected Encounter(UUID id, String name, String description, Rule startRule, Rule endRule) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startRule = startRule;
        this.endRule = endRule;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Rule getStartRule() {
        return startRule;
    }

    public Rule getEndRule() {
        return endRule;
    }
}
