package org.CDISC.DDF.model.study;

import org.CDISC.DDF.model.common.Amendment;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.study.Protocol is a class representing a protocol for a clinical trial.
 *
 * The actual protocol is a document that describes the objective(s), design, methodology, statistical considerations, and organization of a trial.
 * The protocol usually also gives the background and rationale for the trial, but these could be provided in other protocol
 * referenced documents. Throughout the ICH GCP Guideline the term protocol refers to protocol and protocol amendments.
 * NOTE: Present usage can refer to any of three distinct entities: 1) the plan (i.e., content) of a protocol, 2)
 * the protocol document, and 3) a series of tests or treatments (as in oncology)
 *
 * @author Chris Upkes
 */

public class StudyProtocol {

    private final UUID protocolId;
    private String briefTitle;
    private String officialTitle;
    private String publicTitle;
    private String version;
    private String scientificTitle;

    private List<Amendment> amendments = new ArrayList<>();
    private List<String> sections = new ArrayList<>();



    public StudyProtocol(UUID protocolId) {
        this.protocolId = protocolId;
    }

    public UUID getProtocolId() {
        return protocolId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBriefTitle() {
        return briefTitle;
    }

    public void setBriefTitle(String briefTitle) {
        this.briefTitle = briefTitle;
    }

    public String getOfficialTitle() {
        return officialTitle;
    }

    public void setOfficialTitle(String officialTitle) {
        this.officialTitle = officialTitle;
    }

    public String getPublicTitle() {
        return publicTitle;
    }

    public void setPublicTitle(String publicTitle) {
        this.publicTitle = publicTitle;
    }

    public List<Amendment> getAmendments() {
        return amendments;
    }

    public void setAmendments(List<Amendment> amendments) {
        this.amendments = amendments;
    }

    public List<String> getSections() {
        return sections;
    }

    public void setSections(List<String> sections) {
        this.sections = sections;
    }

    public void addSection(String sectionName) {
        this.sections.add(sectionName);
    }

    public void removeSection(String sectionName) {
        this.sections.remove(sectionName);
    }

    public void addAmendment(Amendment amendment) {
        this.amendments.add((amendment));
    }


    public String getScientificTitle() {
        return scientificTitle;
    }

    public void setScientificTitle(String scientificTitle) {
        this.scientificTitle = scientificTitle;
    }


}
