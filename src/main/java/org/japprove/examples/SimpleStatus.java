package org.japprove.examples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.Instant;
import org.json.JSONObject;

public class SimpleStatus {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static JsonNode getStatus() throws JsonProcessingException {
        JSONObject json = new JSONObject();
        json.put("statusCode", "200");
        json.put("statusText", "OK");
        json.put("timestamp", Instant.now());
        return mapper.readTree(json.toString());
    }
}
