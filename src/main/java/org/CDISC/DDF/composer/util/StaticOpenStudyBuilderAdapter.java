package org.CDISC.DDF.composer.util;

public class StaticOpenStudyBuilderAdapter {

     /* STUDY CELL
    JSON HERE:
     */

    // My idea is to provide methods that return JSON.  I didn't know what to put into
    // an interface as I don't really understand your api.

    // so, for now, just mock your api get endpoints.

    // TODO: implement the first mock method

    /*
    example:
    public JSON getStudyCells(UUID studyID) {
     return '{someJSON:here}'
     }
     */

    // YOu can take a look at my IStudyComponentBroker interface to understand what types
    // of granular calls I am using to build a Study.

    // once we've filled this out, we'll create an interface and then we'll implement
    // an adapter that actually calls the OpenStudyBuilder API.

    // If I can build a study from the OpenStudyBuilder API, then we should know how
    // OpenStudyBuilder can post a study to the SDR via adaptor logic.
}
