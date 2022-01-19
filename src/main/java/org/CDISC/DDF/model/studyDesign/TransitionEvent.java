package org.CDISC.DDF.model.studyDesign;

import java.util.UUID;

public class TransitionEvent extends WorkflowItem {

    protected TransitionEvent(UUID id, String description, PointInTime fromPointInTime, PointInTime toPointInTime) {
        super(id, description, fromPointInTime, toPointInTime);
    }

    /// what other properties and methods should an event have?
}
