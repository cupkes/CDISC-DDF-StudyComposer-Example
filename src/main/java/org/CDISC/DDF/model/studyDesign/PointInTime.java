package org.CDISC.DDF.model.studyDesign;



import java.util.Date;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.studyDesign.PointInTime is a logical representation of a point in time.
 *
 * @author Chris Upkes
 */

// in the api this object is attached to a study.  I don't agree.  This should be attached to
// a transition in a workflow according to the mind-map.
// Studies have epochs which could be a subclass of PointInTime.

// P.S.  Why doesn't a PointInTime object point to a time variable?

// I am thoroughly confused about this concept.

public class PointInTime {

    private final UUID id;
    private final PointInTimeType type;
    //private final String subjectStatusGrouping;
    private final Date startDate;
    private final Date endDate;

    public PointInTime(UUID id, PointInTimeType type,Date startDate, Date endDate) {
        this.id = id;
        this.type = type;

        this.startDate = startDate;
        this.endDate = endDate;
    }


    public UUID getId() {
        return id;
    }

    public PointInTimeType getType() {
        return type;
    }



    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
