package org.CDISC.DDF.model.studyDesign;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class WorkflowItemMatrix {

    private final UUID id;
    private final List<ItemSequence> matrix;

    public WorkflowItemMatrix(UUID id) {
        this.id = id;
        matrix = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public List<ItemSequence> getMatrix() {
        return matrix;
    }

    public void addItemSequence(ItemSequence itemSequence){
        this.matrix.add(itemSequence);
    }

    public void removeItemSequence(ItemSequence itemSequence){
        this.matrix.remove(itemSequence);
    }
}
