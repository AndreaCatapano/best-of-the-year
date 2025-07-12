package org.lessons.java.best_of_the_year.classes;

import java.io.Serializable;

public class Movie implements Serializable {
    private int id;
    private String name;
    private String slug;

    public Movie() {
    }

    public Movie(int id, String name) {
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
