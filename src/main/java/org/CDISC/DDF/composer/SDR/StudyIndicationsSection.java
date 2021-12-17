package org.CDISC.DDF.composer.SDR;

import org.CDISC.DDF.model.common.StudyIndication;
import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.List;
import java.util.UUID;

public class StudyIndicationsSection extends Section {
    protected StudyIndicationsSection(UUID id, String version, SectionType sectionType) {
        super(id, version, sectionType);
    }

    private List<StudyIndication> studyIndications;


    public List<StudyIndication> getStudyIndications() {
        return studyIndications;
    }

    public void setStudyIndications(List<StudyIndication> studyIndications) {
        this.studyIndications = studyIndications;
    }

    public StudyIndication getStudyIndication(UUID studyIndicationId){

        for (StudyIndication studyIndication : studyIndications
             ) {

            if (studyIndication.getId() == studyIndicationId) {
                return studyIndication;
            }

        }

        return null;
    }

    public void setStudyIndication(StudyIndication studyIndication) {

        studyIndications.add(studyIndication);

    }
}
