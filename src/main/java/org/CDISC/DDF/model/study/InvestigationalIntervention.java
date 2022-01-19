package org.CDISC.DDF.model.study;

import org.CDISC.DDF.model.common.Code;

import java.util.ArrayList;
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
    private List<Code> coding = new ArrayList<>();
    private final InterventionModel interventionModel;


    private String status;

    public InvestigationalIntervention(UUID id, String description, InterventionModel interventionModel) {
        this.id = id;
        this.description = description;
        this.interventionModel = interventionModel;
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

        this.coding.add(code);
    }

    public void removeCode(Code code) {

        this.coding.remove(code);
    }

    public InterventionModel getInterventionModel() {
        return interventionModel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
