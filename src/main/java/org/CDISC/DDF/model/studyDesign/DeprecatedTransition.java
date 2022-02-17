package org.CDISC.DDF.model.studyDesign;

import org.CDISC.DDF.model.common.Activity;
import org.CDISC.DDF.model.common.DeprecatedCriterion;
import org.CDISC.DDF.model.common.Rule;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.studyDesign.Transition is a transition of a subject in a planned workflow.
 *
 * @author Chris Upkes
 */


public class DeprecatedTransition extends DeprecatedWorkflowItem {

//    private final UUID id; -- now in super constructor
//    private final String description;
//    private final PointInTime fromPointInTime;
//    private final PointInTime toPointInTime;
    private Rule transitionRule;
    private String describedBy;
    private List<DeprecatedCriterion> transitionCriteria = new ArrayList<>();
    private Integer studyProtocolCriterionTransitionNumber;


    public DeprecatedTransition(UUID id,
                                String description,
                                PointInTime fromPointInTime,
                                PointInTime toPointInTime,
                                Rule transitionRule,
                                Activity activity) {
        super(id, description,fromPointInTime,toPointInTime, activity);
        this.transitionRule = transitionRule;
    }

    public DeprecatedTransition(UUID id,
                                String description,
                                PointInTime fromPointInTime,
                                PointInTime toPointInTime,
                                Activity activity) {
        super(id, description,fromPointInTime,toPointInTime, activity);
    }



//    public UUID getId() {
//        return id;
//    }
//
//    public PointInTime getFromPointInTime() {
//        return fromPointInTime;
//    }
//
//    public PointInTime getToPointInTime() {
//        return toPointInTime;
//    }

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

    public List<DeprecatedCriterion> getTransitionCriteria() {
        return transitionCriteria;
    }

    public void setTransitionCriteria(List<DeprecatedCriterion> transitionCriteria) {
        this.transitionCriteria = transitionCriteria;
    }

//    public String getDescription() {
//        return description;
//    }

    public Integer getStudyProtocolCriterionTransitionNumber() {
        return studyProtocolCriterionTransitionNumber;
    }

    public void setStudyProtocolCriterionTransitionNumber(Integer studyProtocolCriterionTransitionNumber) {
        this.studyProtocolCriterionTransitionNumber = studyProtocolCriterionTransitionNumber;
    }
}
