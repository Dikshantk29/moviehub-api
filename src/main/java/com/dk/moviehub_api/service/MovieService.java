package com.dk.moviehub_api.service;

import com.dk.moviehub_api.entity.Movie;
import com.dk.moviehub_api.repository.MovieRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.DoubleUnaryOperator;

@Service
public class MovieService {
    private final MovieRepo movieRepo;

    public MovieService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    public List<Movie> getAllMovies() {
        return movieRepo.getAllMovies();
    }


    public Movie getMovieById(Long id) {
        return movieRepo.getMovieById(id);
    }

    public Movie addMovie(Movie movie) {
        return movieRepo.saveMovie(movie);
    }

    public List<Movie> searchByName(String name) {
        return movieRepo.searchByName(name);
    }

    public List<Movie> searchByYear(Integer year) {
        return movieRepo.searchByYear(year);
    }
    public List<Movie> searchByRating(Double rating) {
        return movieRepo.searchByRating(rating);
    }

    public Movie deleteMovie(Long id){
        return movieRepo.deleteMovie(id);
    }

}
