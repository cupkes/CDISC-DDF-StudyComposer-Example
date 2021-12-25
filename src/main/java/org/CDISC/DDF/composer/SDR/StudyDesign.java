package org.CDISC.DDF.composer.SDR;

import org.CDISC.DDF.model.versioning.IStudyDesign;
import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.*;

public class StudyDesign implements IStudyDesign {

    private final UUID id;
    private String version;
    private Map<SectionType,List<Section>> designSections = new HashMap<>();
    private List<Section> studyCellHistory = new ArrayList<>();
    private List<Section> workflowHistory = new ArrayList<>();
    private List<Section> populationHistory = new ArrayList<>();


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

        List<Section> currentSections = new ArrayList<>();

        for (Map.Entry<SectionType,List<Section>> mapElement : this.designSections.entrySet()
             ) {
            List<Section> mapList = mapElement.getValue();
            currentSections.add(mapList.get(mapList.size() - 1));

        }

        return currentSections;
    }

    @Override
    public Section getSection(SectionType sectionType, String version) {

        List<Section> sections = this.designSections.get(sectionType);
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
            case STUDY_CELLS -> {
                this.studyCellHistory.add(section);
                this.designSections.put(SectionType.STUDY_CELLS, this.studyCellHistory);
            }
            case PLANNED_WORKFLOWS -> {
                this.workflowHistory.add(section);
                this.designSections.put(SectionType.PLANNED_WORKFLOWS, this.workflowHistory);
            }
            case STUDY_POPULATIONS -> {
                this.populationHistory.add(section);
                this.designSections.put(SectionType.STUDY_POPULATIONS, this.populationHistory);
            }
            default -> {
            }
        }

    }

    @Override
    public List<Section> getSectionHistory(SectionType sectionType) {

        return this.designSections.get(sectionType);
    }
}
