package org.CDISC.DDF.model.studyDesign;

import org.CDISC.DDF.model.common.Criterion;
import org.CDISC.DDF.model.common.Rule;

import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.studyDesign.Transition is a transition of a subject in a planned workflow.
 *
 * @author Chris Upkes
 */


public class Transition {

    private final UUID id;
    private final String description;
    private final PointInTime fromPointInTime;
    private final PointInTime toPointInTime;
    private Rule transitionRule;
    private String describedBy;
    private List<Criterion> transitionCriteria;
    private Integer studyProtocolCriterionTransitionNumber;


    public Transition(UUID id, String description, PointInTime fromPointInTime, PointInTime toPointInTime, Rule transitionRule) {
        this.id = id;
        this.description = description;
        this.fromPointInTime = fromPointInTime;
        this.toPointInTime = toPointInTime;
        this.transitionRule = transitionRule;
    }

    public Transition(UUID id, String description, PointInTime fromPointInTime, PointInTime toPointInTime) {
        this.id = id;
        this.description = description;
        this.fromPointInTime = fromPointInTime;
        this.toPointInTime = toPointInTime;
    }



    public UUID getId() {
        return id;
    }

    public PointInTime getFromPointInTime() {
        return fromPointInTime;
    }

    public PointInTime getToPointInTime() {
        return toPointInTime;
    }

    public Rule getTransitionRule() {
        return transitionRule;
    }

    public void setTransitionRule(Rule transitionRule) {
        this.transitionRule = transitionRule;
    }

    public String getDescribedBy() {
        return describedBy;
    }

    public void setDescribedBy(String describedBy) {
        this.describedBy = describedBy;
    }

    public List<Criterion> getTransitionCriteria() {
        return transitionCriteria;
    }

    public void setTransitionCriteria(List<Criterion> transitionCriteria) {
        this.transitionCriteria = transitionCriteria;
    }

    public String getDescription() {
        return description;
    }

    public Integer getStudyProtocolCriterionTransitionNumber() {
        return studyProtocolCriterionTransitionNumber;
    }

    public void setStudyProtocolCriterionTransitionNumber(Integer studyProtocolCriterionTransitionNumber) {
        this.studyProtocolCriterionTransitionNumber = studyProtocolCriterionTransitionNumber;
    }
}
