package org.CDISC.DDF.composer.SDR;

import org.CDISC.DDF.model.versioning.IStudyDesign;
import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.*;

/**
 * org.CDISC.DDF.composer.SDR.PlannedWorkflowsSection is in implementation of the
 * IStudyDesign interface.  This class represents a clinical sub-study.
 *
 * @author Chris Upkes
 */

public class StudyDesign implements IStudyDesign {

    private final UUID id;
   // private String version;
    private Map<SectionType,List<Section>> designSections = new HashMap<>();
    private List<Section> studyCellHistory = new ArrayList<>();
    private List<Section> workflowHistory = new ArrayList<>();
    private List<Section> populationHistory = new ArrayList<>();


    public StudyDesign(UUID id) {
        this.id = id;
        //this.version = version;
    }

    @Override
    public UUID getStudyDesignId() {
        return this.id;
    }

//    @Override
//    public String getStudyDesignVersion() {
//        return this.version;
//    }
//
//    @Override
//    public void setStudyDesignVersion(String version) {
//
//        this.version = version;
//
//    }

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
    public Section getSection(SectionType sectionType) {
        List<Section> returnSections =  this.designSections.get(sectionType);
        if (returnSections != null) {
        return returnSections.get(returnSections.size() - 1);}
        return null;
    }


//    @Override
//    public Section getSection(SectionType sectionType, String tag) {
//
//        List<Section> sections = this.designSections.get(sectionType);
//        for (Section section: sections
//        ) {
//            if (section.getTag().equals(tag)) {
//                return section;
//            }
//
//        }
//        return null;
//    }

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
