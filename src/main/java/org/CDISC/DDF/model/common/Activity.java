package org.CDISC.DDF.model.common;

import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.Activity is An action, undertaking, or event, which is anticipated to be performed or observed,
 * or was performed or observed, according to the study protocol during the execution of the study
 *
 * @author Chris Upkes
 */
public class Activity {

    private final UUID id;
    private List<Procedure> definedProcedures;
    private List<StudyData> studyDataCollection;

    // add procedure list


    public Activity(UUID id, List<Procedure> definedProcedures, List<StudyData> studyDataCollection) {
        this.id = id;
        this.definedProcedures = definedProcedures;
        this.studyDataCollection = studyDataCollection;
    }


    public Activity(UUID id, List<Procedure> definedProcedures) {
        this.id = id;
        this.definedProcedures = definedProcedures;

    }

    public Activity(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public List<Procedure> getDefinedProcedures() {
        return definedProcedures;
    }

    public void setDefinedProcedures(List<Procedure> definedProcedures) {

        this.definedProcedures = definedProcedures;
    }

    public void addDefinedProcedure(Procedure procedure){

        // TO_DO implement
    }

    public void removeDefinedProcedure(Procedure procedure){

        // TO_DO implement
    }

    public List<StudyData> getStudyDataCollection() {
        return studyDataCollection;
    }

    public void setStudyDataCollection(List<StudyData> studyDataCollection) {
        this.studyDataCollection = studyDataCollection;
    }

    public void addStudyData(StudyData studyData){

        // TO_DO implement
    }

    public void removeStudyData(StudyData studyData){

        // TO_DO implement
    }
}
