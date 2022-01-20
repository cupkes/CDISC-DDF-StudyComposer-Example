package org.CDISC.DDF.model.study;

import org.CDISC.DDF.model.common.Code;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class IntercurrentEvent {

    // I am assuming this is something unplanned and captured during the trial.



    private final UUID id;
    private final String name;
    private final String description;
    private List<Code> coding = new ArrayList<>();

    public IntercurrentEvent(UUID id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Code> getCoding() {
        return coding;
    }

    public void setCoding(List<Code> coding) {
        this.coding = coding;
    }

    public void addCode(Code code){
        this.coding.add(code);
    }

    public void removeCode(Code code){
        this.coding.remove(code);
    }


}
