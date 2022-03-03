package org.CDISC.DDF.composer.engine;

// use the StaticStudyDataProvider to populate object properties

// import model

// import jackson or gson
// The question here is whether the gson or jackson library is better suited.
// experience with jackson but have seen numerous references to the Google implementation.


import org.CDISC.DDF.composer.SDR.*;
import org.CDISC.DDF.composer.SDR.StudyDesign;
import org.CDISC.DDF.composer.util.StaticStudyDataProvider;
import org.CDISC.DDF.model.common.*;
import org.CDISC.DDF.model.study.*;
import org.CDISC.DDF.model.studyDesign.*;
import org.CDISC.DDF.model.versioning.SectionType;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.composer.engine.FileBroker extends the IStudyComponentBroker interface and acts as a stub
 * for use by the study composer to return static example data.
 *
 * @author Chris Upkes
 */

public class MockBroker  implements IStudyComponentBroker{

    @Override
    public List<StudyCell> getStudyCells(UUID studyDesignId) {

        List<StudyCell> studyCells = new ArrayList<>();
        studyCells.add(this.getStudyCell(UUID.randomUUID()));
        return studyCells;
    }

    @Override
    public StudyCell getStudyCell(UUID studyCellId) {

        // first, build a study arm
        StudyArm studyArm = new StudyArm(StaticStudyDataProvider.STUDY_ARM_DESC,
                UUID.randomUUID(),
                StudyArmType.ACTIVE_COMPARATOR_ARM,
                OriginType.INTERNAL,
                StudyArmOrigin.HISTORICAL,
                StaticStudyDataProvider.STUDY_ARM_NAME);


        // second, build a study epoch
        StudyEpoch studyEpoch = new StudyEpoch(UUID.randomUUID(),
                EpochType.SCREENING,
                StaticStudyDataProvider.EPOCH_NAME,
                StaticStudyDataProvider.EPOCH_DESC,
                StaticStudyDataProvider.EPOCH_SEQUENCE);

        // then get a list of study elements
        List<StudyElement> studyElements = this.getStudyElements(studyCellId);

        // finally build and return study cell

        return new StudyCell(studyCellId,studyElements,studyArm,studyEpoch);

    }

//    @Override
//    public StudyCellsSection getStudyCellsSection(UUID studyDesignId, String tag) {
//
//
//        StudyCellsSection scSection = new StudyCellsSection(UUID.randomUUID(), tag);
//        scSection.addStudyCell(this.getStudyCell(UUID.randomUUID()));
//
//        return scSection;
//    }

    @Override
    public StudyCellsSection getStudyCellsSection(UUID studyDesignId) {
        StudyCellsSection scSection = new StudyCellsSection(UUID.randomUUID());
        scSection.addStudyCell(this.getStudyCell(UUID.randomUUID()));

        return scSection;
    }

    @Override
    public List<PlannedWorkflow> getPlannedWorkflows(UUID studyCellId) throws URISyntaxException {

        List<PlannedWorkflow> plannedWorkFlows = new ArrayList<>();
        plannedWorkFlows.add(this.getPlannedWorkflow(UUID.randomUUID()));
        return plannedWorkFlows;

    }

    @Override
    public PlannedWorkflow getPlannedWorkflow(UUID plannedWorkflowId) throws URISyntaxException {

        // first get a matrix of workflowitems



        // second, build points in time

        PointInTime fromPointInTime = new PointInTime(UUID.randomUUID(),
                PointInTimeType.SCREENING,
                StaticStudyDataProvider.PIT_SUBJECT_STATUS_GROUPING,
                new Date(),
                new Date());

        PointInTime toPointInTime = new PointInTime(UUID.randomUUID(),
                PointInTimeType.SCREENING,
                StaticStudyDataProvider.PIT_SUBJECT_STATUS_GROUPING,
                new Date(),
                new Date());

        // build and return the workflow

        return new PlannedWorkflow(plannedWorkflowId,StaticStudyDataProvider.PLANNED_WORKFLOW_DESC,
                fromPointInTime,toPointInTime, this.getWorkflowItemMatrix(plannedWorkflowId));




    }

