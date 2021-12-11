package org.CDISC.DDF.model.common;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.AssessmentGroup is a .
 *
 * @author Chris Upkes
 */


public class AssessmentGroup {

    private final UUID id;

    public AssessmentGroup getSubGroup() {
        return subGroup;
    }

    public void setSubGroup(AssessmentGroup subGroup) {
        this.subGroup = subGroup;
    }

    private AssessmentGroup subGroup;

    public AssessmentGroup(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }



}
