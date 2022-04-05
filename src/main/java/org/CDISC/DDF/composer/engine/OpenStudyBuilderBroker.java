package org.CDISC.DDF.composer.engine;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.CDISC.DDF.composer.SDR.*;
import org.CDISC.DDF.model.common.DeprecatedAssessmentGroup;
import org.CDISC.DDF.model.common.DeprecatedStudyData;
import org.CDISC.DDF.model.study.*;
import org.CDISC.DDF.model.studyDesign.*;

import java.net.URISyntaxException;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class OpenStudyBuilderBroker implements IStudyComponentBroker {
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
    public Study getStudy(String studyId) throws JsonProcessingException {

        OpenStudy openStudy = OpenStudyParser.getOpenStudyList().get(0);
        CurrentMetadata currentMetadata = openStudy.getCurrentMetadata();
        IdentificationMetadata identificationMetadata = currentMetadata.getIdentificationMetadata();
        VersionMetadata versionMetadata = currentMetadata.getVersionMetadata();
        Map<String, String> registryIdentifiers = identificationMetadata.getRegistryIdentifiers();
        List<StudyIdentifier> studyIdentifiers = new ArrayList<>();
        // just grab the values from the map and add them to a list
        List<String> names = new ArrayList<>();
        List<String> codes = new ArrayList<>();
        AtomicReference<Integer> count = new AtomicReference<>(0);
        registryIdentifiers.forEach( (key, value)->{

           if ((count.get() % 2) == 0) {
               names.add(value);
           } else {
               codes.add(value);

           }
           count.getAndSet(count.get() + 1);

        });

        for (int c = 0; c < names.size() -1; c ++) {

            StudyIdentifier studyIdentifier = new StudyIdentifier(UUID.randomUUID()
            ,codes.get(c)
            ,names.get(c)
            , IdentifierType.SPONSOR_ID);
            studyIdentifiers.add(studyIdentifier);


        }

        return new Study(UUID.randomUUID()
                ,openStudy.getStudyId()
                , StudyType.INTERVENTIONAL
                , Phase.PHASE_1_TRIAL
                ,versionMetadata.getLockedVersionNumber()
                ,studyIdentifiers
                );










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
