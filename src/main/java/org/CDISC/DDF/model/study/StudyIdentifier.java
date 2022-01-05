package org.CDISC.DDF.model.study;

import org.CDISC.DDF.model.common.Code;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.study.StudyIdentifier is a sequence of characters used to identify, name, or characterize the study..
 *
 * @author Chris Upkes
 */


public class StudyIdentifier {

    private final UUID id;



    private final String orgCode;
    private final String name;
    private final IdentifierType idType;



    public StudyIdentifier(UUID id,String orgCode, String name, IdentifierType idType) {
        this.id = id;
        this.orgCode = orgCode;
        this.name = name;
        this.idType = idType;

    }


    public UUID getId() {
        return id;
    }

    public IdentifierType getIdType() {
        return idType;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public String getName() {
        return name;
    }





}
