package org.CDISC.DDF.composer.engine;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.CDISC.DDF.composer.SDR.ObjectivesSection;
import org.CDISC.DDF.composer.SDR.Study;
import org.CDISC.DDF.composer.SDR.StudyDesign;
import org.CDISC.DDF.composer.SDR.StudyDesignsSection;
import org.CDISC.DDF.composer.util.StaticStudyDataProvider;
import org.CDISC.DDF.model.study.*;
import org.CDISC.DDF.model.studyDesign.TrialIntentType;
import org.CDISC.DDF.model.versioning.IStudy;
import org.CDISC.DDF.model.versioning.IStudyDesign;
import org.CDISC.DDF.model.versioning.SectionType;

import java.net.URISyntaxException;
import java.util.ArrayList;
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

    private IStudyDesign studyDesign;

    public IStudy getMockIStudy() throws URISyntaxException {

        IStudyComponentBroker mockBroker = new MockBroker();


        UUID studyId = UUID.randomUUID();
        this.study = new Study(studyId,
                "Study Number One",
                StudyType.INTERVENTIONAL,
                Phase.PHASE_1_TRIAL,
                "1.0",
                mockBroker.getStudyIdentifiers(UUID.randomUUID())
                );

        this.study.setStudyStatus("this is a study status");
        this.study.addStudyProtocolReference(new StudyProtocolReference(UUID.randomUUID(),
                "1.0"));
        this.study.addSection(SectionType.STUDY_DESIGNS, mockBroker.getStudyDesignsSection(studyId));
        this.study.addSection(SectionType.STUDY_INDICATIONS, mockBroker.getStudyIndicationsSection(studyId));
        this.study.addSection(SectionType.OBJECTIVES, mockBroker.getStudyObjectivesSection(studyId));
        return study;
    }

    private IStudy study;

//    public StudyDesign getMockStudyDesign() {
//
//
//        studyDesign = new StudyDesign(UUID.randomUUID(),"1.0");
//        // TO_DO add sections
//        return studyDesign;
//
//    }

    public IStudyDesign getMockIStudyDesign() throws URISyntaxException {

        StudyDesign sd = new StudyDesign(UUID.randomUUID());
        sd.setTrialType(TrialType.EFFICACY);
        TrialIntentType t = new TrialIntentType(UUID.randomUUID(), "this is a trial intent type");
        sd.setTrialIntentType(t);

        IStudyComponentBroker mockBroker = new MockBroker();
        studyDesign.addSection(SectionType.STUDY_CELLS, mockBroker.getStudyCellsSection(UUID.randomUUID()));
        studyDesign.addSection(SectionType.PLANNED_WORKFLOWS, mockBroker.getPlannedWorkflowsSection(UUID.randomUUID()));
        studyDesign.addSection(SectionType.STUDY_POPULATIONS, mockBroker.getStudyPopulationsSection(UUID.randomUUID()));
        this.studyDesign.addSection(SectionType.INVESTIGATIONAL_INTERVENTIONS,
                mockBroker.getInvestigationalInterventionsSection(UUID.randomUUID()));
        return studyDesign;



    }
//
//    public StudyDesignsSection getMockStudyDesignSection(UUID studyId, String version) {
//
//        List<StudyDesign> studyDesigns = new ArrayList<>();
//        studyDesigns.add(this.getMockStudyDesign());
//        StudyDesignsSection sdSection = new StudyDesignsSection(UUID.randomUUID(), version, SectionType.STUDY_DESIGNS);
//        sdSection.setStudyDesigns(studyDesigns);
//        return sdSection;
//
//    }

    public StudyDesign getStudyDesign(UUID studyDesignId) {

        return null;
    }

    // TO_DO implement a study objective collection composition

    public List<Objective> getMockStudyObjectives(UUID studyId){

        IStudyComponentBroker mockBroker = new MockBroker();
        return mockBroker.getStudyObjectives(studyId);

    }

    public ObjectivesSection getMockObjectivesSection(UUID studyId) {

        IStudyComponentBroker mockBroker = new MockBroker();
        return mockBroker.getStudyObjectivesSection(studyId);

    }



    public List<Objective> getStudyObjectives(UUID studyId){

        return null;
    }

    public IStudy getStudy(UUID studyId) {

        return null;
    }

    public IStudy getStudy(UUID studyId, IStudyComponentBroker studyComponentBroker)  {

        try {
           study = studyComponentBroker.getStudy(studyId.toString());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        return study;
    }





    // TO_DO implement a study endpoint collection composition

    // TO_DO implement a study
}
