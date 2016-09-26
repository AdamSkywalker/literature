package org.skywind;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static int SIZE;

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        try (InputStream is = App.class.getResourceAsStream("/authors.json")) {
            List<Author> authors = mapper.readValue(is, new TypeReference<List<Author>>() {
            });
            authors = authors.stream()
                    .filter(a -> a.getBirthYear() > 1780)
                    .filter(a -> a.getDeathYear() != null && a.getDeathYear() < 1950)
                    .collect(Collectors.toList());

            SIZE = authors.size();
            authors.stream().forEach(author -> {
                Ratings.INSTANCE.addSearch(author.getGoogleSearchResultCount());
                Ratings.INSTANCE.addPerson(author.getGoogleSearchResultCountPerson());
                Ratings.INSTANCE.addGoodReading(author.getGoodReadingRating());
            });
            Ratings.INSTANCE.init();
            authors.stream().forEach(author -> author.setRating(new Rating()
                    .setSearch(Ratings.INSTANCE.getSearch(author.getGoogleSearchResultCount()))
                    .setPerson(Ratings.INSTANCE.getPerson(author.getGoogleSearchResultCountPerson()))
                    .setGr(Ratings.INSTANCE.getGR(author.getGoodReadingRating()))));

            authors.stream().sorted().forEach(System.out::println);
        }
    }
}
