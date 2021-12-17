package org.CDISC.DDF.composer.SDR;

import org.CDISC.DDF.model.versioning.IStudyDesign;
import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class StudyDesign implements IStudyDesign {

    private final UUID id;
    private String version;
    private Map<SectionType,List<Section>> designSections;

    public StudyDesign(UUID id, String version) {
        this.id = id;
        this.version = version;
    }

    @Override
    public UUID getStudyDesignId() {
        return this.id;
    }

    @Override
    public String getStudyDesignVersion() {
        return this.version;
    }

    @Override
    public void setStudyDesignVersion(String version) {

        this.version = version;

    }

    @Override
    public List<Section> getCurrentSections() {
        return null;
    }

    @Override
    public Section getSection(SectionType sectionType, String version) {
        return null;
    }

    @Override
    public void setSection(SectionType sectionType, String version) {

    }

    @Override
    public List<Section> getSectionHistory(SectionType sectionType) {
        return null;
    }
}
