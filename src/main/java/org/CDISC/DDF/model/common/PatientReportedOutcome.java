package org.CDISC.DDF.model.common;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.PatientReportedOutcome is a subclass of Procedure.
 *
 * @author Chris Upkes
 */

public class PatientReportedOutcome extends Procedure{
    protected PatientReportedOutcome(UUID id) {
        super(id);
    }
}
