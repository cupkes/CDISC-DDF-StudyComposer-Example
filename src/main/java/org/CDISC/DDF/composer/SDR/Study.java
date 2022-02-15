package org.CDISC.DDF.composer.SDR;



import org.CDISC.DDF.model.study.*;
import org.CDISC.DDF.model.versioning.IStudy;
import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.*;
/**
 * org.CDISC.DDF.composer.SDR.PlannedWorkflowsSection is in implementation of the
 * IStudy interface.  This class represents a clinical study.
 *
 * @author Chris Upkes
 */


public class Study implements IStudy {

    private final UUID id;



    private final String studyTitle;
    private final StudyType studyType;
    private final Phase studyPhase;
    private String version;
    private String tag;
    private String studyStatus;

    private final List<StudyIdentifier> studyIdentifiers;
    private List<StudyProtocolReference> studyProtocolReferences = new ArrayList<>();
    private final Map<SectionType,List<Section>> studySections = new HashMap<>();
    private final List<Section> indicationHistory = new ArrayList<>();
    private final List<Section> objectiveHistory = new ArrayList<>();
    private final List<Section> studyDesignHistory = new ArrayList<>();


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
    public String getStudyTag() {
        return this.tag;
    }

    @Override
    public void setStudyTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getStudyTitle() {
        return this.studyTitle;
    }

    @Override
    public StudyType getStudyType() {
        return this.studyType;
    }

    @Override
    public Phase getStudyPhase() {
        return this.studyPhase;
    }

    @Override
    public String getStudyStatus() {
        return this.studyStatus;
    }

    @Override
    public void setStudyStatus(String studyStatus) {
        this.studyStatus = studyStatus;
    }

    @Override
    public List<StudyIdentifier> getStudyIdentifiers() {
        return this.studyIdentifiers;
    }

    @Override
    public void addStuyIdentifier(StudyIdentifier studyIdentifier) {

        this.studyIdentifiers.add(studyIdentifier);

    }

    @Override
    public void removeStudyIdentifier(StudyIdentifier studyIdentifier) {

        this.studyIdentifiers.remove(studyIdentifier);

    }

    @Override
    public List<StudyProtocolReference> getStudyProtocolReferences() {
        return this.studyProtocolReferences;
    }

    @Override
    public void setStudyProtocolReferences(List<StudyProtocolReference> studyProtocolReferences) {
        this.studyProtocolReferences = studyProtocolReferences;

    }

    @Override
    public void addStudyProtocolReference(StudyProtocolReference studyProtocolReference) {
        this.studyProtocolReferences.add(studyProtocolReference);
    }

    @Override
    public void removeStudyProtocolReference(StudyProtocolReference studyProtocolReference) {
        this.studyProtocolReferences.remove(studyProtocolReference);

    }

    @Override
    public List<Section> getCurrentSections() {

        List<Section> currentSections = new ArrayList<>();

        for (Map.Entry<SectionType,List<Section>> mapElement : this.studySections.entrySet()
        ) {
            List<Section> mapList = mapElement.getValue();
            currentSections.add(mapList.get(mapList.size() - 1));

        }

        return currentSections;
    }

//    @Override
//    public Section getSection(SectionType sectionType, String tag) {
//
//        List<Section> sections = this.studySections.get(sectionType);
//        for (Section section: sections
//             ) {
//            if (section.getTag().equals(tag)) {
//                return section;
//            }
//
//        }
//        return null;
//
//    }

    @Override
    public Section getSection(SectionType sectionType) {
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
            default -> {
            }
        }



    }

    @Override
    public List<Section> getSectionHistory(SectionType sectionType) {
        return this.studySections.get(sectionType);
    }


}


