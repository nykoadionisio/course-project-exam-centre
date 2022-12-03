package uc.doc.submitsolution;

import entities.SolutionDocument;

import java.io.File;
import java.time.LocalDateTime;

public class SubSDocResponseModel {

    /**
     * The ID of the new solution doc entity
     */
    private final String solutionDocID;

    /**
     * The ID of the corresponding parent test
     */
    private final String testDocID;

    /**
     * A timestamp for when this document was created
     */
    private final LocalDateTime timestamp;

    /**
     * Creates a new solution document submission response model for giving relevant information back to the user
     * @param solutionDocID The ID of the newly created solution document
     * @param testDocID The ID of the corresponding test this solution document belongs to
     * @param timestamp The time the SolutionDoc was created
     */
    public SubSDocResponseModel(String solutionDocID, String testDocID, LocalDateTime timestamp) {
        this.solutionDocID = solutionDocID;
        this.timestamp = timestamp;
        this.testDocID = testDocID;
    }

    /**
     * Gets the ID for this solution document
     * @return The document's ID
     */
    public String getSolutionDoc() {
        return solutionDocID;
    }

    /**
     * Gets the time the solution doc was created
     * @return The time in a LocalDateTime object
     */
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Gets the ID of the test this solution document corresponds to
     * @return The test document's ID
     */
    public String getTestDocID() {
        return testDocID;
    }
}
