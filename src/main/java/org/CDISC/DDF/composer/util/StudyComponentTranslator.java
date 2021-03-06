package org.CDISC.DDF.composer.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import org.CDISC.DDF.composer.SDR.StudyDesign;
import org.CDISC.DDF.model.study.Objective;
import org.CDISC.DDF.model.versioning.IStudy;
import org.CDISC.DDF.model.versioning.IStudyDesign;


import java.util.List;


/**
 * org.CDISC.DDF.composer.util.StudyComponentTranslator class is used to translate study objects into JSON or XML.
 *
 * @author Chris Upkes
 */

public class StudyComponentTranslator {

    // TO_DO implement method to translate a component to JSON
    // method could be overloaded to accept different objects.

    public String translateStudyDesignToJSON(StudyDesign studyDesign) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(studyDesign);


    }

    public String translateIStudyDesignToJSON(IStudyDesign studyDesign) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(studyDesign);


    }

    public String translateIStudyToJSON(IStudy study) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(study);


    }
    public String translateStudyObjectivesToJSON(List<Objective> studyObjectives) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(studyObjectives);


    }




}
