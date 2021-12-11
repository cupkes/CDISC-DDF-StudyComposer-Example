package org.CDISC.DDF.model.studyDesign;

import org.CDISC.DDF.model.common.Rule;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.studyDesign.StudyElement is TA basic building block for time within a clinical study
 * comprising the following characteristics: a description of what happens to the subject during the element;
 * a definition of the start of the element; a rule for ending the element.
 *
 * @author Chris Upkes
 */

public class StudyElement {

    private final UUID id;
    private final String name;
    private final String description;
    private final Rule startRule;
    private final Rule endRule;


    public StudyElement(UUID id, String name, String description, Rule startRule, Rule endRule) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startRule = startRule;
        this.endRule = endRule;
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

    public Rule getStartRule() {
        return startRule;
    }

    public Rule getEndRule() {
        return endRule;
    }
}
