package org.CDISC.DDF.model.versioning;



import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.versioning.IStudyDesign is an interface defining the essential
 * methods required for study data that supports basket and umbrella studies.
 *
 * @author Chris Upkes
 */

public interface IStudyDesign {

    UUID getStudyDesignId();

//    String getStudyDesignVersion(); -- removing versioning for all but study
//
//    void setStudyDesignVersion(String version);

    List<Section> getCurrentSections();

    Section getSection(SectionType section);

//    Section getSection(SectionType sectionType, String tag);

    void addSection(SectionType sectionType, Section section);

    List<Section> getSectionHistory(SectionType sectionType);


}
