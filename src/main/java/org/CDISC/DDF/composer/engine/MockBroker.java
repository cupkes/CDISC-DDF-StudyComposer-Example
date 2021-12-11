package org.CDISC.DDF.composer.engine;

// use the StaticStudyDataProvider to populate object properties

// import model

// import jackson or gson
// The question here is whether the gson or jackson library is better suited.
// experience with jackson but have seen numerous references to the Google implementation.


import org.CDISC.DDF.composer.util.StaticStudyDataProvider;
import org.CDISC.DDF.model.common.Code;
import org.CDISC.DDF.model.common.Criterion;
import org.CDISC.DDF.model.common.CriterionType;
import org.CDISC.DDF.model.common.Rule;
import org.CDISC.DDF.model.study.Endpoint;
import org.CDISC.DDF.model.study.EndpointPurpose;
import org.CDISC.DDF.model.study.Objective;
import org.CDISC.DDF.model.study.OutcomeLevel;
import org.CDISC.DDF.model.studyDesign.*;

import java.time.LocalDate;
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

    @Override
    public List<PlannedWorkflow> getPlannedWorkflows(UUID studyCellId) {

        List<PlannedWorkflow> plannedWorkFlows = new ArrayList<>();
        plannedWorkFlows.add(this.getPlannedWorkflow(UUID.randomUUID()));
        return plannedWorkFlows;

    }

    @Override
    public PlannedWorkflow getPlannedWorkflow(UUID plannedWorkflowId) {

        // first get a list of transitions

        List<Transition> transitions = this.getTransitions(plannedWorkflowId);

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
                fromPointInTime,toPointInTime,transitions);

    }

    @Override
    public List<Transition> getTransitions(UUID plannedWorkflowId) {

        List<Transition> transitions = new ArrayList<>();
        transitions.add(this.getTransition(UUID.randomUUID()));
        return transitions;

    }

    @Override
    public Transition getTransition(UUID transitionId) {

        // first, build a list of criteria
        List<Criterion> criteria = new ArrayList<>();
        Criterion criterion = new Criterion(UUID.randomUUID(),
                CriterionType.RANDOMIZATION,
                StaticStudyDataProvider.CRITERION_DESC);
        criteria.add(criterion);
        // second, build a rule
        List<Code> ruleCoding = new ArrayList<>();
        Code code = new Code(StaticStudyDataProvider.CODE,
                StaticStudyDataProvider.CODE_SYSTEM,
                StaticStudyDataProvider.CODE_SYSTEM_VERSION,
                StaticStudyDataProvider.DECODE);
        ruleCoding.add(code);
        Rule rule = new Rule(UUID.randomUUID(),StaticStudyDataProvider.RULE_DESC,ruleCoding);

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

        Transition transition = new  Transition(UUID.randomUUID(),StaticStudyDataProvider.TRANSITION_DESC,
                fromPointInTime,toPointInTime,rule);

        transition.setStudyProtocolCriterionTransitionNumber(StaticStudyDataProvider.STUDY_PROTOCOL_CRITERION_TRANSITION_NUMBER);
        transition.setTransitionCriteria(criteria);
        return transition;


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
        return new Objective(StaticStudyDataProvider.OBJECTIVE_DESC,endpoints,UUID.randomUUID());

}


    // I didn't make the StaticStudyDataProvider a private class for MockBroker in case that
    // mock data might be needed elsewhere.  If not, I'll likely move it here.
}
