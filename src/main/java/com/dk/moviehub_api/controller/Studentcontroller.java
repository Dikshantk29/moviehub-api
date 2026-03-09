package com.dk.moviehub_api.controller;

import com.dk.moviehub_api.entity.Movie;
import com.dk.moviehub_api.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //restcontroller -- controller + response body
@RequestMapping("/movie")
public class Studentcontroller {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")//calling + binding
    public Movie getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

    @GetMapping(value = "/search", params = "name")
    public List<Movie> searchMovieByName(@RequestParam String name) {
        return movieService.searchByName(name);
    }

    @GetMapping(value = "/search", params = "year")
    public List<Movie> searchMovieByYear(@RequestParam Integer year) {
        return movieService.searchByYear(year);
    }

    @GetMapping(value = "/search", params = "rating")
    public List<Movie> searchByRating(@RequestParam Double rating) {
        return movieService.searchByRating(rating);
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

    @DeleteMapping("/{id}")
    public Movie deleteMovie(@PathVariable Long id){
        return movieService.deleteMovie(id);
    }

}
