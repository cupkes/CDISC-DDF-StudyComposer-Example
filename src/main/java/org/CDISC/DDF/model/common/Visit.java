package org.CDISC.DDF.model.common;

import org.CDISC.DDF.model.studyDesign.WorkflowItem;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.Visit is a subclass of encounter;
 *
 * @author Chris Upkes
 */

public class Visit extends Encounter {

    private final ContactMode contactMode;
    private final EnvironmentalSetting environmentalSetting;
    private final WorkflowItem workflowItem;


    protected Visit(UUID id, String name, String description, Rule startRule, Rule endRule, ContactMode contactMode, EnvironmentalSetting environmentalSetting, WorkflowItem workflowItem) {
        super(id, name, description, startRule, endRule);
        this.contactMode = contactMode;
        this.environmentalSetting = environmentalSetting;
        this.workflowItem = workflowItem;
    }


    public ContactMode getContactMode() {
        return contactMode;
    }

    public EnvironmentalSetting getEnvironmentalSetting() {
        return environmentalSetting;
    }

    public WorkflowItem getWorkflowItem() {
        return workflowItem;
    }
}
