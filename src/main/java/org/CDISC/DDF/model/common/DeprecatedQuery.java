package org.CDISC.DDF.model.common;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.Query is a class used to record questions
 * concerning errors or inconsistency within data items to be used during a study.
 *
 * @author Chris Upkes
 */

public class DeprecatedQuery {

/* Firstly, I want to admit that this is the term I used at PhaseForward.  The term is more general than
a question.  It encompasses measurements, readings, etc...
I'm happy to rename question to measurement, however, in this context they are synonymous.
Because queries can be created prior to any results and re-used, they are independent of events and
query results.
 */
    private UUID id;
    private String question;

    public DeprecatedQuery(UUID id, String question) {

        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

}
