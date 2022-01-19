package org.CDISC.DDF.composer.SDR;

import org.CDISC.DDF.model.studyDesign.StudyArm;
import org.CDISC.DDF.model.studyDesign.StudyCell;
import org.CDISC.DDF.model.studyDesign.StudyEpoch;
import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class StudyCellsSection extends Section {
    public StudyCellsSection(UUID id) {
        super(id,SectionType.STUDY_CELLS);

    }
//    public StudyCellsSection(UUID id, String tag) {
//        super(id,SectionType.STUDY_CELLS, tag);
//
//    }

    private List<StudyCell> studyCells = new ArrayList<>();

    public List<StudyCell> getStudyCells() {
        return studyCells;
    }

    public void setStudyCells(List<StudyCell> studyCells) {
        this.studyCells = studyCells;
    }

    public StudyCell getStudyCell(UUID studyCellId){

        for (StudyCell studyCell : studyCells
             ) {
            if (studyCell.getId() == studyCellId) {

                return studyCell;
            }
        }

        return null;
    }

    public void addStudyCell(StudyCell studyCell) {

        this.studyCells.add(studyCell);
    }

    public List<StudyCell> getStudyCell(StudyArm studyArm) {

        List<StudyCell> studyCellsByArm =new ArrayList<>();

        for (StudyCell studyCell : studyCells
        ) {
            if (studyCell.getStudyArm().getId() == studyArm.getId()) {

                studyCellsByArm.add(studyCell);

            }


        }

        return studyCellsByArm;
    }

    public List<StudyCell> getStudyCell(StudyEpoch studyEpoch) {

        List<StudyCell> studyCellsByEpoch = new ArrayList<>();

        for (StudyCell studyCell : studyCells
        ) {
            if (studyCell.getStudyEpoch().getId() == studyEpoch.getId()) {
                studyCellsByEpoch.add(studyCell);

            }
        }
        return studyCellsByEpoch;
    }




}
