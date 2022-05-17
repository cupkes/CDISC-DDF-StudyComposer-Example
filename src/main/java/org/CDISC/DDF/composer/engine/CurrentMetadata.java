package org.CDISC.DDF.composer.engine;

import org.CDISC.DDF.composer.translator.openstudybuilder.VersionMetadata;

public class CurrentMetadata {

    private IdentificationMetadata identificationMetadata;
    private VersionMetadata versionMetadata;


    public CurrentMetadata(IdentificationMetadata identificationMetadata, VersionMetadata versionMetadata) {
        this.identificationMetadata = identificationMetadata;
        this.versionMetadata = versionMetadata;
    }

    public CurrentMetadata() {

    }

    public IdentificationMetadata getIdentificationMetadata() {
        return identificationMetadata;
    }

    public void setIdentificationMetadata(IdentificationMetadata identificationMetaData) {
        this.identificationMetadata = identificationMetaData;
    }

    public VersionMetadata getVersionMetadata() {
        return versionMetadata;
    }

    public void setVersionMetadata(VersionMetadata versionMetadata) {
        this.versionMetadata = versionMetadata;
    }
}
