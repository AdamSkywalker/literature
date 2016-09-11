package org.skywind;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream is = App.class.getResourceAsStream("/authors.json");
        List<Author> authors = mapper.readValue(is, new TypeReference<List<Author>>() {
        });
        authors.stream().sorted().forEach(System.out::println);
    }
}
