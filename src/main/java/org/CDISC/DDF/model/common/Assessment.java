package org.CDISC.DDF.model.common;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.Assessment is a measurement, examination, or evaluation of the subject that is anticipated to be performed
 * or observed according to the study protocol, or was performed or observed during the execution of the study.
 *
 * @author Chris Upkes
 */

public class Assessment extends StudyData {

    private final UUID id;
    private final String name;
    private final String description;
    private final AssessmentType mainAssessmentType;
    private final AssessmentDataType expectedDataType;
    private final String expectedUnits;

    public Assessment(UUID id, UUID collectionEventId, String name, String description, AssessmentType mainAssessmentType, AssessmentDataType expectedDataType, String expectedUnits) {
        super(id,collectionEventId);
        this.id = id;
        this.name = name;
        this.description = description;
        this.mainAssessmentType = mainAssessmentType;
        this.expectedDataType = expectedDataType;
        this.expectedUnits = expectedUnits;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public AssessmentType getMainAssessmentType() {
        return mainAssessmentType;
    }

    public AssessmentDataType getExpectedDataType() {
        return expectedDataType;
    }

    public String getExpectedUnits() {
        return expectedUnits;
    }
}