    @Override
    public PlannedWorkflowsSection getPlannedWorkflowsSection(UUID studyDesignId) throws URISyntaxException {

        PlannedWorkflowsSection plannedWorkflowsSection = new PlannedWorkflowsSection(UUID.randomUUID());
        plannedWorkflowsSection.setPlannedWorkflows(this.getPlannedWorkflows(studyDesignId));

        return plannedWorkflowsSection;
    }

    @Override
    public WorkflowItemMatrix getWorkflowItemMatrix(UUID plannedWorkflowId) throws URISyntaxException {

        WorkflowItemMatrix workflowItemMatrix = new WorkflowItemMatrix(UUID.randomUUID());
        workflowItemMatrix.addItemSequence(this.getItemSequence(plannedWorkflowId));
        return workflowItemMatrix;

    }

    @Override
    public WorkflowItem getTransitionWorkflowItem(UUID workFlowItemId, UUID previousItemId) throws URISyntaxException {


        // third build points in time

        PointInTime fromPointInTime = new PointInTime(UUID.randomUUID(),
                PointInTimeType.SCREENING,
                StaticStudyDataProvider.PIT_SUBJECT_STATUS_GROUPING,
                new Date(),
                new Date());

        PointInTime toPointInTime = new PointInTime(UUID.randomUUID(),
                PointInTimeType.SCREENING,
                StaticStudyDataProvider.PIT_SUBJECT_STATUS_GROUPING,
                new Date(),
                new Date());


        MedicalProcedure procedure = new MedicalProcedure(UUID.randomUUID());
        procedure.setProcedureCode("testCode");

        List<Procedure> procedures = new ArrayList<>();
        procedures.add(procedure);

        StudyData studyData = new StudyData(UUID.randomUUID(),
                StaticStudyDataProvider.ASSESSMENT_NAME,
                StaticStudyDataProvider.ASSESSMENT_DESC,
                new URI(StaticStudyDataProvider.ECRF_LINK));
        List<StudyData> studyDataList = new ArrayList<>();
        studyDataList.add(studyData);
        String description = "Some common activity";


        Activity activity = new Activity(UUID.randomUUID(), description, procedures, studyDataList);




        WorkflowItem workflowItem = new WorkflowItem (UUID.randomUUID(),StaticStudyDataProvider.TRANSITION_DESC,
                fromPointInTime,toPointInTime, activity);




        workflowItem.setEncounter(this.getMockVisit());
        if (previousItemId != null) {
            List<UUID> previousItems = new ArrayList<>();
            previousItems.add(previousItemId);
            workflowItem.setPreviousItemsInSequence(previousItems);
        }
        return workflowItem;

    }

//    @Override
//    public PlannedWorkflowsSection getPlannedWorkflowsSection(UUID studyDesignId, String tag) {
//        PlannedWorkflowsSection plannedWorkflowsSection = new PlannedWorkflowsSection(UUID.randomUUID(), tag);
//        plannedWorkflowsSection.setPlannedWorkflows(this.getPlannedWorkflows(studyDesignId));
//
//        return plannedWorkflowsSection;
//    }

    @Override
    public List<WorkflowItem> getWorkflowItems(UUID plannedWorkflowId) throws URISyntaxException {

        List<WorkflowItem> workflowItems = new ArrayList<>();
        WorkflowItem firstItem = this.getTransitionWorkflowItem(UUID.randomUUID(), null);
        WorkflowItem nextItem = this.getTransitionWorkflowItem(UUID.randomUUID(), firstItem.getId());
        List<UUID> nextItemsInSequence = new ArrayList<>();
        nextItemsInSequence.add(nextItem.getId());
        firstItem.setNextItemsInSequence(nextItemsInSequence);

        workflowItems.add(firstItem);
        workflowItems.add(nextItem);


        // TODO: add an event and then another transition
        // TODO:  prior to returning, write tuple / JSON to audit log.
        return workflowItems;

    }

