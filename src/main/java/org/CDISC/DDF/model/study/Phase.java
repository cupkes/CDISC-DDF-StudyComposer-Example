package org.CDISC.DDF.model.study;
/**
 * org.CDISC.DDF.model.study.Phase is an enum used to provide values for determining which phase is associated with a Study.
 *
 * @author Chris Upkes
 */

public enum Phase {
    PHASE_1_TRIAL, PHASE_2_TRIAL,PHASE_3_TRIAL, PHASE_4_TRIAL,
    NOT_APPLICABLE,PHASE_0_TRIAL,PHASE_1_AND_2_TRIAL, PHASE_2_AND_3_TRIAL,
    PHASE_2A_TRIAL, PHASE_2B_TRIAL,PHASE_3A_TRIAL,PHASE_3B_TRIAL,PHASE_5_TRIAL
}
