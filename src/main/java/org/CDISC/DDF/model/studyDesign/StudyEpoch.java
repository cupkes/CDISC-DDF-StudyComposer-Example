package org.CDISC.DDF.model.studyDesign;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.studyDesign.StudyEpoch is A named time period defined in the protocol,
 * wherein a study activity is specified and unchanging throughout the interval, to support a study-specific purpose.
 *
 * @author Chris Upkes
 */

public class StudyEpoch {

    private final UUID id;
    private final EpochType epochType;
    private final String name;
    private final String description;
    private final int sequenceInStudy;


    public StudyEpoch(UUID id, EpochType epochType, String name, String description, int sequenceInStudy) {
        this.id = id;
        this.epochType = epochType;
        this.name = name;
        this.description = description;
        this.sequenceInStudy = sequenceInStudy;
    }


    public UUID getId() {
        return id;
    }

    public EpochType getEpochType() {
        return epochType;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getSequenceInStudy() {
        return sequenceInStudy;
    }
}
