package org.skywind;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergey on 28.02.16.
 */
public class Author {

    private int birthYear;
    private Integer deathYear;

    private String name;
    private String country;

    private int googleSearchResultCount;

    public Author(String name, int birthYear, Integer deathYear, String country, int googleSearchResultCount) {
        this.birthYear = birthYear;
        this.deathYear = deathYear;
        this.name = name;
        this.country = country;
        this.googleSearchResultCount = googleSearchResultCount;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getGoogleSearchResultCount() {
        return googleSearchResultCount;
    }
}
