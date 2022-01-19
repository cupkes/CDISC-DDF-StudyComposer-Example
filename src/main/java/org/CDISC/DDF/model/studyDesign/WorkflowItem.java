package org.CDISC.DDF.model.studyDesign;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class WorkflowItem {

    private final UUID id;
    private final String description;
    private final PointInTime fromPointInTime;
    private final PointInTime toPointInTime;


    private List<UUID> previousItems = new ArrayList<>();
    private List<UUID> nextItems = new ArrayList<>();


    protected WorkflowItem(UUID id, String description, PointInTime fromPointInTime, PointInTime toPointInTime) {

        this.id = id;
        this.description = description;
        this.fromPointInTime = fromPointInTime;
        this.toPointInTime = toPointInTime;
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
}
