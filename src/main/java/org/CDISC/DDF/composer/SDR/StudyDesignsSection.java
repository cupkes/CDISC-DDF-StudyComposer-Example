package org.CDISC.DDF.composer.SDR;

import org.CDISC.DDF.model.studyDesign.StudyDesign;
import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.List;
import java.util.UUID;

public class StudyDesignsSection extends Section {
    protected StudyDesignsSection(UUID id, String version, SectionType sectionType) {
        super(id, version, sectionType);
    }



    private List<StudyDesign> studyDesigns;

    public List<StudyDesign> getStudyDesigns() {
        return studyDesigns;
    }

    public void setStudyDesigns(List<StudyDesign> studyDesigns) {
        this.studyDesigns = studyDesigns;
    }

    public StudyDesign getStudyDesign(UUID studyDesignId){

        for (StudyDesign studyDesign : studyDesigns
             ) {
            if (studyDesign.getId() == studyDesignId) {

                return studyDesign;
            }
        }

        return null;
    }

}
