package com.t0lia.design_pattern.II_structural.bridge.abstraction;

import java.util.Map;

public interface Formatter {
    String format(String objectName, String id, Map<String, String> details);
}
