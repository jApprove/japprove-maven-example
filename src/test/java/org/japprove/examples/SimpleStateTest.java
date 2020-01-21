package org.japprove.examples;

import com.fasterxml.jackson.databind.JsonNode;
import org.japprove.annotations.ApprovalTest;
import org.japprove.verifier.JsonVerifier;

public class SimpleStateTest {

    @ApprovalTest(baseline = "json")
    public void testGetState(JsonVerifier jsonVerifier) {
        JsonNode state = SimpleState.getState();
        jsonVerifier.ignore("timestamp").verify(state);
    }
}
