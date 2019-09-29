package org.skywind;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Author: Sergey Saiyan sergey.sova42@gmail.com
 * Created at: 9/27/16.
 */
public class Completed {

    public static void main(String[] args) throws IOException {
        try (InputStream is = Completed.class.getResourceAsStream("/completed.csv")) {
            IOUtils.readLines(is, "utf-8")
                    .stream()
                    //.filter(s -> !s.isEmpty())
                    .map(Formatter::format)
                    .forEach(System.out::println);
        }
    }
}
