package org.CDISC.DDF.model.study;


import org.CDISC.DDF.model.common.StudyIndication;
import org.CDISC.DDF.model.studyDesign.DepracatedStudyDesign;

import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.study.DeprecatedStudy is an class representing a study in a clinical trial.
 *
 * @author Chris Upkes
 */

public class DeprecatedStudy {

    private UUID id;
    private String studyTitle;
    private StudyType studyType;
    private Phase studyPhase;
    private StudyProtocol studyProtocol;
    private InterventionModel interventionModel;
    // every study can have one or more study identifiers
    // i.e. one for the business and one for the FDA.
    private List<StudyIdentifier> studyIdentifiers;
    // should study indications, populations and investigational interventions be pushed down
    // to the StudyDesign class?  Maybe even study objectives?
    // I think we should learn more about both umbrella and basket studies
    // make sure they don't flip-flop (population on the DeprecatedStudy for umbrella and vice versa for basket).
    private List<StudyIndication> studyTargetIndications;
    private List<Population> studyTargetPopulations;
    private List<InvestigationalIntervention> investigationalInterventions;
    // a study can have multiple study designs
    // example, basket or umbrella study
    private List<DepracatedStudyDesign> studyDesigns;
    private List<Objective> studyObjectives = null;
    // add boolean for multiDesign if agreed upon
    // TO_DO


    public DeprecatedStudy(UUID id, String studyTitle, List<StudyIdentifier> studyIdentifiers) {
        this.id = id;
        this.studyTitle = studyTitle;
        this.studyIdentifiers = studyIdentifiers;
    }

    public DeprecatedStudy(StudyIdentifier studyIdentifier, UUID id){
        this.id = id;
        //this.studyIdentifiers.add(studyIdentifier);
    }

    public String getStudyTitle() {
        return studyTitle;
    }

    public void setStudyTitle(String studyTitle) {
        this.studyTitle = studyTitle;
    }

    public StudyType getStudyType() {
        return studyType;
    }

    public void setStudyType(StudyType studyType) {
        this.studyType = studyType;
    }

    public Phase getStudyPhase() {
        return studyPhase;
    }

    public void setStudyPhase(Phase studyPhase) {
        this.studyPhase = studyPhase;
    }

    public StudyProtocol getStudyProtocol() {
        return studyProtocol;
    }

    public void setStudyProtocol(StudyProtocol studyProtocol) {
        this.studyProtocol = studyProtocol;
    }
    public InterventionModel getInterventionModel() {
        return interventionModel;
    }

    public void setInterventionModel(InterventionModel interventionModel) {
        this.interventionModel = interventionModel;
    }


    public List<Objective> getStudyObjectives() {
        return studyObjectives;
    }

    public void setStudyObjectives(List<Objective> studyObjectives) {
        this.studyObjectives = studyObjectives;
    }

    public void addStudyObjective(ObjectiveLevel objectiveLevel, Objective objective){

        // TO_DO
    }

    public void removeStudyObjective(ObjectiveLevel objectiveLevel, Objective objective)
    {
        // TO_DO
    }

    public List<StudyIdentifier> getStudyIdentifiers() {
        return studyIdentifiers;
    }

    public List<StudyIndication> getStudyTargetIndications() {
        return studyTargetIndications;
    }

    public void setStudyTargetIndications(List<StudyIndication> studyTargetIndication) {
        this.studyTargetIndications = studyTargetIndication;
    }

    public List<Population> getStudyTargetPopulations() {
        return studyTargetPopulations;
    }

    public void setStudyTargetPopulations(Population studyTargetPopulation) {
        this.studyTargetPopulations.add(studyTargetPopulation);
    }

    public void setStudyTargetPopulations(List<Population> studyTargetPopulations) {
        this.studyTargetPopulations = studyTargetPopulations;
    }

    public List<InvestigationalIntervention> getInvestigationalInterventions() {
        return investigationalInterventions;
    }

    public void setInvestigationalInterventions(List<InvestigationalIntervention> investigationalInterventions) {
        this.investigationalInterventions = investigationalInterventions;
    }

    public void addInvestigationalIntervention(InvestigationalIntervention investigationalIntervention) {

        // TO_DO
    }

    public void removeInvestigationalIntervention(InvestigationalIntervention investigationalIntervention) {

        // TO_DO
    }

    public List<DepracatedStudyDesign> getStudyDesigns() {
        return studyDesigns;
    }

    public void setStudyDesigns(List<DepracatedStudyDesign> studyDesigns) {
        this.studyDesigns = studyDesigns;
    }



}
