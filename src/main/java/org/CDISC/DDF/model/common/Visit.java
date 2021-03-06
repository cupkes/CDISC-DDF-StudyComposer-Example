package org.CDISC.DDF.model.common;

import org.CDISC.DDF.model.studyDesign.StudyEpoch;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.Visit is a subclass of encounter;
 *
 * @author Chris Upkes
 */

public class Visit extends Encounter {

    private final ContactMode contactMode;
    private final EnvironmentalSetting environmentalSetting;
    //private final WorkflowItem workflowItem;


    public Visit(UUID id, String name, String description, Rule startRule, Rule endRule, ContactMode contactMode, EnvironmentalSetting environmentalSetting) {
        super(id, name, description, startRule, endRule);
        this.contactMode = contactMode;
        this.environmentalSetting = environmentalSetting;
       // this.workflowItem = workflowItem;
    }

    public Visit(UUID id, String name, String description, Rule startRule, Rule endRule, ContactMode contactMode, EnvironmentalSetting environmentalSetting, StudyEpoch epoch) {
        super(id, name, description, startRule, endRule, epoch);
        this.contactMode = contactMode;
        this.environmentalSetting = environmentalSetting;
        // this.workflowItem = workflowItem;
    }


    public ContactMode getContactMode() {
        return contactMode;
    }

    public EnvironmentalSetting getEnvironmentalSetting() {
        return environmentalSetting;
    }

    //public WorkflowItem getWorkflowItem() {
    //  return workflowItem;
    //}
}
