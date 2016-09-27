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
                    .map(s -> s.split(";"))
                    .map(a -> format(a[0], a[1]))
                    .forEach(System.out::println);
        }
    }

    private static String format(String author, String title) {
        return "      " + String.format("%1$-16s", author) + "   " + title;
    }
}
