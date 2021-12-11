package org.CDISC.DDF.model.study;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.study.StudyIdentifier is a sequence of characters used to identify, name, or characterize the study..
 *
 * @author Chris Upkes
 */


public class StudyIdentifier {

    private final UUID id;
    private final IdentifierType idType;
    private String organizationOID;


    public StudyIdentifier(UUID id, IdentifierType idType) {
        this.id = id;
        this.idType = idType;
    }


    public UUID getId() {
        return id;
    }

    public IdentifierType getIdType() {
        return idType;
    }


    public String getOrganizationOID() {
        return organizationOID;
    }

    public void setOrganizationOID(String oid) {
        this.organizationOID = oid;
    }





}
