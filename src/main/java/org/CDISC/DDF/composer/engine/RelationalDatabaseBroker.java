package org.CDISC.DDF.composer.engine;

import org.CDISC.DDF.composer.SDR.*;
import org.CDISC.DDF.model.common.DeprecatedAssessmentGroup;
import org.CDISC.DDF.model.common.DeprecatedStudyData;
import org.CDISC.DDF.model.study.Objective;
import org.CDISC.DDF.model.study.StudyIdentifier;
import org.CDISC.DDF.model.studyDesign.*;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

public class RelationalDatabaseBroker implements IStudyComponentBroker{
    @Override
    public List<StudyCell> getStudyCells(UUID studyDesignId) {
        return null;
    }

    @Override
    public StudyCell getStudyCell(UUID studyCellId) {
        return null;
    }

    @Override
    public StudyCellsSection getStudyCellsSection(UUID studyDesignId) {
        return null;
    }

    @Override
    public List<PlannedWorkflow> getPlannedWorkflows(UUID studyCellId) throws URISyntaxException {
        return null;
    }

    @Override
    public PlannedWorkflow getPlannedWorkflow(UUID plannedWorkflowId) throws URISyntaxException {
        return null;
    }

    @Override
    public PlannedWorkflowsSection getPlannedWorkflowsSection(UUID studyDesignId) throws URISyntaxException {
        return null;
    }

    @Override
    public WorkflowItemMatrix getWorkflowItemMatrix(UUID plannedWorkflowId) throws URISyntaxException {
        return null;
    }

    @Override
    public WorkflowItem getTransitionWorkflowItem(UUID workFlowItemId, UUID previousItemId) throws URISyntaxException {
        return null;
    }

    @Override
    public List<WorkflowItem> getWorkflowItems(UUID plannedWorkflowId) throws URISyntaxException {
        return null;
    }

    @Override
    public List<WorkflowItem> getBranchedWorkflowItems(UUID plannedWorkflowId) throws URISyntaxException {
        return null;
    }

    @Override
    public ItemSequence getItemSequence(UUID plannedWorkflowId) throws URISyntaxException {
        return null;
    }

    @Override
    public List<StudyElement> getStudyElements(UUID studyCellId) {
        return null;
    }

    @Override
    public StudyElement getStudyElement(UUID studyElementId) {
        return null;
    }

    @Override
    public List<Objective> getStudyObjectives(UUID studyId) {
        return null;
    }

    @Override
    public Objective getStudyObjective(UUID studyObjectiveId) {
        return null;
    }

    @Override
    public ObjectivesSection getStudyObjectivesSection(UUID objectivesSectionId) {
        return null;
    }

    @Override
    public InvestigationalInterventionsSection getInvestigationalInterventionsSection(UUID studyId) {
        return null;
    }

    @Override
    public StudyIndicationsSection getStudyIndicationsSection(UUID studyId) {
        return null;
    }

    @Override
    public StudyPopulationsSection getStudyPopulationsSection(UUID studyDesignId) {
        return null;
    }

    @Override
    public List<StudyDesign> getStudyDesigns(UUID studyId) throws URISyntaxException {
        return null;
    }

    @Override
    public StudyDesign getStudyDesign(UUID studyId) throws URISyntaxException {
        return null;
    }

    @Override
    public StudyDesignsSection getStudyDesignsSection(UUID studyId) throws URISyntaxException {
        return null;
    }

    @Override
    public List<StudyIdentifier> getStudyIdentifiers(UUID studyId) {
        return null;
    }

    @Override
    public StudyIdentifier getStudyIdentifier(UUID studyId) {
        return null;
    }

    @Override
    public StudyEpoch getStudyEpoch(UUID studyDesignId) {
        return null;
    }

    @Override
    public DeprecatedStudyData getAssessment(UUID studyId) {
        return null;
    }

    @Override
    public DeprecatedAssessmentGroup getAssessmentGroup(UUID studyId) {
        return null;
    }
}
