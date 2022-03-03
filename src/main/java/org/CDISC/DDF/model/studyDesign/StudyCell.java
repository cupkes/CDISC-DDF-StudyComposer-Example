package org.CDISC.DDF.model.studyDesign;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.study.StudyCell is a partitioning of a study arm into individual pieces, which are
 * associated with an epoch and represent an implementation of
 * the purpose of its associated epoch.
 *
 * @author Nathan Smith
 */

public class StudyCell {

    private final UUID id;
    private final List<StudyElement> studyElements;
    private final StudyArm studyArm;
    private final StudyEpoch studyEpoch;


    public StudyCell(UUID id, List<StudyElement> studyElements, StudyArm studyArm, StudyEpoch studyEpoch) {
        this.id = id;
        this.studyElements = studyElements;
        this.studyArm = studyArm;
        this.studyEpoch = studyEpoch;
    }

    public UUID getId() {
        return id;
    }

    public List<StudyElement> getStudyElements() {
        return studyElements;
    }

    public StudyArm getStudyArm() {
        return studyArm;
    }

    public StudyEpoch getStudyEpoch() {
        return studyEpoch;
    }
}
