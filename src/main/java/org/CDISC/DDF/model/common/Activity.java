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
    private final String description;
    private List<Procedure> definedProcedures;
    private List<StudyData> StudyDataCollection;

    // add procedure list


    public Activity(UUID id, String description, List<Procedure> definedProcedures, List<StudyData> StudyDataCollection) {
        this.id = id;
        this.description = description;
        this.definedProcedures = definedProcedures;
        this.StudyDataCollection = StudyDataCollection;
    }


    public Activity(UUID id, String description, List<Procedure> definedProcedures) {
        this.id = id;
        this.description = description;
        this.definedProcedures = definedProcedures;

    }

    public Activity(UUID id, String description) {
        this.id = id;
        this.description = description;
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
        return StudyDataCollection;
    }

    public void setStudyDataCollection(List<StudyData> studyDataCollection) {
        this.StudyDataCollection = studyDataCollection;
    }

    public void addStudyData(DeprecatedStudyData deprecatedStudyData){

        // TO_DO implement
    }

    public void removeStudyData(DeprecatedStudyData deprecatedStudyData){

        // TO_DO implement
    }

    public String getDescription() {
        return description;
    }
}
