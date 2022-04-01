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
        put some comments in here describing the actual endpoint and the nature of the JSON object
        it might even help to include a commented "entire study".

     return '{someJSON:here}'
     }
     */

    // YOu can take a look at my IStudyComponentBroker interface to understand what types
    // of granular calls I am using to build a Study.

    // once we've filled this out, we'll create an interface and then we'll implement
    // an adapter that actually calls the OpenStudyBuilder API.

    // If I can build a study from the OpenStudyBuilder API, then we should know how
    // OpenStudyBuilder can post a study to the SDR via adaptor logic.

    public JSON getStudies() {
        // This fetches all studies, our test DB has only one study "Study_000001".
        // GET http://localhost:8000/studies/?sortBy=%7B%7D&pageNumber=1&pageSize=0&operator=and&totalCount=false

        // We are unsure of how to enter multiline strings full off "difficult"
        // symbols, so this may not be valid.
        return """
            {
            "items": [
                {
                    "uid": "Study_000001",
                    "studyNumber": "0",
                    "studyId": "CDISC DEV-0",
                    "studyAcronym": null,
                    "projectNumber": "CDISC DEV",
                    "studyStatus": "DRAFT",
                    "currentMetadata": {
                        "identificationMetadata": {
                            "studyNumber": "0",
                            "studyAcronym": null,
                            "projectNumber": "CDISC DEV",
                            "projectName": "CDISC Dev",
                            "brandName": null,
                            "clinicalProgrammeName": "CDISC Development programme",
                            "studyId": "CDISC DEV-0",
                            "registryIdentifiers": {
                                "ctGovId": null,
                                "ctGovIdNullValueCode": null,
                                "eudractId": null,
                                "eudractIdNullValueCode": null,
                                "universalTrialNumberUTN": null,
                                "universalTrialNumberUTNNullValueCode": null,
                                "japaneseTrialRegistryIdJAPIC": null,
                                "japaneseTrialRegistryIdJAPICNullValueCode": null,
                                "investigationalNewDrugApplicationNumberIND": null,
                                "investigationalNewDrugApplicationNumberINDNullValueCode": null
                            }
                        },
                        "versionMetadata": {
                            "studyStatus": "DRAFT",
                            "lockedVersionNumber": null,
                            "versionTimestamp": "2022-03-15T07:33:49.011304",
                            "lockedVersionAuthor": null,
                            "lockedVersionInfo": null
                        }
                    }
                }
            ],
            "total": 0,
            "page": 1,
            "size": 0
        }""";
     }
}
