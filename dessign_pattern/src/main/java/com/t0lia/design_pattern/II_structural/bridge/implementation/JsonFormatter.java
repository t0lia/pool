package com.t0lia.design_pattern.II_structural.bridge.implementation;

import com.t0lia.design_pattern.II_structural.bridge.abstraction.Formatter;

import java.util.Map;

import static java.util.stream.Collectors.joining;

public class JsonFormatter implements Formatter {
    @Override
    public String format(String objectName, String id,Map<String, String> details) {
        String jsonDetails = details.entrySet().stream()
                .map(entry -> String.format("\t\"%s\":\"%s\"",entry.getKey(), entry.getValue()))
                .collect(joining(",\n"));
        return String.format("\"%s\": {\n\t\"id\":\"%s\",\n%s\n}", objectName, id, jsonDetails);
    }
}
