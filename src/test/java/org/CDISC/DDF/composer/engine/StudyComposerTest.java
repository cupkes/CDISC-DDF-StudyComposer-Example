package org.CDISC.DDF.composer.engine;

import org.CDISC.DDF.composer.SDR.Study;
import org.CDISC.DDF.model.versioning.IStudyDesign;
import org.CDISC.DDF.model.versioning.Section;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudyComposerTest {

    @Test
    void getMockIStudyDesign() {

        StudyComposer studyComposer = new StudyComposer();
        IStudyDesign studyDesign;
        try {
            studyDesign = studyComposer.getMockIStudyDesign();
            List<Section> currentSections = studyDesign.getCurrentSections();
            System.out.println(currentSections.get(0).getId());
            assertNotEquals(0,currentSections.size());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }
}