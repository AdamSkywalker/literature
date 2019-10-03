package org.skywind;

/**
 * Author: Sergey Saiyan sergey.sova42@gmail.com
 * Created at 29/09/2019.
 */
public class BookInfo {

    public enum State {
        DONE,
        IN_PROGRESS,
        TODO
    }

    String author;
    String title;
    String score;
    String date;
    State state;

    public BookInfo(String line) {
        String[] parts = line.split(";");

        this.author = parts[0];
        this.title = parts[1];
        this.score =  parts.length > 2 ? parts[2] : "";
        this.date = parts.length > 3 ? parts[3] : "";
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
