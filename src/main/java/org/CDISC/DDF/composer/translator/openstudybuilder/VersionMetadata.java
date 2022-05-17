package org.CDISC.DDF.composer.translator.openstudybuilder;

public class VersionMetadata{

    private String studyStatus;
    private String lockedVersionNumber;
    private String versionTimestamp;
    private String lockedVersionAuthor;
    private String lockedVersionInfo;

    public VersionMetadata(String studyStatus, String lockedVersionNumber, String versionTimestamp, String lockedVersionAuthor, String lockedVersionInfo) {
        this.studyStatus = studyStatus;
        this.lockedVersionNumber = lockedVersionNumber;
        this.versionTimestamp = versionTimestamp;
        this.lockedVersionAuthor = lockedVersionAuthor;
        this.lockedVersionInfo = lockedVersionInfo;
    }

    public VersionMetadata() {

    }

    public String getStudyStatus() {
        return studyStatus;
    }

    public void setStudyStatus(String studyStatus) {
        this.studyStatus = studyStatus;
    }

    public String getLockedVersionNumber() {
        return lockedVersionNumber;
    }

    public void setLockedVersionNumber(String lockedVersionNumber) {
        this.lockedVersionNumber = lockedVersionNumber;
    }

    public String getVersionTimestamp() {
        return versionTimestamp;
    }

    public void setVersionTimestamp(String versionTimestamp) {
        this.versionTimestamp = versionTimestamp;
    }

    public String getLockedVersionAuthor() {
        return lockedVersionAuthor;
    }

    public void setLockedVersionAuthor(String lockedVersionAuthor) {
        this.lockedVersionAuthor = lockedVersionAuthor;
    }

    public String getLockedVersionInfo() {
        return lockedVersionInfo;
    }

    public void setLockedVersionInfo(String lockedVersionInfo) {
        this.lockedVersionInfo = lockedVersionInfo;
    }
}
