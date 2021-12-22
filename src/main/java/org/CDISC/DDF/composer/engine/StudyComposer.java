package org.CDISC.DDF.composer.engine;


import org.CDISC.DDF.composer.SDR.ObjectivesSection;
import org.CDISC.DDF.composer.SDR.StudyDesign;
import org.CDISC.DDF.composer.SDR.StudyDesignsSection;
import org.CDISC.DDF.model.study.Objective;
import org.CDISC.DDF.model.versioning.IStudy;
import org.CDISC.DDF.model.versioning.SectionType;

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

    StudyDesign studyDesign;

    public StudyDesign getMockStudyDesign() {


        studyDesign = new StudyDesign(UUID.randomUUID(),"1.0");
        // TO_DO add sections
        return studyDesign;

    }

    public StudyDesignsSection getMockStudyDesignSection(UUID studyId, String version) {

        List<StudyDesign> studyDesigns = new ArrayList<>();
        studyDesigns.add(this.getMockStudyDesign());
        StudyDesignsSection sdSection = new StudyDesignsSection(UUID.randomUUID(), version, SectionType.STUDY_DESIGNS);
        sdSection.setStudyDesigns(studyDesigns);
        return sdSection;

    }

    public StudyDesign getStudyDesign(UUID studyDesignId) {

        return null;
    }

    // TO_DO implement a study objective collection composition

    public List<Objective> getMockStudyObjectives(UUID studyId){

        IStudyComponentBroker mockBroker = new MockBroker();
        return mockBroker.getStudyObjectives(studyId);

    }

    public ObjectivesSection getMockObjectivesSection(UUID studyId, String version) {

        IStudyComponentBroker mockBroker = new MockBroker();
        return mockBroker.getStudyObjectivesSection(studyId,version);

    }



    public List<Objective> getStudyObjectives(UUID studyId){

        return null;
    }

    public IStudy getStudy(UUID studyId) {

        return null;
    }





    // TO_DO implement a study endpoint collection composition

    // TO_DO implement a study
}
