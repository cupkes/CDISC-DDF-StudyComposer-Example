package org.CDISC.DDF.model.studyDesign;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ItemSequence {


    private List<WorkflowItem> items = new ArrayList<>();
    private UUID id;

    public ItemSequence(UUID id) {
        this.id = id;
    }

    public ItemSequence(UUID id, WorkflowItem workflowItem) {
        this.id = id;
        this.items.add(workflowItem);

    }

    public ItemSequence(UUID id, List<WorkflowItem> workflowItems) {
        this.id = id;
        this.items = workflowItems;

    }

    public UUID getId() {
        return id;
    }

    public List<WorkflowItem> getItems(){
        return this.items;
    }

    public void addItem(WorkflowItem workflowItem){
        this.items.add(workflowItem);
    }

    public void removeItem(WorkflowItem workflowItem){
        this.items.remove(workflowItem);
    }


}
