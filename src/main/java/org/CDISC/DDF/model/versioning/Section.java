package org.CDISC.DDF.model.versioning;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.versioning.Section is an abstract class used to provide a
 * polymorphic collection of components available in the IStudy and IStudyDesign
 * interfaces.
 *
 * @author Chris Upkes
 */

public abstract class Section {

    private UUID id;
    private SectionType sectionType;

//    private String tag; - we are removing tagging for everything but the study



    protected Section(UUID id, SectionType sectionType) {
        this.id = id;
        this.sectionType = sectionType;
    }

//    protected Section(UUID id, SectionType sectionType, String tag) {
//        this.id = id;
//        this.sectionType = sectionType;
//        this.tag = tag;
//    }

    public UUID getId() {
        return id;
    }

//    public String getTag() {
//        return tag;
//    }

    public SectionType getSectionType() {
        return sectionType;
    }
}
