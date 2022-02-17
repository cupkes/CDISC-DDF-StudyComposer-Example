package org.CDISC.DDF.model.common;

import java.net.URI;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.AssessmentGroup is a is used to group related
 * Assessment objects.  The AssessmentGroup is also used to provide standard library
 * related information to groups of assessments.
 *
 * @author Chris Upkes
 */


public class DeprecatedAssessmentGroup {

    private final UUID id;
//  this is the eCRF link seen in the API.  Not still sure that it belongs here
//  I'm fine changing the semantics of the variable name.  Just not sure if there could be different types.


    private URI assementLink;

    public DeprecatedAssessmentGroup getSubGroup() {
        return subGroup;
    }

    public void setSubGroup(DeprecatedAssessmentGroup subGroup) {
        this.subGroup = subGroup;
    }

    private DeprecatedAssessmentGroup subGroup;

    public DeprecatedAssessmentGroup(UUID id, URI assementLink) {
        this.id = id;
        this.assementLink = assementLink;
    }

    public DeprecatedAssessmentGroup(UUID id) {
        this.id = id;

    }

    public UUID getId() {
        return id;
    }


    public URI getAssementLink() {
        return assementLink;
    }

    public void setAssementLink(URI assementLink) {
        this.assementLink = assementLink;
    }
}
