package org.CDISC.DDF.composer.engine;


import org.CDISC.DDF.composer.SDR.*;
import org.CDISC.DDF.composer.SDR.StudyDesign;
import org.CDISC.DDF.model.common.DeprecatedAssessmentGroup;
import org.CDISC.DDF.model.common.DeprecatedStudyData;
import org.CDISC.DDF.model.study.Objective;
import org.CDISC.DDF.model.study.StudyIdentifier;
import org.CDISC.DDF.model.studyDesign.*;

import java.net.URISyntaxException;
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

//    StudyCellsSection getStudyCellsSection(UUID studyDesignId, String tag);

    StudyCellsSection getStudyCellsSection(UUID studyDesignId);

    List<PlannedWorkflow> getPlannedWorkflows(UUID studyCellId) throws URISyntaxException;

    PlannedWorkflow getPlannedWorkflow(UUID plannedWorkflowId) throws URISyntaxException;

    PlannedWorkflowsSection getPlannedWorkflowsSection(UUID studyDesignId) throws URISyntaxException;

//    PlannedWorkflowsSection getPlannedWorkflowsSection(UUID studyDesignId, String tag);

    WorkflowItemMatrix getWorkflowItemMatrix(UUID plannedWorkflowId) throws URISyntaxException;

    WorkflowItem getTransitionWorkflowItem(UUID workFlowItemId, UUID previousItemId) throws URISyntaxException;

    List<WorkflowItem> getWorkflowItems(UUID plannedWorkflowId) throws URISyntaxException;

    List<WorkflowItem> getBranchedWorkflowItems(UUID plannedWorkflowId) throws URISyntaxException;

    ItemSequence getItemSequence(UUID plannedWorkflowId) throws URISyntaxException;

    List<StudyElement> getStudyElements(UUID studyCellId);

    StudyElement getStudyElement(UUID studyElementId);

    List<Objective> getStudyObjectives(UUID studyId);

    Objective getStudyObjective(UUID studyObjectiveId);

//    ObjectivesSection getStudyObjectivesSection(UUID objectivesSectionId, String tag);

    ObjectivesSection getStudyObjectivesSection(UUID objectivesSectionId);

//    InvestigationalInterventionsSection getInvestigationalInterventionsSection(UUID studyId, String tag);

    InvestigationalInterventionsSection getInvestigationalInterventionsSection(UUID studyId);

//    StudyIndicationsSection getStudyIndicationsSection(UUID studyId, String tag);

    StudyIndicationsSection getStudyIndicationsSection(UUID studyId);

//    StudyPopulationsSection getStudyPopulationsSection(UUID studyDesignId, String tag);

    StudyPopulationsSection getStudyPopulationsSection(UUID studyDesignId);

    List<StudyDesign> getStudyDesigns(UUID studyId) throws URISyntaxException;

    StudyDesign getStudyDesign(UUID studyId) throws URISyntaxException;

//    StudyDesignsSection getStudyDesignsSection(UUID studyId, String tag);

    StudyDesignsSection getStudyDesignsSection(UUID studyId) throws URISyntaxException;

    List<StudyIdentifier> getStudyIdentifiers(UUID studyId);

    StudyIdentifier getStudyIdentifier(UUID studyId);

    StudyEpoch getStudyEpoch(UUID studyDesignId);

    DeprecatedStudyData getAssessment(UUID studyId);

    DeprecatedAssessmentGroup getAssessmentGroup(UUID studyId);



























}
