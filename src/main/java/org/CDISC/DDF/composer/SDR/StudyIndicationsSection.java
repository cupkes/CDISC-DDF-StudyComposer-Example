package org.CDISC.DDF.composer.SDR;

import org.CDISC.DDF.model.common.StudyIndication;
import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.composer.SDR.StudyIndicationsSection is in implementation of the
 * Section abstract class.  This section pertains to the collection of Indications associated
 * with studies.
 *
 * @author Chris Upkes
 */

public class StudyIndicationsSection extends Section {
    public StudyIndicationsSection(UUID id) {
        super(id, SectionType.STUDY_INDICATIONS);
    }

    public StudyIndicationsSection(UUID id, String tag) {
        super(id, SectionType.STUDY_INDICATIONS);
    }

    private List<StudyIndication> studyIndications = new ArrayList<>();


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

    public void addStudyIndication(StudyIndication studyIndication) {

        studyIndications.add(studyIndication);

    }
}
