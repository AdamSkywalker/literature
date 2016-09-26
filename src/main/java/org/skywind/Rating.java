package org.skywind;

/**
 * Author: Sergey Saiyan sergey.sova42@gmail.com
 * Created at: 9/11/16.
 */
public class Rating {

    int search;
    int person;
    int gr;

    public Rating setSearch(int search) {
        this.search = search;
        return this;
    }

    public Rating setPerson(int person) {
        this.person = person;
        return this;
    }

    public Rating setGr(int gr) {
        this.gr = gr;
        return this;
    }

    public double getRating() {
        return 0.99 * (App.SIZE - search) +
                0.99 * (App.SIZE - person) +
                1.99 * (App.SIZE - gr);
    }
}
