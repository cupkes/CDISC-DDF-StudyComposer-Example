package org.CDISC.DDF.model.studyDesign;



import org.CDISC.DDF.model.common.Activity;
import org.CDISC.DDF.model.common.Visit;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.studyDesign.WorkflowItem is an abstract class used to provide
 * the PlannedWorkflow object a linked-list that contains both Transitions and
 * TransitionEvents.
 *
 * @author Chris Upkes
 */

public abstract class WorkflowItem {

    private final UUID id;
    private final String description;
    private final PointInTime fromPointInTime;
    private final PointInTime toPointInTime;
    private final Activity activity;
    private Visit visit;


    private List<UUID> previousItems = new ArrayList<>();
    private List<UUID> nextItems = new ArrayList<>();

// TO_DO:  remove point in time constructor values.

    // WorklfowItem objects are now for sequencing.
    protected WorkflowItem(UUID id, String description, PointInTime fromPointInTime, PointInTime toPointInTime, Activity activity) {

        this.id = id;
        this.description = description;
        this.fromPointInTime = fromPointInTime;
        this.toPointInTime = toPointInTime;
        this.activity = activity;
    }


    public List<UUID> getPreviousItems() {
        return previousItems;
    }

    public void setPreviousItems(List<UUID> previousItems) {
        this.previousItems = previousItems;
    }

    public List<UUID> getNextItems() {
        return nextItems;
    }

    public void setNextItems(List<UUID> nextItems) {
        this.nextItems = nextItems;
    }

    public void removeItem(UUID item, WorkflowItemType workflowItemType) {
        if (workflowItemType == WorkflowItemType.NEXT) {
            this.nextItems.remove(item);
        } else if (workflowItemType == WorkflowItemType.PREVIOUS) {
            this.previousItems.remove(item);
        }
    }

    public void addItem(UUID item, WorkflowItemType workflowItemType) {

        if (workflowItemType == WorkflowItemType.NEXT) {
            this.nextItems.add(item);
        } else if (workflowItemType == WorkflowItemType.PREVIOUS) {
            this.previousItems.add(item);
        }


    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public PointInTime getFromPointInTime() {
        return fromPointInTime;
    }

    public PointInTime getToPointInTime() {
        return toPointInTime;
    }

    public Activity getActivity() {
        return activity;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }
}
