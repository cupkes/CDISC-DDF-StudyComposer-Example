package org.CDISC.DDF.composer.SDR;

import org.CDISC.DDF.model.study.Objective;
import org.CDISC.DDF.model.study.ObjectiveLevel;
import org.CDISC.DDF.model.versioning.Section;
import org.CDISC.DDF.model.versioning.SectionType;

import java.util.Map;
import java.util.UUID;

public class ObjectivesSection extends Section {


    public ObjectivesSection(UUID id, String version) {
        super(id, version, SectionType.OJECTIVES);
    }

    public Map<ObjectiveLevel, Objective> getObjectiveMap() {
        return objectiveMap;
    }

    public void setObjectiveMap(Map<ObjectiveLevel, Objective> objectiveMap) {
        this.objectiveMap = objectiveMap;
    }

    private Map<ObjectiveLevel, Objective> objectiveMap;

    public Objective getObjective(ObjectiveLevel objectiveLevel){

        return this.objectiveMap.get(objectiveLevel);

    }

    public void addObjective(ObjectiveLevel objectiveLevel, Objective objective) {

        this.objectiveMap.put(objectiveLevel,objective);
    }



}
