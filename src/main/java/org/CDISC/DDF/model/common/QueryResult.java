package org.CDISC.DDF.model.common;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.QueryResult is a class used to capture the result of a query.
 *
 * @author Chris Upkes
 */

public class QueryResult extends StudyData{



    private UUID id;
    // we need the actual query to associate the results.  By triangulating the result the query and the event
    // we will be able to scope the query result effectively.
    private UUID queryId;
    private String result;


    public QueryResult(UUID id, UUID collectionEventId, UUID queryId, String result) {
        super(id, collectionEventId);
        this.id = id;
        this.queryId = queryId;
        this.result = result;
    }

    public UUID getId() {
        return id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public UUID getQueryId() {
        return queryId;
    }
}
