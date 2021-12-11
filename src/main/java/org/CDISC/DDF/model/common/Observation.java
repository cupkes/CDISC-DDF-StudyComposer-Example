package org.CDISC.DDF.model.common;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.Observation is a class used to collect observational text generated during a study.
 *
 * @author Chris Upkes
 */

public class Observation extends StudyData{

/* An observation is defined separately from a query because it doesn't require a pre-determined
query.  Observations are ad-hoc by nature.
 */

    // I use response here instead of observationText simply because it was in the mind-map,
    // and I found it intuitive.

    private String response;

    public Observation(UUID id, UUID collectionEventId){
        super(id, collectionEventId);
    }

    public Observation(UUID id, UUID collectionEventId, String response) {
        super(id, collectionEventId);
        this.response = response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }
}
