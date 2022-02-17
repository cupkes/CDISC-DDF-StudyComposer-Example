package org.CDISC.DDF.model.studyDesign;



import org.CDISC.DDF.model.common.Activity;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.studyDesign.TransitionEvent is used in by the PlannedWorkflow class
 * WorkflowItem collection.  It's designed to provide the branching and merging mechanism
 * for Transition objects in a doubly-linked list.  Transition and TransitionEvent lists represent
 * a workflow.
 *
 * @author Chris Upkes
 */

public class DeprecatedTransitionEvent extends DeprecatedWorkflowItem {

    protected DeprecatedTransitionEvent(UUID id, String description, PointInTime fromPointInTime, PointInTime toPointInTime, Activity activity) {
        super(id, description, fromPointInTime, toPointInTime, activity);
    }

    /// what other properties and methods should an event have?
}
