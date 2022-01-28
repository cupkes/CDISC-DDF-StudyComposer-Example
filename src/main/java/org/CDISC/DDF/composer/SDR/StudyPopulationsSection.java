package org.CDISC.DDF.composer.SDR;

import org.CDISC.DDF.model.study.Population;
import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * org.CDISC.DDF.composer.SDR.StudyPopulationsSection is in implementation of the
 * Section abstract class.  This section pertains to the collection of populations associated
 * with study designs (sub-studies).  This needs to be at the sub-study level to support
 * basket or umbrella studies.
 *
 * @author Chris Upkes
 */

public class StudyPopulationsSection extends Section {
    public StudyPopulationsSection(UUID id) {
        super(id, SectionType.STUDY_POPULATIONS);
    }

//    public StudyPopulationsSection(UUID id, String tag) {
//        super(id, SectionType.STUDY_POPULATIONS, tag);
//    }


    private List<Population> studyPopulations = new ArrayList<>();

    public List<Population> getStudyPopulations() {
        return studyPopulations;
    }

    public void setStudyPopulations(List<Population> studyPopulations) {
        this.studyPopulations = studyPopulations;
    }

    public Population getStudyPopulation(UUID studyPopulationId){

        for (Population population : studyPopulations
             ) {
            if (population.getId() == studyPopulationId) {
                return population;
            }
        }
        return null;
    }

    public void addStudyPopulation(Population studyPopulation){

        this.studyPopulations.add(studyPopulation);

    }



}
