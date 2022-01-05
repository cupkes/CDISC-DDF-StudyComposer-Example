package org.CDISC.DDF.composer.SDR;

import org.CDISC.DDF.model.study.InvestigationalIntervention;
import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class InvestigationalInterventionsSection extends Section {

    private List<InvestigationalIntervention> investigationalInterventions = new ArrayList<>();

    public InvestigationalInterventionsSection(UUID id, String tag) {
        super(id, SectionType.INVESTIGATIONAL_INTERVENTIONS, tag);
    }

    public InvestigationalInterventionsSection(UUID id) {
        super(id, SectionType.INVESTIGATIONAL_INTERVENTIONS);
    }

    public List<InvestigationalIntervention> getInvestigationalInterventions() {
        return investigationalInterventions;
    }

    public void setInvestigationalInterventions(List<InvestigationalIntervention> investigationalInterventions) {
        this.investigationalInterventions = investigationalInterventions;
    }

     public InvestigationalIntervention getInvestigationalIntervention(UUID interventionId){
        
        for (InvestigationalIntervention intervention : investigationalInterventions) {

            if(intervention.getId() == interventionId) {
                return intervention;
            }

        }

        return null;

    }

    public void addInvestigationalIntervention(InvestigationalIntervention investigationalIntervention){

        this.investigationalInterventions.add(investigationalIntervention);

    }



}
