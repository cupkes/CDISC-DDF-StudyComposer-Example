package org.CDISC.DDF.model.study;

import java.util.UUID;

public class IntercurrentEvent {

    // I am assuming this is something unplanned and captured during the trial.

    private final UUID id;

    public IntercurrentEvent(UUID id) {
        this.id = id;
    }
}
