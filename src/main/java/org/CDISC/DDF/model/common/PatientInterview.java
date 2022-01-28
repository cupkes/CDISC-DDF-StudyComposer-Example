package org.CDISC.DDF.model.common;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.PatientInterview is a subclass of Procedure.
 *
 * @author Chris Upkes
 */

public class PatientInterview extends Procedure{
    protected PatientInterview(UUID id) {
        super(id);
    }
}
