package org.skywind;

import java.util.*;

/**
 * Author: Sergey Saiyan sergey.sova42@gmail.com
 * Created at: 9/11/16.
 */
public class Ratings {

    public static final Ratings INSTANCE = new Ratings();

    private Map<String, List<Double>> byType = new HashMap<>();

    private Ratings() {
        byType.put("search", new ArrayList<>());
        byType.put("person", new ArrayList<>());
        byType.put("gr", new ArrayList<>());
    }

    public void addSearch(double v) {
        byType.get("search").add(v);
    }

    public void addPerson(double v) {
        byType.get("person").add(v);
    }

    public void addGoodReading(Double v) {
        if (v == null) v = 3.8;
        byType.get("gr").add(v);
    }

    public void init() {
        for (Map.Entry<String, List<Double>> entry : byType.entrySet()) {
            Collections.sort(entry.getValue());
        }
    }

    public int getSearch(double v) {
        int pos = byType.get("search").indexOf(v);
        if (pos < 0) {
            throw new IllegalArgumentException();
        }
        return byType.get("search").size() - pos;
    }

    public int getPerson(double v) {
        int pos = byType.get("person").indexOf(v);
        if (pos < 0) {
            throw new IllegalArgumentException();
        }
        return byType.get("person").size() - pos;
    }

    public int getGR(Double v) {
        if (v == null) v = 3.8;
        int pos = byType.get("gr").indexOf(v);
        if (pos < 0) {
            throw new IllegalArgumentException();
        }
        return byType.get("gr").size() - pos;
    }
}
