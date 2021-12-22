package org.CDISC.DDF.composer.SDR;

import org.CDISC.DDF.model.study.Phase;
import org.CDISC.DDF.model.study.StudyIdentifier;
import org.CDISC.DDF.model.study.StudyType;
import org.CDISC.DDF.model.versioning.IStudy;
import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.*;

public class Study implements IStudy {

    private UUID id;
    private String studyTitle;
    private StudyType studyType;
    private Phase studyPhase;
    private String version;
    private List<StudyIdentifier> studyIdentifiers;
    private Map<SectionType,List<Section>> studySections = new HashMap<>();
    private List<Section> interventionHistory = new ArrayList<>();
    private List<Section> indicationHistory = new ArrayList<>();
    private List<Section> objectiveHistory = new ArrayList<>();
    private List<Section> studyDesignHistory = new ArrayList<>();


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

        List<Section> sections = this.studySections.get(sectionType);
        for (Section section: sections
             ) {
            if (section.getVersion().equals(version)) {
                return section;
            }

        }
        return null;

    }

    @Override
    public void addSection(SectionType sectionType, Section section) {

        switch (sectionType) {
            case STUDY_DESIGNS -> {
                this.studyDesignHistory.add(section);
                this.studySections.put(SectionType.STUDY_DESIGNS, studyDesignHistory);
            }
            case STUDY_INDICATIONS -> {
                this.indicationHistory.add(section);
                this.studySections.put(SectionType.STUDY_INDICATIONS, indicationHistory);
            }
            case OBJECTIVES -> {
                this.objectiveHistory.add(section);
                this.studySections.put(SectionType.OBJECTIVES, objectiveHistory);
            }
            case INVESTIGATIONAL_INTERVENTIONS -> {
                this.interventionHistory.add(section);
                this.studySections.put(SectionType.INVESTIGATIONAL_INTERVENTIONS, interventionHistory);
            }
            default -> {
            }
        }



    }

    @Override
    public List<Section> getSectionHistory(SectionType sectionType) {
        return this.studySections.get(sectionType);
    }
}
