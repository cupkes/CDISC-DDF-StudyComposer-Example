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
    private List<DeprecatedStudyData> deprecatedStudyDataCollection;

    // add procedure list


    public Activity(UUID id, List<Procedure> definedProcedures, List<DeprecatedStudyData> deprecatedStudyDataCollection) {
        this.id = id;
        this.definedProcedures = definedProcedures;
        this.deprecatedStudyDataCollection = deprecatedStudyDataCollection;
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

    public List<DeprecatedStudyData> getStudyDataCollection() {
        return deprecatedStudyDataCollection;
    }

    public void setStudyDataCollection(List<DeprecatedStudyData> deprecatedStudyDataCollection) {
        this.deprecatedStudyDataCollection = deprecatedStudyDataCollection;
    }

    public void addStudyData(DeprecatedStudyData deprecatedStudyData){

        // TO_DO implement
    }

    public void removeStudyData(DeprecatedStudyData deprecatedStudyData){

        // TO_DO implement
    }
}
