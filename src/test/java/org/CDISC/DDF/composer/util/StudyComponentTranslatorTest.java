package org.CDISC.DDF.composer.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.CDISC.DDF.composer.engine.IStudyComponentBroker;
import org.CDISC.DDF.composer.engine.MockBroker;
import org.CDISC.DDF.composer.engine.StudyComposer;
import org.CDISC.DDF.model.study.Objective;
import org.CDISC.DDF.model.studyDesign.StudyDesign;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class StudyComponentTranslatorTest {

    StudyComposer studyComposer;
    StudyComponentTranslator studyComponentTranslator;

    @BeforeEach
    void init() {

        this.studyComposer = new StudyComposer();
        this.studyComponentTranslator = new StudyComponentTranslator();

    }

    @Test
    void translateStudyDesignToJSON() throws JsonProcessingException{



            StudyDesign studyDesign = this.studyComposer.getMockStudyDesign();
            String studyDesignJSON = this.studyComponentTranslator.translateStudyDesignToJSON(studyDesign);
            assertNotNull(studyDesignJSON);
            //System.out.println(studyDesignJSON);

    }

    @Test
    void translateStudyObjectivesToJSON() throws JsonProcessingException {

        List<Objective> studyObjectives = this.studyComposer.getMockStudyObjectives(UUID.randomUUID());
        String studyObjectivesJSON = this.studyComponentTranslator.translateStudyObjectivesToJSON(studyObjectives);
        assertNotNull(studyObjectivesJSON);
        System.out.println(studyObjectivesJSON);


    }
}