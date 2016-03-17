package org.skywind;

/**
 * Created by sergey on 28.02.16.
 */
public class Author implements Comparable<Author> {

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

    @Override
    public String toString() {
        return "Author{" +
                "birthYear=" + birthYear +
                ", deathYear=" + deathYear +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", googleSearchResultCount=" + googleSearchResultCount +
                ", rating=" + getRating().intValue() +
                '}';
    }

    public Double getRating() {
        double ageK = 21L - birthYear / 100;
        return smoothRanking(ageK) * googleSearchResultCount / 1000;
    }

    protected static double smoothRanking(double rating) {
        return 4 * rating / (rating + 1) - 1;
    }

    @Override
    public int compareTo(Author o) {
        return Double.compare(o.getRating(), getRating());
    }
}
