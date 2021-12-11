package org.CDISC.DDF.model.studyDesign;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.study.Arm is a class representing a study arm in a clinical trial design into which subjects can be randomized.
 *
 * @author Nathan Smith
 */

public class StudyArm {

    private final String description;
    private final UUID id;
    private final StudyArmType studyArmType;
    private final OriginType studyOriginType;
    private final StudyArmOrigin studyArmOrigin;
    private final String name;

    public StudyArm(String description, UUID id, StudyArmType studyArmType, OriginType studyOriginType, StudyArmOrigin studyArmOrigin, String name) {
        this.description = description;
        this.id = id;
        this.studyArmType = studyArmType;
        this.studyOriginType = studyOriginType;
        this.studyArmOrigin = studyArmOrigin;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public StudyArmType getStudyArmType() {
        return studyArmType;
    }

    public OriginType getStudyOriginType() {
        return studyOriginType;
    }

    public StudyArmOrigin getStudyArmOrigin() {
        return studyArmOrigin;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
