package org.skywind;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Author: Sergey Saiyan sergey.sova42@gmail.com
 * Created at 29/09/2019.
 */
public class Formatter {

    private static String prefix = "      ";

    public static String format(String line) {


        if (line.isEmpty()) {
            int separatorLength = 76;
            String sep = IntStream.range(0, separatorLength).mapToObj(x -> "=").collect(Collectors.joining(""));
            return "\n" + prefix + sep + "\n";
        }

        BookInfo info = new BookInfo(line);

        if (!info.date.isEmpty()) {
            String[] dateParts = info.date.split("\\s+");
            info.date = "20" + dateParts[dateParts.length - 1];
        }

        return format(info, true);
    }

    public static String format(BookInfo info, boolean withDate) {
        return prefix + String.format("%1$-20s", info.author) + "   " +
                String.format("%1$-50s", info.title) +
                (withDate ? "   " + info.date : "");
    }
}
