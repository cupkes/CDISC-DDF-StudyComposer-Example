package org.CDISC.DDF.model.studyDesign;



import java.util.UUID;

/**
 * org.CDISC.DDF.model.studyDesign.TransitionEvent is used in by the PlannedWorkflow class
 * WorkflowItem collection.  It's designed to provide the branching and merging mechanism
 * for Transition objects in a doubly-linked list.  Transition and TransitionEvent lists represent
 * a workflow.
 *
 * @author Chris Upkes
 */

public class TransitionEvent extends WorkflowItem {

    protected TransitionEvent(UUID id, String description, PointInTime fromPointInTime, PointInTime toPointInTime) {
        super(id, description, fromPointInTime, toPointInTime);
    }

    /// what other properties and methods should an event have?
}
