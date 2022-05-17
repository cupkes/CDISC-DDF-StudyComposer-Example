package org.CDISC.DDF.composer.engine;

import com.fasterxml.jackson.core.JsonProcessingException;
import junit.framework.Assert;
import org.CDISC.DDF.composer.translator.openstudybuilder.OpenStudy;
import org.CDISC.DDF.composer.translator.openstudybuilder.VersionMetadata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class OpenStudyParserTest {

    @Test
    void getOpenStudies() throws JsonProcessingException {

        List<OpenStudy> openStudies = OpenStudyParser.getOpenStudyList();
        Assertions.assertNotNull(openStudies);
        Assert.assertEquals("CDISC DEV-0",openStudies.get(0).getStudyId());
        CurrentMetadata currentMetadata = openStudies.get(0).getCurrentMetadata();
        IdentificationMetadata identificationMetadata = currentMetadata.getIdentificationMetadata();
        VersionMetadata versionMetadata = currentMetadata.getVersionMetadata();
        Assert.assertEquals("CDISC DEV", identificationMetadata.getProjectNumber());
        Assert.assertEquals("2022-03-15T07:33:49.011304", versionMetadata.getVersionTimestamp());
    }



}