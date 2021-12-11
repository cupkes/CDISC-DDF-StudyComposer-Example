package org.CDISC.DDF.model.studyDesign;

import java.util.List;
import java.util.UUID;


/**
 * org.CDISC.DDF.model.studyDesign.PlannedWorkflow represents The operational aspect of an intended work procedure that may include
 * but is not limited to, how tasks are structured, who performs them, what their relative order is,
 * how they are synchronized, how information flows to support the tasks and how tasks are being tracked.
 *
 * @author Chris Upkes
 */

// we could make this just a workflow and use the planned interface.  I'm assuming that there is a reason for things
// being "planned".  We should figure this out.

public class PlannedWorkflow {

    private final UUID id;
    private String description;
    private final PointInTime startPoint;
    private final PointInTime endPoint;
    private List<Transition> transitions;


    public PlannedWorkflow(UUID id, String description, PointInTime startPoint, PointInTime endPoint, List<Transition> transitions){

        this.id = id;
        this.description = description;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.transitions = transitions;
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PointInTime getStartPoint() {
        return startPoint;
    }

    public PointInTime getEndPoint() {
        return endPoint;
    }

    public List<Transition> getTransitions() {
        return transitions;
    }

    public void setTransitions(List<Transition> transitions) {
        this.transitions = transitions;
    }

    public void addTransition(Transition transition){
        // TO_DO implement;
    }

    public void removeTransition(Transition transition){
        // TO_DO implement;
    }
}
