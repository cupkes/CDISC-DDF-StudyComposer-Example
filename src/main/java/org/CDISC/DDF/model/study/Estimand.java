package org.CDISC.DDF.model.study;

import java.util.List;
import java.util.UUID;

public class Estimand {




    private final UUID id;
    private final Population popluation;
    private final String summaryMeasure;
    private List<IntercurrentEvent> eventsOfInterest;




    public Estimand(UUID id, Population popluation, String summaryMeasure) {
        this.id = id;
        this.popluation = popluation;
        this.summaryMeasure = summaryMeasure;
    }

    public UUID getId() {
        return id;
    }

    public Population getPopluation() {
        return popluation;
    }

    public String getSummaryMeasure() {
        return summaryMeasure;
    }

    public List<IntercurrentEvent> getEventsOfInterest() {
        return eventsOfInterest;
    }

    public void setEventsOfInterest(List<IntercurrentEvent> eventsOfInterest) {
        this.eventsOfInterest = eventsOfInterest;
    }


}
