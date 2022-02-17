package org.CDISC.DDF.model.studyDesign;

import java.util.ArrayList;
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
    private List<List<DeprecatedWorkflowItem>> itemMatrix = new ArrayList<>();


    public PlannedWorkflow(UUID id, String description, PointInTime startPoint, PointInTime endPoint){

        this.id = id;
        this.description = description;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
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


    public List<List<DeprecatedWorkflowItem>> getItemMatrix() {
        return itemMatrix;
    }

    public void setItemMatrix(List<List<DeprecatedWorkflowItem>> itemMatrix) {
        this.itemMatrix = itemMatrix;
    }

    public void addItemList(List<DeprecatedWorkflowItem> deprecatedWorkflowItems) {
        //TODO:  implement
    }

    public void removeItemList(List<DeprecatedWorkflowItem> deprecatedWorkflowItems) {
        //TODO: implement
    }

    public void addItem(DeprecatedWorkflowItem deprecatedWorkflowItem) {
        //TODO: implement
    }

    public void removeItem(DeprecatedWorkflowItem deprecatedWorkflowItem) {
        //TODO: implement
    }
}
