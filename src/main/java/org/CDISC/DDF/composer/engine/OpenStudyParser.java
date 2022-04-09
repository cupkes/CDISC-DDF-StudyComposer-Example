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
        // TODO delete this, only for checking file read
        try {
            String epochs = StaticOpenStudyBuilderAdapter.getStudyEpochs("Study_000001");
            System.out.println(epochs);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(openStudyListString, new TypeReference<List<OpenStudy>>(){}
        );







    }


}
