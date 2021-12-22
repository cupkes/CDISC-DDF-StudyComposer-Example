package org.CDISC.DDF.model.versioning;

import java.util.List;
import java.util.UUID;

public interface IStudy {

    UUID getStudyId();

    String getStudyVersion();

    void setStudyVersion(String version);

    List<Section> getCurrentSections();

    Section getSection(SectionType sectionType, String version);

    void addSection(SectionType sectionType, Section section);

    List<Section> getSectionHistory(SectionType sectionType);





}
