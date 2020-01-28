package org.japprove.examples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.japprove.annotations.ApprovalTest;
import org.japprove.verifier.JsonVerifier;

public class SimpleStatusTest {

    @ApprovalTest(baseline = "status")
    public void testGetStatus(JsonVerifier jsonVerifier) throws JsonProcessingException {
        JsonNode state = SimpleStatus.getStatus();
        jsonVerifier.ignore("timestamp").verify(state);
    }
}
