package org.CDISC.DDF.model.versioning;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.versioning.Section is a
 *
 * @author Chris Upkes
 */

public abstract class Section {

    private UUID id;
    private String version;
    private SectionType sectionType;


    protected Section(UUID id, String version, SectionType sectionType) {
        this.id = id;
        this.version = version;
        this.sectionType = sectionType;
    }

    public UUID getId() {
        return id;
    }

    public String getVersion() {
        return version;
    }

    public SectionType getSectionType() {
        return sectionType;
    }
}
