package org.CDISC.DDF.model.study;

/**
 * org.CDISC.DDF.model.study.IdentifierType is used by the StudyIdentifier class.
 *
 * @author Chris Upkes
 */

public class IdentifierType {

    private final String code;
    private final String name;


    public IdentifierType(String code, String name) {
        this.code = code;
        this.name = name;
    }


    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }


}
