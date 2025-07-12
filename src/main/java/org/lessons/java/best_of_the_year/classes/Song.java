package org.lessons.java.best_of_the_year.classes;

public class Song {
    private int id;
    private String name;
    private String slug;

    public Song() {
    }

    public Song(int id, String name) {
        this.id = id;
        this.name = name;
        this.slug = Utility.toSlug(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setSlug(String slug) {
        this.slug = slug;
    }
}
