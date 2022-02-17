package org.CDISC.DDF.model.studyDesign;



import org.CDISC.DDF.model.common.Activity;
import org.CDISC.DDF.model.common.Encounter;

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

public abstract class DeprecatedWorkflowItem {

    private final UUID id;
    private final String description;
    private final PointInTime fromPointInTime;
    private final PointInTime toPointInTime;
    private final Activity activity;
    private Encounter encounter;

    private List<UUID> previousItemsInSequence = new ArrayList<>();
    private List<UUID> nextItemsInSequence = new ArrayList<>();

// TO_DO:  remove point in time constructor values.

    // WorklfowItem objects are now for sequencing.
    protected DeprecatedWorkflowItem(UUID id, String description, PointInTime fromPointInTime, PointInTime toPointInTime, Activity activity) {

        this.id = id;
        this.description = description;
        this.fromPointInTime = fromPointInTime;
        this.toPointInTime = toPointInTime;
        this.activity = activity;
    }


    public List<UUID> getPreviousItems() {
        return previousItemsInSequence;
    }

    public void setPreviousItems(List<UUID> previousItems) {
        this.previousItemsInSequence = previousItems;
    }

    public List<UUID> getNextItems() {
        return nextItemsInSequence;
    }

    public void setNextItems(List<UUID> nextItems) {
        this.nextItemsInSequence = nextItems;
    }

    public void removeItem(UUID item, DeprecatedWorkflowItemType deprecatedWorkflowItemType) {
        if (deprecatedWorkflowItemType == DeprecatedWorkflowItemType.NEXT) {
            this.nextItemsInSequence.remove(item);
        } else if (deprecatedWorkflowItemType == DeprecatedWorkflowItemType.PREVIOUS) {
            this.previousItemsInSequence.remove(item);
        }
    }

    public void addItem(UUID item, DeprecatedWorkflowItemType deprecatedWorkflowItemType) {

        if (deprecatedWorkflowItemType == DeprecatedWorkflowItemType.NEXT) {
            this.nextItemsInSequence.add(item);
        } else if (deprecatedWorkflowItemType == DeprecatedWorkflowItemType.PREVIOUS) {
            this.previousItemsInSequence.add(item);
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

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }
}
