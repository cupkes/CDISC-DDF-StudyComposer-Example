package org.CDISC.DDF.model.versioning;

import org.CDISC.DDF.model.study.Phase;
import org.CDISC.DDF.model.study.StudyIdentifier;
import org.CDISC.DDF.model.study.StudyType;

import java.util.List;
import java.util.UUID;

public interface IStudy {

    UUID getStudyId();

    String getStudyVersion();

    void setStudyVersion(String version);

    String getStudyTag();

    void setStudyTag(String tag);

    String getStudyTitle();

    StudyType getStudyType();

    Phase getStudyPhase();

    List<StudyIdentifier> getStudyIdentifiers();

    List<Section> getCurrentSections();

//    Section getSection(SectionType sectionType, String tag);

    Section getSection(SectionType sectionType);

    void addSection(SectionType sectionType, Section section);

    List<Section> getSectionHistory(SectionType sectionType);





}
