package org.CDISC.DDF.composer.engine;

import org.CDISC.DDF.composer.util.StaticStudyDataProvider;
import org.CDISC.DDF.model.common.Code;
import org.CDISC.DDF.model.common.DeprecatedCriterion;
import org.CDISC.DDF.model.common.Rule;
import org.CDISC.DDF.model.study.Endpoint;
import org.CDISC.DDF.model.study.Objective;
import org.CDISC.DDF.model.studyDesign.*;
import org.junit.jupiter.api.BeforeEach;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;


import static org.junit.jupiter.api.Assertions.*;

class MockBrokerTest {

    IStudyComponentBroker mockBroker;

    @BeforeEach
    void init() {
       this.mockBroker = new MockBroker();
    }


    @org.junit.jupiter.api.Test
    void getStudyCells() {

        List<StudyCell> studyCells = mockBroker.getStudyCells(UUID.randomUUID());
        assertNotNull(studyCells);
        StudyCell studyCell = studyCells.get(0);
        assertNotNull(studyCell);
        assertEquals(studyCell.getStudyEpoch().getEpochType(), EpochType.SCREENING);

    }

    @org.junit.jupiter.api.Test
    void getStudyCell() {

        StudyCell studyCell = mockBroker.getStudyCell(UUID.randomUUID());
        assertNotNull(studyCell);
        assertEquals(studyCell.getStudyEpoch().getEpochType(), EpochType.SCREENING);
    }

    @org.junit.jupiter.api.Test
    void getPlannedWorkflows() {

        List<PlannedWorkflow> plannedWorkflows = null;
        try {
            plannedWorkflows = mockBroker.getPlannedWorkflows(UUID.randomUUID());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        assertNotNull(plannedWorkflows);
        PlannedWorkflow plannedWorkflow = plannedWorkflows.get(0);
        assertNotNull(plannedWorkflow);
        assertEquals(plannedWorkflow.getDescription(), StaticStudyDataProvider.PLANNED_WORKFLOW_DESC);
        PointInTime pointInTime = plannedWorkflow.getStartPoint();
        assertNotNull(pointInTime);


    }

    @org.junit.jupiter.api.Test
    void getPlannedWorkflow() {

        PlannedWorkflow plannedWorkflow = null;
        try {
            plannedWorkflow = mockBroker.getPlannedWorkflow(UUID.randomUUID());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        assertNotNull(plannedWorkflow);
        assertEquals(plannedWorkflow.getDescription(), StaticStudyDataProvider.PLANNED_WORKFLOW_DESC);
        PointInTime pointInTime = plannedWorkflow.getStartPoint();
        assertNotNull(pointInTime);

    }





    @org.junit.jupiter.api.Test
    void getStudyElements() {

        List<StudyElement> studyElements = mockBroker.getStudyElements(UUID.randomUUID());
        assertNotNull(studyElements);
        StudyElement studyElement = studyElements.get(0);
        assertNotNull(studyElement);
        assertEquals(studyElement.getDescription(),StaticStudyDataProvider.STUDY_ELEMENT_DESC);
        Rule startRule = studyElement.getStartRule();
        assertNotNull(startRule);
        assertEquals(startRule.getDescription(),StaticStudyDataProvider.RULE_DESC);
        Code code = startRule.getCoding().get(0);
        assertNotNull(code);
        assertEquals(code.getCodeSystem(), StaticStudyDataProvider.CODE_SYSTEM);
    }

    @org.junit.jupiter.api.Test
    void getStudyElement() {

        StudyElement studyElement = mockBroker.getStudyElement(UUID.randomUUID());
        assertNotNull(studyElement);
        assertEquals(studyElement.getDescription(),StaticStudyDataProvider.STUDY_ELEMENT_DESC);
        Rule startRule = studyElement.getStartRule();
        assertNotNull(startRule);
        assertEquals(startRule.getDescription(),StaticStudyDataProvider.RULE_DESC);
        Code code = startRule.getCoding().get(0);
        assertNotNull(code);
        assertEquals(code.getCodeSystem(), StaticStudyDataProvider.CODE_SYSTEM);

    }

    @org.junit.jupiter.api.Test
    void getStudyObjectives() {

        List<Objective> studyObjectives = mockBroker.getStudyObjectives(UUID.randomUUID());
        assertNotNull(studyObjectives);
        Objective objective = studyObjectives.get(0);
        assertNotNull(objective);
        assertEquals(objective.getDescription(),StaticStudyDataProvider.OBJECTIVE_DESC);
        Endpoint endpoint = objective.getEndpoints().get(0);
        assertNotNull(endpoint);
        assertEquals(endpoint.getDescription(),StaticStudyDataProvider.ENDPOINT_DESC);

    }

    @org.junit.jupiter.api.Test
    void getStudyObjective() {

        Objective objective = mockBroker.getStudyObjective(UUID.randomUUID());
        assertNotNull(objective);
        assertEquals(objective.getDescription(),StaticStudyDataProvider.OBJECTIVE_DESC);
        Endpoint endpoint = objective.getEndpoints().get(0);
        assertNotNull(endpoint);
        assertEquals(endpoint.getDescription(),StaticStudyDataProvider.ENDPOINT_DESC);


    }
}