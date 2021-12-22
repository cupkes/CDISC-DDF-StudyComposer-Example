package org.CDISC.DDF.composer.SDR;

import org.CDISC.DDF.model.studyDesign.PlannedWorkflow;
import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PlannedWorkflowsSection extends Section {
    public PlannedWorkflowsSection(UUID id, String version, SectionType sectionType) {
        super(id, version, sectionType);
    }

    private List<PlannedWorkflow> plannedWorkflows = new ArrayList<>();

    public List<PlannedWorkflow> getPlannedWorkflows() {
        return plannedWorkflows;
    }

    public void setPlannedWorkflows(List<PlannedWorkflow> plannedWorkflows) {
        this.plannedWorkflows = plannedWorkflows;
    }

    public PlannedWorkflow getPlannedWorkflow(UUID plannedWorkflowId) {

        for (PlannedWorkflow plannedWorkflow : plannedWorkflows
             ) {
           if (plannedWorkflow.getId() == plannedWorkflowId) {

               return plannedWorkflow;
           }
        }

        return null;
    }

    public void addPlannedWorkflow(PlannedWorkflow plannedWorkflow) {

        if (this.plannedWorkflows == null) {
            this.plannedWorkflows = new ArrayList<>();

        }

        this.plannedWorkflows.add(plannedWorkflow);

    }



}
