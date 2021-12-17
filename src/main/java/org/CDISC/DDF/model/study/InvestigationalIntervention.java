package org.CDISC.DDF.model.study;

import org.CDISC.DDF.model.common.Code;

import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.study.InvestigationalIntervention is the drug, device, therapy, or process under investigation in a clinical study
 * that is believed to have an effect on outcomes of interest in a study.
 *
 * @author Chris Upkes
 */

public class InvestigationalIntervention {

    private final UUID id;
    private final String description;
    private List<Code> coding;

    public InvestigationalIntervention(UUID id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public UUID getId() {
        return id;
    }

    public List<Code> getCoding() {
        return coding;
    }

    public void setCoding(List<Code> coding) {
        this.coding = coding;
    }

    public void addCode(Code code) {

        // TO_DO
    }

    public void removeCode(Code code) {

        // TO_DO
    }
}
