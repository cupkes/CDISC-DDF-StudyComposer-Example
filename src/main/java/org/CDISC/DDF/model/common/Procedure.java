package org.CDISC.DDF.model.common;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.Procedure is an abstract class used to provide
 * polymorphism for various collections of specific procedure types.
 *
 * @author Chris Upkes
 */

public abstract class Procedure {

    private final UUID id;

    protected Procedure(UUID id) {
        this.id = id;
    }
}