    @Override
    public List<WorkflowItem> getBranchedWorkflowItems(UUID plannedWorkflowId) throws URISyntaxException {
        List<WorkflowItem> workflowItems = new ArrayList<>();
        workflowItems.add( this.getTransitionWorkflowItem(UUID.randomUUID(), null));
        // TODO: add an event and then another transition
        return workflowItems;
    }

    @Override
    public ItemSequence getItemSequence(UUID plannedWorkflowId) throws URISyntaxException {
        return new ItemSequence(UUID.randomUUID(), this.getWorkflowItems(plannedWorkflowId));

    }

    @Override
    public List<StudyElement> getStudyElements(UUID studyCellId) {

        List<StudyElement> studyElements = new ArrayList<>();
        studyElements.add(this.getStudyElement(UUID.randomUUID()));

        return studyElements;
    }

    @Override
    public StudyElement getStudyElement(UUID studyElementId) {

        // First, build a list of codes
        List<Code> startRuleCoding = new ArrayList<>();
        List<Code> endRuleCoding = new ArrayList<>();
        Code code = new Code(StaticStudyDataProvider.CODE,
                StaticStudyDataProvider.CODE_SYSTEM,
                StaticStudyDataProvider.CODE_SYSTEM_VERSION,
                StaticStudyDataProvider.DECODE);
        startRuleCoding.add(code);

        Code code2 = new Code(StaticStudyDataProvider.CODE2,
                StaticStudyDataProvider.CODE2_SYSTEM,
                StaticStudyDataProvider.CODE2_SYSTEM_VERSION,
                StaticStudyDataProvider.DECODE);
        endRuleCoding.add(code2);

        // then build start and end rules
        Rule startRule = new Rule(UUID.randomUUID(),StaticStudyDataProvider.RULE_DESC,startRuleCoding);
        Rule endRule = new Rule(UUID.randomUUID(),StaticStudyDataProvider.RULE_DESC, endRuleCoding);

        // then build and return the study element

        return new StudyElement(studyElementId,StaticStudyDataProvider.STUDY_ELEMENT_NAME,
                StaticStudyDataProvider.STUDY_ELEMENT_DESC,startRule,endRule);

    }

    @Override
    public List<Objective> getStudyObjectives(UUID studyId) {

        List<Objective> objectives = new ArrayList<>();
        objectives.add(this.getStudyObjective(UUID.randomUUID()));
        return objectives;

    }

    @Override
    public Objective getStudyObjective(UUID studyObjectiveId) {

        // first, build a list of endpoints
        List<Endpoint> endpoints = new ArrayList<>();
        Endpoint endpoint = new Endpoint(StaticStudyDataProvider.ENDPOINT_DESC,
                EndpointPurpose.EFFICACY, UUID.randomUUID(), OutcomeLevel.PRIMARY);
        endpoints.add(endpoint);
        return new Objective(StaticStudyDataProvider.OBJECTIVE_DESC,endpoints,UUID.randomUUID(), ObjectiveLevel.PRIMARY);

}

//    @Override
//    public ObjectivesSection getStudyObjectivesSection(UUID studyId, String tag) {
//
//        ObjectivesSection oSection = new ObjectivesSection(UUID.randomUUID(), tag);
//
//        oSection.setObjectives(this.getStudyObjectives(UUID.randomUUID()));
//
//        return oSection;
//
//
//
//    }

