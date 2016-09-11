package org.skywind;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.text.DecimalFormat;
import java.text.NumberFormat;

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

        String n = String.format("%1$-24s", name);
        String c = String.format("%1$-16s", country);
        NumberFormat formatter = new DecimalFormat("#0.0");
        Rating r = this.rating;
        String numbers = formatter.format(r.getRating()) + " " + r.search + " " + r.person + " " + r.gr;

        return "    " + total + "   " + n + "   " + c + " " + numbers;
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
}
