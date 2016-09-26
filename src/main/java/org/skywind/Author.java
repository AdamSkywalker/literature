package org.skywind;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by sergey on 28.02.16.
 */
public class Author implements Comparable<Author> {

    private int birthYear;
    private Integer deathYear;

    private String name;
    private String country;

    private double googleSearchResultCount;
    private double googleSearchResultCountPerson;

    private Double goodReadingRating;

    @JsonIgnore
    private Rating rating;

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

    public double getGoogleSearchResultCount() {
        return googleSearchResultCount;
    }

    public double getGoogleSearchResultCountPerson() {
        return googleSearchResultCountPerson;
    }

    public Double getGoodReadingRating() {
        return goodReadingRating;
    }

    @Override
    public String toString() {
        String total = String.format("%04d", new Double((getRating() * 10)).intValue());

        String authorName = String.format("%1$-24s", name);
        String authorCountry = String.format("%1$-16s", country);

        boolean bc = birthYear < 0;
        String by = padRight(String.valueOf(Math.abs(birthYear)), 4).replace(" ", ".");
        String dy = deathYear != null ? padLeft(String.valueOf(Math.abs(deathYear)), 4).replace(" ", ".") : "    ";

        String dates = String.format("%s..%s %s",
                by, dy,
                bc ? "B.C." : "    "
        );

        Rating r = this.rating;
        String numbers = padLeft(r.search, 2) + " " + padLeft(r.person, 2) + " " + padLeft(r.gr, 2);

        String SPACE = "   ";

        return "    " + total + SPACE + authorName + SPACE + dates + SPACE + authorCountry + SPACE + numbers;
    }

    @JsonIgnore
    public Double getRating() {
        //double ageK = (2100L - birthYear);
        double k = rating.getRating();

        return k;
    }

    public void setRating(Rating r) {
        this.rating = r;
    }

    protected static double smoothRanking(double x) {
        return 10 * x / (x + 100);
    }

    @Override
    public int compareTo(Author o) {
        return Double.compare(o.getRating(), getRating());
    }

    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }

    public static String padLeft(String s, int n) {
        return String.format("%1$" + n + "s", s);
    }

    public static String padLeft(int s, int n) {
        return String.format("%1$" + n + "s", s);
    }
}
