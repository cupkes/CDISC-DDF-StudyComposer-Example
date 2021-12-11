package org.CDISC.DDF.model.common;

import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.Rule is a rule used to determine the beginning or end of an encounter.
 *
 * @author Chris Upkes
 */


public class Rule {

    private final UUID id;
    private final String description;
    private final List<Code> coding;

    public Rule(UUID id, String description, List<Code> coding) {
        this.id = id;
        this.description = description;
        this.coding = coding;
    }


    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public List<Code> getCoding() {
        return coding;
    }

    public void addCode(Code code){

        // TO_DO
    }

    public void removeCode(Code code){

        // TO_DO
    }
}
