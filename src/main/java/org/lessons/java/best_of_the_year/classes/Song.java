package org.lessons.java.best_of_the_year.classes;

public class Song {
    private int id;
    private String name;

    public Song() {
    }

    public Song(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
