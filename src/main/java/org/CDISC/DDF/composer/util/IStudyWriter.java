package org.CDISC.DDF.composer.util;

/**
 * org.CDISC.DDF.composer.util.IStudyWriter interface abstracts the writing mechanism for study JSON or XML.
 *
 * @author Chris Upkes
 */

public interface IStudyWriter {

    void writeStudy(String study);

}
