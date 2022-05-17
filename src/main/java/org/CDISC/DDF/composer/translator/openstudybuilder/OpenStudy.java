package org.CDISC.DDF.composer.translator.openstudybuilder;

import org.CDISC.DDF.composer.engine.CurrentMetadata;

public class OpenStudy {

    private String uid;
    private String studyNumber;
    private String studyId;
    private String studyAcronym;
    private String projectNumber;
    private String studyStatus;
    private CurrentMetadata currentMetadata;



    public OpenStudy(String uid, String studyNumber, String studyId, String studyAcronym, String projectNumber, String studyStatus, CurrentMetadata currentMetadata) {
        this.uid = uid;
        this.studyNumber = studyNumber;
        this.studyId = studyId;
        this.studyAcronym = studyAcronym;
        this.projectNumber = projectNumber;
        this.studyStatus = studyStatus;

        this.currentMetadata = currentMetadata;
    }

    public OpenStudy() {

    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getStudyNumber() {
        return studyNumber;
    }

    public void setStudyNumber(String studyNumber) {
        this.studyNumber = studyNumber;
    }

    public String getStudyId() {
        return studyId;
    }

    public void setStudyId(String studyId) {
        this.studyId = studyId;
    }

    public String getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getStudyStatus() {
        return studyStatus;
    }

    public void setStudyStatus(String studyStatus) {
        this.studyStatus = studyStatus;
    }

    public String getStudyAcronym() {
        return studyAcronym;
    }

    public void setStudyAcronym(String studyAcronym) {
        this.studyAcronym = studyAcronym;
    }

    public CurrentMetadata getCurrentMetadata() {
        return currentMetadata;
    }

    public void setCurrentMetadata(CurrentMetadata currentMetadata) {
        this.currentMetadata = currentMetadata;
    }
}

