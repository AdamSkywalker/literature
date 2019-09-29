package org.skywind;

        import org.apache.commons.io.IOUtils;

        import java.io.IOException;
        import java.util.ArrayList;
        import java.util.Calendar;
        import java.util.List;

/**
 * Author: Sergey Saiyan sergey.sova42@gmail.com
 * Created at 29/09/2019.
 */
public class ReadMe {

    public static void main(String[] args) throws IOException {
        List<String> lines = IOUtils.readLines(ReadMe.class.getResourceAsStream("/completed.csv"));
        List<BookInfo> bookInfos = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        sb.append("Последние прочитанные книги:\n");
        sb.append("--\n\n");

        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).trim().isEmpty()) {
                for (int j = i - 10; j < i; j++) {
                    sb.append(Formatter.format(bookInfos.get(j), false)).append("\n");
                }
                break;
            } else {
                bookInfos.add(new BookInfo(lines.get(i)));
            }
        }

        sb.append("\n\n");

        String term = ("" + Calendar.getInstance().get(Calendar.YEAR)).substring(2);
        long cnt = lines.stream().filter(l -> l.contains(term)).count();
        sb.append("Прочитано в этом году: ").append(cnt).append("\n");
        sb.append("--\n\n");


        sb.append("Рекоммендую:\n");
        sb.append("--\n\n");

        bookInfos.stream().filter(i -> "2".equals(i.score)).forEach(book -> {
            sb.append(Formatter.format(book, false));
            sb.append("\n");
        });

        System.out.println(sb.toString());
    }
}
