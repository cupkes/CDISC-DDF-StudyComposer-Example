package org.CDISC.DDF.model.common;

import java.net.URI;
import java.util.UUID;

/**
 * org.CDISC.DDF.model.common.StudyData is a  class used to provide a convenient method
 * for collecting different types of data generated during a study and providing library links of
 * common forms for use by user interfaces.
 *
 * @author Chris Upkes
 */

public class StudyData {

    private final UUID id;
    private final String name;
    private final String description;
    private URI eCRFLink;

    public StudyData(UUID id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }


    public StudyData(UUID id, String name, String description, URI eCRFLink) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.eCRFLink = eCRFLink;
    }


    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public URI geteCRFLink() {
        return eCRFLink;
    }

    public void seteCRFLink(URI eCRFLink) {
        this.eCRFLink = eCRFLink;
    }
}
