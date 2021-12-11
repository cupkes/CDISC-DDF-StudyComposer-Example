package org.CDISC.DDF.model.common;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.Procedure is a .
 *
 * @author Chris Upkes
 */

public abstract class Procedure {

    private final UUID id;

    protected Procedure(UUID id) {
        this.id = id;
    }
}
