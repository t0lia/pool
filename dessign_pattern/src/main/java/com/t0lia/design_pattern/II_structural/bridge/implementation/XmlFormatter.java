package com.t0lia.design_pattern.II_structural.bridge.implementation;

import com.t0lia.design_pattern.II_structural.bridge.abstraction.Formatter;

import java.util.Map;

import static java.util.stream.Collectors.joining;

public class XmlFormatter implements Formatter {
    @Override
    public String format(String objectName, String id,Map<String, String> details) {
        String xmlDetails = details.entrySet().stream()
                .map(entry -> String.format("\t<%s>%s</%s>", entry.getKey(), entry.getValue(), entry.getKey()))
                .collect(joining("\n"));
        return String.format("<%s id=%s>\n%s\n</%s>", objectName, id, xmlDetails, objectName);
    }
}
