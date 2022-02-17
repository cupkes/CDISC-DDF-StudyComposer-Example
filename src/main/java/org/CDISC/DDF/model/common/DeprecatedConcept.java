package org.CDISC.DDF.model.common;

import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.Concept is a class that provides usable wrapper for biomedical semantics
 * that need to be associated with study data.
 *
 * @author Chris Upkes
 */
public class DeprecatedConcept {


    private UUID id;
    private String definition;
    private DeprecatedConceptType type;
    private UsageRule usageRule;
    private List<String> attributes;


    public DeprecatedConcept(UUID id, String definition, DeprecatedConceptType type, UsageRule usageRule) {
        this.id = id;
        this.definition = definition;
        this.type = type;
        this.usageRule = usageRule;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public DeprecatedConceptType getType() {
        return type;
    }

    public void setType(DeprecatedConceptType type) {
        this.type = type;
    }

    public UsageRule getUsageRule() {
        return usageRule;
    }

    public void setUsageRule(UsageRule usageRule) {
        this.usageRule = usageRule;
    }


}
