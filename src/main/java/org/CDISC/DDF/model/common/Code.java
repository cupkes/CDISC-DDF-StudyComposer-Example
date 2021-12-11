package org.CDISC.DDF.model.common;

/**
 * org.CDISC.DDF.model.common.OutcomeLevel.Code is a class that provides coding details for use by other classes.
 *
 * @author Chris Upkes
 */
public class Code {

    private final String code;
    private final String codeSystem;
    private final String codeSystemVersion;
    private final String decode;


    public Code(String code, String codeSystem, String codeSystemVersion, String decode) {
        this.code = code;
        this.codeSystem = codeSystem;
        this.codeSystemVersion = codeSystemVersion;
        this.decode = decode;
    }


    public String getCode() {
        return code;
    }

    public String getCodeSystem() {
        return codeSystem;
    }

    public String getCodeSystemVersion() {
        return codeSystemVersion;
    }

    public String getDecode() {
        return decode;
    }

}
