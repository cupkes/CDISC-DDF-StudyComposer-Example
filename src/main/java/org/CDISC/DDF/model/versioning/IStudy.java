package org.CDISC.DDF.model.versioning;

import org.CDISC.DDF.model.study.*;

import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.versioning.IStudy is an interface defining the essential
 * methods required for study data.
 *
 * @author Chris Upkes
 */

public interface IStudy {

    UUID getStudyId();

    String getStudyVersion();

    void setStudyVersion(String version);

    String getStudyTag();

    void setStudyTag(String tag);

    String getStudyTitle();

    StudyType getStudyType();

    Phase getStudyPhase();

    String getStudyStatus();

    void setStudyStatus(String studyStatus);

    List<StudyIdentifier> getStudyIdentifiers();

    void addStuyIdentifier(StudyIdentifier studyIdentifier);

    void removeStudyIdentifier(StudyIdentifier studyIdentifier);

    List<StudyProtocolReference> getStudyProtocolReferences();

    void setStudyProtocolReferences(List<StudyProtocolReference> studyProtocolReferences);

    void addStudyProtocolReference(StudyProtocolReference studyProtocolReference);

    void removeStudyProtocolReference(StudyProtocolReference studyProtocolReference);

    List<Section> getCurrentSections();

//    Section getSection(SectionType sectionType, String tag);

    Section getSection(SectionType sectionType);

    void addSection(SectionType sectionType, Section section);

    List<Section> getSectionHistory(SectionType sectionType);





}
