package org.CDISC.DDF.model.versioning;

import java.util.List;
import java.util.UUID;

public interface IStudyDesign {

    UUID getStudyDesignId();

    String getStudyDesignVersion();

    void setStudyDesignVersion(String version);

    List<Section> getCurrentSections();

    Section getSection(SectionType sectionType, String version);

    void setSection(SectionType sectionType, String version);

    List<Section> getSectionHistory(SectionType sectionType);


}
