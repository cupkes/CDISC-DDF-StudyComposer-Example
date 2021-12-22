package org.CDISC.DDF.composer.SDR;

import org.CDISC.DDF.model.study.Objective;
import org.CDISC.DDF.model.study.ObjectiveLevel;
import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ObjectivesSection extends Section {


    private List<Objective> objectives = new ArrayList<>();

    public ObjectivesSection(UUID id, String version) {
        super(id, version, SectionType.OBJECTIVES);
    }

    public List<Objective> getObjectives() {
        return objectives;
    }

    public void setObjectives(List<Objective> objectives) {
        this.objectives = objectives;
    }

    public List<Objective> getObjectivesByLevel(ObjectiveLevel objectiveLevel){

        List<Objective> objectivesByLevel = new ArrayList<>();

        for (Objective objective : this.objectives
             ) {
            if (objective.getLevel() == objectiveLevel) {

                objectivesByLevel.add(objective);

            }

        }
        return objectivesByLevel;

    }


    public void addObjective(Objective objective) {

        this.objectives.add(objective);
    }

    public void removeObjective(Objective objective) {

        this.objectives.remove(objective);
    }



}
