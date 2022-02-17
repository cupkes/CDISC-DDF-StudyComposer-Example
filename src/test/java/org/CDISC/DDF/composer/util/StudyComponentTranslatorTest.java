package org.CDISC.DDF.composer.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.CDISC.DDF.composer.SDR.StudyDesign;
import org.CDISC.DDF.composer.engine.IStudyComponentBroker;
import org.CDISC.DDF.composer.engine.MockBroker;
import org.CDISC.DDF.composer.engine.StudyComposer;
import org.CDISC.DDF.model.study.Objective;
import org.CDISC.DDF.model.versioning.IStudy;
import org.CDISC.DDF.model.versioning.IStudyDesign;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
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

//    @Test
//    void translateStudyDesignToJSON() throws JsonProcessingException{
//
//
//
//            StudyDesign studyDesign = this.studyComposer.getMockStudyDesign();
//            String studyDesignJSON = this.studyComponentTranslator.translateStudyDesignToJSON(studyDesign);
//            assertNotNull(studyDesignJSON);
//            System.out.println(studyDesignJSON);
//
//    }

    @Test
    void translateIStudyDesignToJSON() throws JsonProcessingException{


        IStudyDesign studyDesign = null;
        try {
            studyDesign = this.studyComposer.getMockIStudyDesign();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        String studyDesignJSON = this.studyComponentTranslator.translateIStudyDesignToJSON(studyDesign);
        assertNotNull(studyDesignJSON);
        System.out.println(studyDesignJSON);

    }

    @Test
    void translateIStudyToJSON() throws JsonProcessingException{

        IStudy study = null;
        try {
            study = this.studyComposer.getMockIStudy();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        String studyJSON = this.studyComponentTranslator.translateIStudyToJSON(study);
        assertNotNull(studyJSON);
        System.out.println(studyJSON);

    }

    @Test
    void translateStudyObjectivesToJSON() throws JsonProcessingException {

        List<Objective> studyObjectives = this.studyComposer.getMockStudyObjectives(UUID.randomUUID());
        String studyObjectivesJSON = this.studyComponentTranslator.translateStudyObjectivesToJSON(studyObjectives);
        assertNotNull(studyObjectivesJSON);
        System.out.println(studyObjectivesJSON);


    }
}