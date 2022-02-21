package org.CDISC.DDF.model.studyDesign;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class WorkflowItemMatrix {

    private final UUID id;
    private final List<List<WorkflowItem>> matrix = new ArrayList<>();


    public WorkflowItemMatrix(UUID id) {
        this.id = id;
    }

    public List<List<WorkflowItem>> getWorkFlows() {
        return matrix;
    }

    public void addItemList(List<WorkflowItem> workflowItems) {
        this.matrix.add(workflowItems);
    }

    public void removeItemList(List<WorkflowItem> workflowItems) {
        this.matrix.remove(workflowItems);
    }

    public void removeItemList(int index) {
        this.matrix.remove(index);
    }

    List<WorkflowItem> getItemList(int index){
        return this.matrix.get(index);
    }

    public WorkflowItem getWorkflowItem(int rowIndex, int columnIndex) {
       List<WorkflowItem> row = this.matrix.get(rowIndex);
       return row.get(columnIndex);
    }

    public void removeWorkflowItem(WorkflowItem workflowItem) {
        //TO_DO: Implement
    }


    public UUID getId() {
        return id;
    }
}
