package org.japprove.examples;

import java.util.ArrayList;
import java.util.List;

public class StringFormatter {

    public static List<String> format(List<String> strings) {
        List<String> formattedStrings = new ArrayList<>();
        for (String s : strings) {
            s = s.trim();
            s = s.toLowerCase();
            s = s.substring(0, 1).toUpperCase() + s.substring(1);
            formattedStrings.add(s);
        }
        return formattedStrings;
    }
}
