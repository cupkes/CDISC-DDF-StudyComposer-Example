package org.CDISC.DDF.composer.engine;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.CDISC.DDF.composer.SDR.Study;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class OpenStudyBuilderBrokerTest {

    @Test
    void getStudy() throws JsonProcessingException {

        OpenStudyBuilderBroker openStudyBuilderBroker = new OpenStudyBuilderBroker();
        Study study = openStudyBuilderBroker.getStudy("123");
        Assertions.assertNotNull(study);
    }
}