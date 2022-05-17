package org.CDISC.DDF.composer.translator.openstudybuilder;

import java.util.UUID;

public class Code {

    private UUID termUid;
    private String name;

    public Code(UUID termUid, String name) {
        this.termUid = termUid;
        this.name = name;
    }

    public void setTermUid(UUID termUid) {
        this.termUid = termUid;
    }

    public void setName(String name) {
        this.name = name;
    }
}

