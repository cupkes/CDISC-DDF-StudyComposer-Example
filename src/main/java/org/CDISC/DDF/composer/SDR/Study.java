package org.CDISC.DDF.composer.SDR;

import org.CDISC.DDF.model.study.Phase;
import org.CDISC.DDF.model.study.StudyIdentifier;
import org.CDISC.DDF.model.study.StudyType;
import org.CDISC.DDF.model.versioning.IStudy;
import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Study implements IStudy {

    private UUID id;
    private String studyTitle;
    private StudyType studyType;
    private Phase studyPhase;
    private String version;
    private List<StudyIdentifier> studyIdentifiers;
    private Map<SectionType,List<Section>> studySections;


    public Study(UUID id, String studyTitle, StudyType studyType, Phase studyPhase, String version, List<StudyIdentifier> studyIdentifiers) {
        this.id = id;
        this.studyTitle = studyTitle;
        this.studyType = studyType;
        this.studyPhase = studyPhase;
        this.version = version;
        this.studyIdentifiers = studyIdentifiers;
    }


    @Override
    public UUID getStudyId() {
        return this.id;
    }

    @Override
    public String getStudyVersion() {
        return this.version;
    }

    @Override
    public void setStudyVersion(String version) {

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
    public void setSection(SectionType sectionType, Section section) {



    }

    @Override
    public List<Section> getSectionHistory(SectionType sectionType) {
        return null;
    }
}
