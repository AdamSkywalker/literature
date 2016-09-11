package src.org.skywind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {
        List<Author> authors = readAuthors();
        authors.stream().sorted().forEach(a -> System.out.println(a.toString()));
    }

    private static List<Author> readAuthors() throws IOException {
        InputStream is = App.class.getResourceAsStream("/authors.ru.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        List<Author> authors = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            if (line.isEmpty()) continue;

            String[] parts = line.split(";");
            try {
                authors.add(
                        new Author(
                                parts[0],
                                Integer.valueOf(parts[1]),
                                ("null".equals(parts[2]) ? null : Integer.parseInt(parts[2])),
                                parts[3],
                                Integer.parseInt(parts[4].replaceAll("_", "")),
                                Integer.parseInt(parts[5].replaceAll("_", ""))
                        ));
            } catch (Exception e) {
                System.out.println(line);
                throw e;
            }
        }

        return authors;
    }
}