    @Override
    public ObjectivesSection getStudyObjectivesSection(UUID objectivesSectionId) {
        ObjectivesSection oSection = new ObjectivesSection(UUID.randomUUID());

        oSection.setObjectives(this.getStudyObjectives(UUID.randomUUID()));

        return oSection;
    }

//    @Override
//    public InvestigationalInterventionsSection getInvestigationalInterventionsSection(UUID studyId, String tag) {
//
//        InvestigationalIntervention intervention = new InvestigationalIntervention(UUID.randomUUID(),
//                "Ibuprofen 200mg");
//
//        Code code = new Code("26929004",
//                "SNOMED-CT",
//                "4.0.6.4",
//                "Alzheimer's disease (disorder)");
//        intervention.addCode(code);
//        InvestigationalInterventionsSection iiSection = new InvestigationalInterventionsSection(UUID.randomUUID(),
//               tag);
//
//        iiSection.addInvestigationalIntervention(intervention);
//
//        return iiSection;
//    }

    @Override
    public InvestigationalInterventionsSection getInvestigationalInterventionsSection(UUID studyId) {
        InvestigationalIntervention intervention = new InvestigationalIntervention(UUID.randomUUID(),
                "Ibuprofen 200mg", InterventionModel.SEQUENTIAL);

        Code code = new Code("26929004",
                "SNOMED-CT",
                "4.0.6.4",
                "Alzheimer's disease (disorder)");
        intervention.addCode(code);
        intervention.setStatus("A Status");
        InvestigationalInterventionsSection iiSection = new InvestigationalInterventionsSection(UUID.randomUUID());

        iiSection.addInvestigationalIntervention(intervention);

        return iiSection;
    }

//    @Override
//    public StudyIndicationsSection getStudyIndicationsSection(UUID studyId, String tag) {
//
//        StudyIndication indication = new StudyIndication(UUID.randomUUID(),
//                "Alzheimer's disease");
//        Code code = new Code("26929004",
//                "SNOMED-CT",
//                "4.0.6.4",
//                "Alzheimer's disease (disorder)");
//        indication.addCode(code);
//        StudyIndicationsSection siSection = new StudyIndicationsSection(UUID.randomUUID(), tag);
//        siSection.addStudyIndication(indication);
//        return siSection;
//
//    }

    @Override
    public StudyIndicationsSection getStudyIndicationsSection(UUID studyId) {
        StudyIndication indication = new StudyIndication(UUID.randomUUID(),
                "Alzheimer's disease");
        Code code = new Code("26929004",
                "SNOMED-CT",
                "4.0.6.4",
                "Alzheimer's disease (disorder)");
        indication.addCode(code);
        StudyIndicationsSection siSection = new StudyIndicationsSection(UUID.randomUUID());
        siSection.addStudyIndication(indication);
        return siSection;
    }

//    @Override
//    public StudyPopulationsSection getStudyPopulationsSection(UUID studyDesignId, String tag) {
//
//        Population population = new Population(UUID.randomUUID(),
//                "healthy volunteers of age between 18 and 65");
//        StudyPopulationsSection spSection = new StudyPopulationsSection(UUID.randomUUID(), tag);
//
//        spSection.addStudyPopulation(population);
//
//        return spSection;
//    }

    @Override
    public StudyPopulationsSection getStudyPopulationsSection(UUID studyDesignId) {
        Population population = new Population(UUID.randomUUID(),
                "healthy volunteers of age between 18 and 65");
        StudyPopulationsSection spSection = new StudyPopulationsSection(UUID.randomUUID());

        spSection.addStudyPopulation(population);

        return spSection;
    }

    @Override
    public List<StudyDesign> getStudyDesigns(UUID studyId) throws URISyntaxException {

        List<StudyDesign> studyDesigns = new ArrayList<>();
        studyDesigns.add(this.getStudyDesign(studyId));
        return studyDesigns;

    }

