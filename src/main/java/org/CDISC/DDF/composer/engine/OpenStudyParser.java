package org.CDISC.DDF.composer.engine;
import com.fasterxml.jackson.core.type.TypeReference;
import org.CDISC.DDF.composer.util.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;

import java.lang.reflect.Type;
import java.util.List;

public class OpenStudyParser {

    public static List<OpenStudy> getOpenStudyList() throws JsonProcessingException {

        String openStudyListString = StaticOpenStudyBuilderAdapter.getStudyArray();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(openStudyListString, new TypeReference<List<OpenStudy>>(){}
        );







    }


}
