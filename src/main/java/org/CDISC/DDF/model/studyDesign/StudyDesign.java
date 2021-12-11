package org.CDISC.DDF.model.studyDesign;

import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.study.StudyDesign is a class representing the design of a study in a clinical trial.
 *
 * @author Nathan Smith
 */

public class StudyDesign {

    private final UUID id;
    private List<StudyCell> studyCells;
    private PlannedWorkflow plannedWorkflow;

    public StudyDesign(UUID id, List<StudyCell> studyCells) {
        this.id = id;
        this.studyCells = studyCells;
    }

    public StudyDesign(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public List<StudyCell> getStudyCells() {
        return studyCells;
    }

    public void setStudyCells(List<StudyCell> studyCells) {
        this.studyCells = studyCells;
    }

    public void addStudyCell(StudyCell studyCell)
    {
        // TO_DO
    }

    public void removeStudyCell(StudyCell studyCell){

        // TO_DO
    }


    public PlannedWorkflow getPlannedWorkflow() {
        return plannedWorkflow;
    }

    public void setPlannedWorkflow(PlannedWorkflow plannedWorkflow) {
        this.plannedWorkflow = plannedWorkflow;
    }

}
