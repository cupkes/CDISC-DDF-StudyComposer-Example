package org.CDISC.DDF.composer.SDR;


import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudyDesignsSection extends Section {
    public StudyDesignsSection(UUID id, String version, SectionType sectionType) {
        super(id, version, sectionType);
    }



    private List<StudyDesign> studyDesigns = new ArrayList<>();

    public List<StudyDesign> getStudyDesigns() {
        return studyDesigns;
    }

    public void setStudyDesigns(List<StudyDesign> studyDesigns) {
        this.studyDesigns = studyDesigns;
    }

    public StudyDesign getStudyDesign(UUID studyDesignId){

        for (StudyDesign studyDesign : studyDesigns
             ) {
            if (studyDesign.getStudyDesignId() == studyDesignId) {

                return studyDesign;
            }
        }

        return null;
    }

}
