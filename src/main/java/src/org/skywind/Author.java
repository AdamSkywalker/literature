package src.org.skywind;

import static java.lang.Math.sqrt;

/**
 * Created by sergey on 28.02.16.
 */
public class Author implements Comparable<Author> {

    private int birthYear;
    private Integer deathYear;

    private String name;
    private String country;

    private long googleSearchResultCount;
    private long googleSearchResultCountPerson;

    public Author(String name, int birthYear, Integer deathYear, String country, int googleSearchResultCount, int googleSearchResultCountPerson) {
        this.birthYear = birthYear;
        this.deathYear = deathYear;
        this.name = name;
        this.country = country;
        this.googleSearchResultCount = googleSearchResultCount;
        this.googleSearchResultCountPerson = googleSearchResultCountPerson;
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

    public long getGoogleSearchResultCount() {
        return googleSearchResultCount;
    }

    public long getGoogleSearchResultCountPerson() {
        return googleSearchResultCountPerson;
    }

    @Override
    public String toString() {
        String r = String.format("%08d", new Double((getRating() * 100)).intValue());

        String n = String.format("%1$-16s", name);
        String c = String.format("%1$-12s", country);
        return "    " + r + "   " + n + "   " + c;
    }

    public Double getRating() {
        double ageK = (21L - birthYear / 100);
        //double ratingK = googleSearchResultCount;
        double s = 0.0000001 * googleSearchResultCount;
        double p = 0.001 * googleSearchResultCountPerson;
        double ratingK = 0.00001 * sqrt(s) * p * p;
        return smoothRanking(ageK) * ratingK;
    }

    protected static double smoothRanking(double rating) {
        return 8 * rating / (rating + 1.5);
    }

    @Override
    public int compareTo(Author o) {
        return Double.compare(o.getRating(), getRating());
    }
}
