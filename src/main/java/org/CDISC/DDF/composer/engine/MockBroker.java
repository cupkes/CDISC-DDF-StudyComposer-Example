package org.CDISC.DDF.composer.engine;

// use the StaticStudyDataProvider to populate object properties

// import model

// import jackson or gson
// The question here is whether the gson or jackson library is better suited.
// experience with jackson but have seen numerous references to the Google implementation.



/**
 * org.CDISC.DDF.composer.engine.FileBroker extends the IStudyComponentBroker interface and acts as a stub
 * for use by the study composer to return static example data.
 *
 * @author Chris Upkes
 */

public class MockBroker {

    // implement interface methods

    // I didn't make the StaticStudyDataProvider a private class for MockBroker in case that
    // mock data might be needed elsewhere.  If not, I'll likely move it here.
}
