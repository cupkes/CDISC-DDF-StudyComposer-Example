package org.CDISC.DDF.composer.engine;

import java.util.Map;

public class IdentificationMetadata  {



    private String studyNumber;
    private String studyAcronym;
    private String projectNumber;
    private String projectName;
    private String brandName;
    private String clinicalProgrammeName;
    private String studyId;
    private Map<String, String> registryIdentifiers;


    public IdentificationMetadata(String studyNumber, String studyAcronym, String projectNumber, String projectName, String brandName, String clinicalProgrammeName, String studyId, Map<String, String> registryIdentifiers) {
        this.studyNumber = studyNumber;
        this.studyAcronym = studyAcronym;
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.brandName = brandName;
        this.clinicalProgrammeName = clinicalProgrammeName;
        this.studyId = studyId;
        this.registryIdentifiers = registryIdentifiers;
    }

    public IdentificationMetadata() {

    }


    public String getStudyNumber() {
        return studyNumber;
    }

    public void setStudyNumber(String studyNumber) {
        this.studyNumber = studyNumber;
    }

    public String getStudyAcronym() {
        return studyAcronym;
    }

    public void setStudyAcronym(String studyAcronym) {
        this.studyAcronym = studyAcronym;
    }

    public String getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getClinicalProgrammeName() {
        return clinicalProgrammeName;
    }

    public void setClinicalProgrammeName(String clinicalProgrammeName) {
        this.clinicalProgrammeName = clinicalProgrammeName;
    }

    public String getStudyId() {
        return studyId;
    }

    public void setStudyId(String studyId) {
        this.studyId = studyId;
    }

    public Map<String, String> getRegistryIdentifiers() {
        return registryIdentifiers;
    }

    public void setRegistryIdentifiers(Map<String, String> registryIdentifiers) {
        this.registryIdentifiers = registryIdentifiers;
    }
}
