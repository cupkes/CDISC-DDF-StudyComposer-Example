package org.CDISC.DDF.composer.engine;


import org.CDISC.DDF.model.study.Objective;
import org.CDISC.DDF.model.studyDesign.StudyDesign;

import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.composer.engine.StudyComposer fetches individual study components and builds studies
 * and sections of studies for the study composer service.
 *
 * @author Chris Upkes
 */

public class StudyComposer {

    // TO_DO implement a study design composition

    StudyDesign studyDesign;

    public StudyDesign getMockStudyDesign() {

        IStudyComponentBroker mockBroker = new MockBroker();
        UUID studyDesignId = UUID.randomUUID();


        studyDesign = new StudyDesign(studyDesignId,mockBroker.getStudyCells(studyDesignId));
        // so...in my StudyDesign class I have a collection of PlannedWorkflow objects
        // also, each StudyCell object can have multiple workflows
        // is this correct?
        studyDesign.setPlannedWorkflows(mockBroker.getPlannedWorkflows(UUID.randomUUID()));


        return studyDesign;

    }

    public StudyDesign getStudyDesign(UUID studyDesignId) {

        return null;
    }

    // TO_DO implement a study objective collection composition

    public List<Objective> getMockStudyObjectives(UUID studyId){

        IStudyComponentBroker mockBroker = new MockBroker();
        return mockBroker.getStudyObjectives(studyId);

    }

    public List<Objective> getStudyObjectives(UUID studyId){

        return null;
    }





    // TO_DO implement a study endpoint collection composition

    // TO_DO implement a study
}
