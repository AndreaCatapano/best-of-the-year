package org.lessons.java.best_of_the_year.controller;

import java.util.ArrayList;
import java.util.List;

import org.lessons.java.best_of_the_year.classes.Movie;
import org.lessons.java.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
@Controller
public class BestOfTheYearController {

    @GetMapping("/")
    public String home(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        model.addAttribute("songs", getBestSongs());
        return "songs";
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        model.addAttribute("movies", getBestMovies());
        return "movies";
    }

    private List<Movie> getBestMovies() {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie(1, "Il signore degli Anelli"));
        movieList.add(new Movie(2, "Harry potter"));
        return movieList;
    }

    private List<Song> getBestSongs() {
        List<Song> songList = new ArrayList<>();
        songList.add(new Song(1, "Not Like Us"));
        songList.add(new Song(2, "A Bar Song"));

        return songList;
    }
}
