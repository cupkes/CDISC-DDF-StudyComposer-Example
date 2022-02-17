package org.CDISC.DDF.model.common;

import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.StudyData is a super class used to provide a convenient method
 * for abstracting and collecting different types of data generated during a study.
 *
 * @author Chris Upkes
 */

public abstract class DeprecatedStudyData {

/* the study data element illustrated in section 3 of the mind map is not explicitly associated with
elements in sections 4,5 or 6.  However, it is my assumption that study data was meant to be
associated with elements such as observations, measurements, q&a, etc...which are found in those latter sections.
 */
    private final UUID id;
    // this is he UUID of the event (assement, activity, etc..) associated with the collection of data.
    private final UUID collectionEventId;
    // this corresponds to the appropriate Biomedical Concept associated with the data.  It is not clear
    // whether a specific discrete recording of data should be linked to more than one concept or not.
    // I had to make a decision here, and I believe it will be more intuitive to group discrete pieces
    // of collected information by the event and the concept, if one is associated.
    // It's important to agree that a biomedical concept is important in the attribution or categorization
    // of data collected from individual study events.
    private DeprecatedConcept biomedicalDeprecatedConcept;
    private Code coding;
    private String technology;


    public DeprecatedStudyData(UUID id, UUID collectionEventId) {
        this.id = id;
        this.collectionEventId = collectionEventId;
    }

    public UUID getId() {
        return id;
    }
    public Code getCoding() {
        return coding;
    }

    public void setCoding(Code coding) {
        this.coding = coding;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
    public DeprecatedConcept getBiomedicalConcept() {
        return biomedicalDeprecatedConcept;
    }

    public void setBiomedicalConcept(DeprecatedConcept biomedicalDeprecatedConcept) {
        this.biomedicalDeprecatedConcept = biomedicalDeprecatedConcept;
    }

    public UUID getCollectionEventId() {
        return collectionEventId;
    }




}
