package org.CDISC.DDF.model.studyDesign;

import org.CDISC.DDF.model.common.Activity;
import org.CDISC.DDF.model.common.Encounter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.studyDesign.WorkflowItem is an class used to provide
 * the PlannedWorkflow object a linked-list provides sequencing of activities and
 * encounters in study arms.
 *
 * @author Chris Upkes
 */

public class WorkflowItem {

    private final UUID id;
    private final String description;
    private final PointInTime fromPointInTime;
    private final PointInTime toPointInTime;
    private final Activity activity;
    private Encounter encounter;

    private List<UUID> previousItemsInSequence = new ArrayList<>();
    private List<UUID> nextItemsInSequence = new ArrayList<>();

    public WorkflowItem(UUID id, String description, PointInTime fromPointInTime, PointInTime toPointInTime, Activity activity) {

        this.id = id;
        this.description = description;
        this.fromPointInTime = fromPointInTime;
        this.toPointInTime = toPointInTime;
        this.activity = activity;
    }

    public WorkflowItem(UUID id, String description, PointInTime fromPointInTime, PointInTime toPointInTime, Activity activity, Encounter encounter) {

        this.id = id;
        this.description = description;
        this.fromPointInTime = fromPointInTime;
        this.toPointInTime = toPointInTime;
        this.activity = activity;
        this.encounter = encounter;
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

    public List<UUID> getPreviousItemsInSequence() {
        return previousItemsInSequence;
    }

    public void setPreviousItemsInSequence(List<UUID> previousItemsInSequence) {
        this.previousItemsInSequence = previousItemsInSequence;
    }

    public List<UUID> getNextItemsInSequence() {
        return nextItemsInSequence;
    }

    public void setNextItemsInSequence(List<UUID> nextItemsInSequence) {
        this.nextItemsInSequence = nextItemsInSequence;
    }
}
