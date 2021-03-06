package org.CDISC.DDF.composer.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.CDISC.DDF.composer.SDR.StudyDesign;
import org.CDISC.DDF.composer.engine.IStudyComponentBroker;
import org.CDISC.DDF.composer.engine.MockBroker;
import org.CDISC.DDF.composer.engine.OpenStudyBuilderBroker;
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


        IStudyDesign studyDesign;
        try {
            studyDesign = this.studyComposer.getMockIStudyDesign();
            String studyDesignJSON = this.studyComponentTranslator.translateIStudyDesignToJSON(studyDesign);
            assertNotNull(studyDesignJSON);
            System.out.println(studyDesignJSON);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }


    }

    @Test
    void translateIStudyToJSON() throws JsonProcessingException{

        IStudy study;
        try {
            study = this.studyComposer.getMockIStudy();
            String studyJSON = this.studyComponentTranslator.translateIStudyToJSON(study);
            assertNotNull(studyJSON);
            System.out.println(studyJSON);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }




    }

    @Test
    void translateStudyObjectivesToJSON() throws JsonProcessingException {

        List<Objective> studyObjectives = this.studyComposer.getMockStudyObjectives(UUID.randomUUID());
        String studyObjectivesJSON = this.studyComponentTranslator.translateStudyObjectivesToJSON(studyObjectives);
        assertNotNull(studyObjectivesJSON);
        System.out.println(studyObjectivesJSON);


    }

    @Test
    void translateOpenIStudyToJSON() throws JsonProcessingException{

        IStudy study;
        try {
            IStudyComponentBroker openStudyBuilderBroker = new OpenStudyBuilderBroker();
            study = this.studyComposer.getStudy(UUID.randomUUID(), openStudyBuilderBroker);
            String studyJSON = this.studyComponentTranslator.translateIStudyToJSON(study);
            assertNotNull(studyJSON);
            System.out.println(studyJSON);
        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}