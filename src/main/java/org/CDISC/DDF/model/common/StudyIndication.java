package org.CDISC.DDF.model.common;

import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.StudyIndication is the condition, disease or disorder that the clinical trial is intended to investigate or address.
 *
 * @author Chris Upkes
 */

public class StudyIndication {

    private final UUID id;
    private final String description;

    private List<Code> coding;


    public StudyIndication(UUID id, String description) {
        this.id = id;
        this.description = description;
    }


    public UUID getId() {
        return id;
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

    public void addCode(Code code) {

        // TO_DO
    }

    public void removeCode(Code code){

        // TO_DO
    }
}
