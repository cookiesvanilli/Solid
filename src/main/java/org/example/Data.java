package org.example;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class Data {
    public static final Data data = new Data();
    private static final Map<String, Integer> products = Map.ofEntries(
            entry("Хлеб", 56),
            entry("Масло", 153),
            entry("Колбаса", 211),
            entry("Пирожок", 45)
    );

    public Map<String, Integer> getProducts() {
        return new HashMap<>(products);
    }

    public Data() {
    }

    public static Data getInstance() {
        return data;
    }
}
