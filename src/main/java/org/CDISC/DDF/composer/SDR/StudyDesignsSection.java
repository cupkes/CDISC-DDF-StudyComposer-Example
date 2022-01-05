package org.CDISC.DDF.composer.SDR;


import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudyDesignsSection extends Section {
    public StudyDesignsSection(UUID id) {
        super(id,SectionType.STUDY_DESIGNS);
    }

    public StudyDesignsSection(UUID id, String tag) {
        super(id,SectionType.STUDY_DESIGNS, tag);
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
