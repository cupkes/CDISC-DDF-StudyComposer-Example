package org.CDISC.DDF.model.common;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.PatientInterview is a subclass of Procedure and A conversation with a patient or study participant regarding
 * specific, relevant topics through questions posed by an
 * interviewer.
 *
 * @author Chris Upkes
 */

public class PatientInterview extends Procedure{
    protected PatientInterview(UUID id) {
        super(id);
    }
}
