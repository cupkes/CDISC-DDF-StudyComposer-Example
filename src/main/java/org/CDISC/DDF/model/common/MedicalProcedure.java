package org.CDISC.DDF.model.common;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.MedicalProcedure is a subclass of Procedure.
 *
 * @author Chris Upkes
 */


public class MedicalProcedure extends Procedure{



    private String procedureCode;

    public MedicalProcedure(UUID id) {
        super(id);
    }

    public String getProcedureCode() {
        return procedureCode;
    }

    public void setProcedureCode(String procedureCode) {
        this.procedureCode = procedureCode;
    }
}
