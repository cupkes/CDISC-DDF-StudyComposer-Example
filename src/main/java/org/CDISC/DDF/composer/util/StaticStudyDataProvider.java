package org.CDISC.DDF.composer.util;

/*
 * org.CDISC.DDF.composer.util.IStudyWriter class provides static constant data for the mock broker.
 *
 * @author Chris Upkes
 */

import java.util.UUID;

public class StaticStudyDataProvider {

    public static UUID STUDY_ID = UUID.randomUUID(); // I need a UUID value from the SwaggerHub test data.
    public static String STUDY_IDENTIFIER_ORG_ID = "ACME001";
    public static UUID STUDY_IDENTIFIER_ID = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
    public static UUID STUDY_DESIGN_ID = UUID.randomUUID(); // need a static UUID here as well.
    public static UUID STUDY_CELL_ID = UUID.fromString("8d751aa0-39a7-4593-9fc0-50c95b9f2628");
    public static UUID STUDY_ARM_ID = UUID.fromString("dc8c8550-13d1-4d15-8dcf-5b465a84eb65");
    public static UUID STUDY_EPOCH_ID = UUID.fromString("f24689ce-5f0b-4856-86e1-a5f511445c86");
    public static UUID PLANNED_WORKFLOW_ID = UUID.fromString("79032819-cab1-4901-be00-f48eae6fb38d");
    public static String PLANNED_WORKFLOW_DESC = "Planned Workflow for Study ACME001";
    public static UUID PW_START_POINT_IN_TIME = UUID.fromString("be4b1da8-7148-4136-a6aa-4ec2a1906e90");
    public static UUID PW_END_POINT_IN_TIME = UUID.fromString("ef283782-9c35-45d2-9c7f-0ac2f6a9a301");
    public static UUID TRANSITION_ID = UUID.fromString("4f6f658e-546e-4d12-a03a-a21919780a68");
    public static String TRANSITION_DESC = "go to next when subject has systolic blood pressure below 130 mmHg";
    public static UUID T_FROM_POINT_IN_TIME = UUID.fromString("da6ce1b2-0386-4a62-8885-35b29d70d344");
    public static UUID T_TO_POINT_IN_TIME = UUID.fromString("a4e54693-efef-4cb3-bf1a-1d8d317b5bfe");
    public static String TRANSITION_RULE_DESC = "Textual description of the transition rule";
    public static String CODE = "test transition rule in Python";
    public static String CODE_SYSTEM = "Python";
    public static String TR_DESCRIBED_BY = "Domain";
    public static Integer STUDY_PROTOCOL_CRITERION_TRANSITION_NUMBER = 5;





}
