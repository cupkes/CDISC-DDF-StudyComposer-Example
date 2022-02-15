package org.CDISC.DDF.model.study;

import java.util.UUID;

public class StudyProtocolReference {

    private final UUID studyProtocolId;
    private final String studyProtocolVersion;


    public StudyProtocolReference(UUID studyProtocolId, String studyProtocolVersion) {
        this.studyProtocolId = studyProtocolId;
        this.studyProtocolVersion = studyProtocolVersion;
    }

    public UUID getStudyProtocolId() {
        return studyProtocolId;
    }

    public String getStudyProtocolVersion() {
        return studyProtocolVersion;
    }


}
