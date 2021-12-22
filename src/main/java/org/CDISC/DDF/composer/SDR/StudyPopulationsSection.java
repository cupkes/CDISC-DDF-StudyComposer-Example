package org.CDISC.DDF.composer.SDR;

import org.CDISC.DDF.model.study.Population;
import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudyPopulationsSection extends Section {
    public StudyPopulationsSection(UUID id, String version, SectionType sectionType) {
        super(id, version, sectionType);
    }


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
