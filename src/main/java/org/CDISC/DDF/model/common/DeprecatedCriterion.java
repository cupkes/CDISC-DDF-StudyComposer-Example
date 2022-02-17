package org.CDISC.DDF.model.common;

import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.Criterion is a class used to provide attribution to transition events.
 *
 * @author Chris Upkes
 */

/* in this implementation, as an interpretation of the mind-map, we are separating the concepts of a
"rule" and a "criterion".  This may not be correct.  Rules have already been defined in previous sections
and implemented in previous sprints and have been blessed by the reasoning that
there have been no objections.  Rules, as we have defined them up to now are simply associations to a
time window and coding.  Criteria have many more attributes and are therefore more specific than rules.
In this model, transitions have rules and criteria.  We may decide that criteria extend rules.  We need
to think about this.
 */
public class DeprecatedCriterion {

    private UUID id;
    private DeprecatedCriterionType type;
    private String description;
    private List<UUID> specificationIds;
    private String domain;
    private String dictionary;
    private String testName;
    private Float numericMinValue;
    private Float numericMinValueInclusive;
    private Float numericMaxValue;
    private Float numericMaxValueInclusive;
    private String valueUnit;
    private String textualResult;
    // not sure if these timing variables need strict typing.  Being loose here with strings.
    // this would be bad if they are the result of free-form data entry.
    private String timing;
    private String timingDetail;
    private String timingGap;
    private Integer timingDays;
    private String route;

    public DeprecatedCriterion(UUID id, DeprecatedCriterionType type, String description) {
        this.id = id;
        this.type = type;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public DeprecatedCriterionType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }


    public List<UUID> getSpecificationIds() {
        return specificationIds;
    }

    public void setSpecificationIds(List<UUID> specificationIds) {
        this.specificationIds = specificationIds;
    }

    public void addSpecificationId(UUID specifictionId) {
        // TO_DO implement
    }

    public void removeSpecificationId(UUID specificationId) {
        // TO_DO implement
    }


    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDictionary() {
        return dictionary;
    }

    public void setDictionary(String dictionary) {
        this.dictionary = dictionary;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Float getNumericMinValue() {
        return numericMinValue;
    }

    public void setNumericMinValue(Float numericMinValue) {
        this.numericMinValue = numericMinValue;
    }

    public Float getNumericMinValueInclusive() {
        return numericMinValueInclusive;
    }

    public void setNumericMinValueInclusive(Float numericMinValueInclusive) {
        this.numericMinValueInclusive = numericMinValueInclusive;
    }

    public Float getNumericMaxValue() {
        return numericMaxValue;
    }

    public void setNumericMaxValue(Float numericMaxValue) {
        this.numericMaxValue = numericMaxValue;
    }

    public Float getNumericaMaxValueInclusive() {
        return numericMaxValueInclusive;
    }

    public void setNumericaMaxValueInclusive(Float numericaMaxValueInclusive) {
        this.numericMaxValueInclusive = numericaMaxValueInclusive;
    }

    public String getValueUnit() {
        return valueUnit;
    }

    public void setValueUnit(String valueUnit) {
        this.valueUnit = valueUnit;
    }

    public String getTextualResult() {
        return textualResult;
    }

    public void setTextualResult(String textualResult) {
        this.textualResult = textualResult;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getTimingDetail() {
        return timingDetail;
    }

    public void setTimingDetail(String timingDetail) {
        this.timingDetail = timingDetail;
    }

    public String getTimingGap() {
        return timingGap;
    }

    public void setTimingGap(String timingGap) {
        this.timingGap = timingGap;
    }

    public Integer getTimingDays() {
        return timingDays;
    }

    public void setTimingDays(Integer timingDays) {
        this.timingDays = timingDays;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public List<Object> getCriterionDetails(){
        //TO_DO implement
        return null;
    }

}
