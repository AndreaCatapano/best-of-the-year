package org.lessons.java.best_of_the_year.controller;

import java.util.ArrayList;
import java.util.List;

import org.lessons.java.best_of_the_year.classes.Movie;
import org.lessons.java.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
@Controller
public class BestOfTheYearController {

    @GetMapping("/")
    public String home(@RequestParam(name = "name", required = false) String name, Model model) {
        String displayName = (name != null && !name.trim().isEmpty()) ? name : "Admin";
        model.addAttribute("name", displayName);
        return "index";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        model.addAttribute("songs", getBestSongs());
        return "songs";
    }

    @GetMapping("/song/{slug}")
    public String songBySlug(@PathVariable String slug, Model model) {
        List<Song> allSongs = getBestSongs();
        Song foundSong = null;

        for (Song song : allSongs) {
            if (slug.equals(song.getSlug())) {
                foundSong = song;
                break;
            }
        }

        if (foundSong != null) {
            model.addAttribute("song", foundSong);
            return "song-detail";
        }

        return "page404";
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        model.addAttribute("movies", getBestMovies());
        return "movies";
    }

    @GetMapping("/movie/{slug}")
    public String movieBySlug(@PathVariable String slug, Model model) {
        List<Movie> allMovie = getBestMovies();
        Movie foundMovie = null;

        for (Movie song : allMovie) {
            if (slug.equals(song.getSlug())) {
                foundMovie = song;
                break;
            }
        }

        if (foundMovie != null) {
            model.addAttribute("movie", foundMovie);
            return "movie-detail";
        }

        return "page404";
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