    @Override
    public StudyDesign getStudyDesign(UUID studyId) throws URISyntaxException {
        StudyDesign studyDesign =  new StudyDesign(UUID.randomUUID());
        studyDesign.addSection(SectionType.STUDY_CELLS, this.getStudyCellsSection(UUID.randomUUID()));
        studyDesign.addSection(SectionType.PLANNED_WORKFLOWS, this.getPlannedWorkflowsSection(UUID.randomUUID()));
        studyDesign.addSection(SectionType.STUDY_POPULATIONS, this.getStudyPopulationsSection(UUID.randomUUID()));
        studyDesign.addSection(SectionType.INVESTIGATIONAL_INTERVENTIONS,
                this.getInvestigationalInterventionsSection(UUID.randomUUID()));
        return studyDesign;
    }
//
//    @Override
//    public StudyDesignsSection getStudyDesignsSection(UUID studyId, String tag) {
//        StudyDesignsSection studyDesignsSection = new StudyDesignsSection(UUID.randomUUID(), tag);
//        studyDesignsSection.setStudyDesigns(this.getStudyDesigns(studyId));
//        return studyDesignsSection;
//    }

    @Override
    public StudyDesignsSection getStudyDesignsSection(UUID studyId) throws URISyntaxException {
       StudyDesignsSection studyDesignsSection = new StudyDesignsSection(UUID.randomUUID());
       studyDesignsSection.setStudyDesigns(this.getStudyDesigns(studyId));
       return studyDesignsSection;
    }

    @Override
    public List<StudyIdentifier> getStudyIdentifiers(UUID studyId) {
        List<StudyIdentifier> studyIdentifiers = new ArrayList<>();
        studyIdentifiers.add(this.getStudyIdentifier(UUID.randomUUID()));
        studyIdentifiers.add(this.getSponsorIdentifier(UUID.randomUUID()));
        return studyIdentifiers;

    }

    @Override
    public StudyIdentifier getStudyIdentifier(UUID studyId) {
       return new StudyIdentifier(UUID.randomUUID(),
               StaticStudyDataProvider.IDENTIFIER_CODE,
               StaticStudyDataProvider.IDENTIFIER_NAME,
               IdentifierType.REGISTRY_STUDY);


    }

    @Override
    public StudyEpoch getStudyEpoch(UUID studyDesignId) {
        return new StudyEpoch(UUID.randomUUID(),
                EpochType.SCREENING,
                StaticStudyDataProvider.EPOCH_NAME,
                StaticStudyDataProvider.EPOCH_DESC,
                1);
    }

    @Override
    public DeprecatedStudyData getAssessment(UUID studyId) {
        return new DeprecatedAssessment(UUID.randomUUID(),
                UUID.randomUUID(),
                StaticStudyDataProvider.ASSESSMENT_NAME,
                StaticStudyDataProvider.ASSESSMENT_DESC,
                DeprecatedAssessmentType.SINGLE_ASSESSMENT,
                DeprecatedAssessmentDataType.INTEGER,
                "mmHg"
                );
    }

    @Override
    public DeprecatedAssessmentGroup getAssessmentGroup(UUID studyId) {
        return null;
    }

    private StudyIdentifier getSponsorIdentifier(UUID studyId) {
        return new StudyIdentifier(UUID.randomUUID(),
                StaticStudyDataProvider.IDENTIFIER_CODE,
                StaticStudyDataProvider.IDENTIFIER_NAME,
                IdentifierType.SPONSOR_ID);
    }



    public Encounter getMockVisit() {

        List<Code> coding = new ArrayList<>();
        Code code = new Code("xyz", "test system","1.0", "the decode string");
        coding.add(code);


        Rule startRule = new Rule(UUID.randomUUID(), "start rule", coding);
        Rule endRule = new Rule(UUID.randomUUID(), "end rule", coding);

        Visit visit = new  Visit(UUID.randomUUID(),
                "test visit",
                "visit description",
                startRule,
                endRule,
                ContactMode.IN_PERSON,
                EnvironmentalSetting.CLINIC);
        visit.setEpoch(this.getStudyEpoch(UUID.randomUUID()));
        return visit;



    }



    // I didn't make the StaticStudyDataProvider a private class for MockBroker in case that
    // mock data might be needed elsewhere.  If not, I'll likely move it here.
}
