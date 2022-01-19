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


    // some SME's are using sponsor code with ref to orgCode.  Which one is right?
    // TO_DO:  Determine semantics for orgCode;

    // What exactly is a StudyIdentifier?    Is it a reference identifier with sponsor Ids or codes?
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
