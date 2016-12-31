package org.skywind;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * Author: Sergey Saiyan sergey.sova42@gmail.com
 * Created at: 9/27/16.
 */
public class Completed {

    public static void main(String[] args) throws IOException {
        try (InputStream is = Completed.class.getResourceAsStream("/completed.csv")) {
            IOUtils.readLines(is, "utf-8")
                    .stream()
                    .filter(s -> !s.isEmpty())
                    .map(s -> format(s.split(";")))
                    .forEach(System.out::println);
        }
    }

    private static String format(String[] parts) {
        String author = parts[0];
        String title = parts[1];
        String date = parts.length == 3 ? parts[2] : "";
        if (!date.isEmpty()) {
            String[] dateParts = date.split("\\s+");
            date = "20" + dateParts[dateParts.length - 1];
        }

        return "      " + String.format("%1$-16s", author) + "   " + String.format("%1$-40s", title) + "   " + date;
    }
}
