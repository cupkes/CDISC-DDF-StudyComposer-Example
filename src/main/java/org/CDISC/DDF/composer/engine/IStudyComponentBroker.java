package org.CDISC.DDF.composer.engine;


import org.CDISC.DDF.composer.SDR.*;
import org.CDISC.DDF.model.study.Objective;
import org.CDISC.DDF.model.studyDesign.PlannedWorkflow;
import org.CDISC.DDF.model.studyDesign.StudyCell;
import org.CDISC.DDF.model.studyDesign.StudyElement;
import org.CDISC.DDF.model.studyDesign.Transition;

import java.util.List;
import java.util.UUID;


/**
 * org.CDISC.DDF.composer.engine.IStudyComponentBroker is an interface used to abstract the repository being used to
 * retrieve individual study components.
 *
 * @author Chris Upkes
 */

public interface IStudyComponentBroker {

    // it's hard to tell what I'm actually going to need at this point.
    // I'll likely have to refactor using methods I'll need in the composer.


    List<StudyCell> getStudyCells(UUID studyDesignId);

    StudyCell getStudyCell(UUID studyCellId);

    StudyCellsSection getStudyCellsSection(UUID studyDesignId);

    List<PlannedWorkflow> getPlannedWorkflows(UUID studyCellId);

    PlannedWorkflow getPlannedWorkflow(UUID plannedWorkflowId);

    PlannedWorkflowsSection getPlannedWorkflowsSection(UUID studyCellId);

    List<Transition> getTransitions(UUID plannedWorkflowId);

    Transition getTransition(UUID transitionId);

    List<StudyElement> getStudyElements(UUID studyCellId);

    StudyElement getStudyElement(UUID studyElementId);

    List<Objective> getStudyObjectives(UUID studyId);

    Objective getStudyObjective(UUID studyObjectiveId);

    ObjectivesSection getStudyObjectivesSection(UUID objectivesSectionId, String version);

    InvestigationalInterventionsSection getInvestigationalInterventionsSection(UUID studyId, String version);

    StudyIndicationsSection getStudyIndicationsSection(UUID studyId, String version);

    StudyPopulationsSection getStudyPopulationsSection(UUID studyDesignId, String version);














}
