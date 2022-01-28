package org.CDISC.DDF.composer.SDR;

import org.CDISC.DDF.model.studyDesign.PlannedWorkflow;
import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.composer.SDR.PlannedWorkflowsSection is in implementation of the
 * Section abstract class.  This section pertains to the collection of workflows associated
 * with studies.
 *
 * @author Chris Upkes
 */

public class PlannedWorkflowsSection extends Section {
    public PlannedWorkflowsSection(UUID id) {
        super(id, SectionType.PLANNED_WORKFLOWS);
    }

//    public PlannedWorkflowsSection(UUID id, String tag) {
//        super(id, SectionType.PLANNED_WORKFLOWS, tag);
//    }

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
