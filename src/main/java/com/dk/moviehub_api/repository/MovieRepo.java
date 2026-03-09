package com.dk.moviehub_api.repository;

import com.dk.moviehub_api.entity.Movie;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class MovieRepo {
    private final Map<Long, Movie> movieDb = new HashMap<>();

    public MovieRepo() {
        System.out.println("Default MovieRepository");
    }

    @PostConstruct
    public void loadDummyData() {
        System.out.println("Loading Dummy Data....");
        movieDb.put(1L, new Movie(1L, "KGF", "Action", 9.8, 2022, "Hindi"));
        movieDb.put(2L, new Movie(2L, "RRR", "Action", 9.5, 2022, "Telugu"));
        movieDb.put(3L, new Movie(3L, "Pushpa", "Action", 9.2, 2021, "Telugu"));
        movieDb.put(4L, new Movie(4L, "Bahubali", "Epic", 9.7, 2015, "Telugu"));
        movieDb.put(5L, new Movie(5L, "Dangal", "Drama", 9.3, 2016, "Hindi"));
        movieDb.put(6L, new Movie(6L, "3 Idiots", "Comedy", 9.4, 2009, "Hindi"));
        movieDb.put(7L, new Movie(7L, "Pathaan", "Action", 8.9, 2023, "Hindi"));
        movieDb.put(8L, new Movie(8L, "Jawan", "Action", 9.0, 2023, "Hindi"));
        movieDb.put(9L, new Movie(9L, "Kantara", "Thriller", 9.1, 2022, "Kannada"));
        movieDb.put(10L, new Movie(10L, "Vikram", "Action", 9.2, 2022, "Tamil"));
        movieDb.put(11L, new Movie(11L, "Leo", "Action", 8.8, 2023, "Tamil"));
        movieDb.put(12L, new Movie(12L, "Drishyam", "Thriller", 9.3, 2015, "Hindi"));
        movieDb.put(13L, new Movie(13L, "Drishyam 2", "Thriller", 9.1, 2022, "Hindi"));
        movieDb.put(14L, new Movie(14L, "War", "Action", 8.7, 2019, "Hindi"));
        movieDb.put(15L, new Movie(15L, "Tiger Zinda Hai", "Action", 8.6, 2017, "Hindi"));
        movieDb.put(16L, new Movie(16L, "PK", "Comedy", 9.0, 2014, "Hindi"));
        movieDb.put(17L, new Movie(17L, "Lagaan", "Drama", 9.4, 2001, "Hindi"));
        movieDb.put(18L, new Movie(18L, "Article 15", "Crime", 8.9, 2019, "Hindi"));
        movieDb.put(19L, new Movie(19L, "Andhadhun", "Thriller", 9.2, 2018, "Hindi"));
        movieDb.put(20L, new Movie(20L, "Gully Boy", "Drama", 8.8, 2019, "Hindi"));
        movieDb.put(21L, new Movie(21L, "Master", "Action", 8.7, 2021, "Tamil"));
        movieDb.put(22L, new Movie(22L, "Kaithi", "Action", 9.0, 2019, "Tamil"));
        movieDb.put(23L, new Movie(23L, "Jailer", "Action", 8.9, 2023, "Tamil"));
        movieDb.put(24L, new Movie(24L, "Sivaji", "Action", 8.8, 2007, "Tamil"));
        movieDb.put(25L, new Movie(25L, "Robot", "Sci-Fi", 9.1, 2010, "Tamil"));
        movieDb.put(26L, new Movie(26L, "Ala Vaikunthapurramuloo", "Drama", 8.9, 2020, "Telugu"));
        movieDb.put(27L, new Movie(27L, "Arjun Reddy", "Drama", 8.8, 2017, "Telugu"));
        movieDb.put(28L, new Movie(28L, "Eega", "Fantasy", 9.0, 2012, "Telugu"));
        movieDb.put(29L, new Movie(29L, "Magadheera", "Action", 9.1, 2009, "Telugu"));
        movieDb.put(30L, new Movie(30L, "Sye", "Sports", 8.7, 2004, "Telugu"));
        movieDb.put(31L, new Movie(31L, "Lucifer", "Action", 8.9, 2019, "Malayalam"));
        movieDb.put(32L, new Movie(32L, "Premam", "Romance", 9.0, 2015, "Malayalam"));
        movieDb.put(33L, new Movie(33L, "Bangalore Days", "Drama", 8.8, 2014, "Malayalam"));
        movieDb.put(34L, new Movie(34L, "Kumbalangi Nights", "Drama", 9.2, 2019, "Malayalam"));
        movieDb.put(35L, new Movie(35L, "Minnal Murali", "Superhero", 8.9, 2021, "Malayalam"));
        movieDb.put(36L, new Movie(36L, "KGF Chapter 2", "Action", 9.6, 2022, "Kannada"));

    }

    public List<Movie> getAllMovies() {
        return new ArrayList<>(movieDb.values());
    }

    public Movie getMovieById(Long id) {
        return movieDb.get(id);
    }

    public Movie saveMovie(Movie movie) {
        movieDb.put(movie.getId(), movie);
        return movie;
    }

    public List<Movie> searchByName(String name) {
        return movieDb.values().stream().filter(movie -> movie.getName() != null && movie.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }

    public List<Movie> searchByYear(Integer year) {
        return movieDb.values().stream()
                .filter(movie -> movie.getYear().equals(year)).collect(Collectors.toList());
    }

    public List<Movie> searchByRating(Double rating) {
        return movieDb.values().stream()
                .filter(movie -> movie.getRating().equals(rating)).collect(Collectors.toList());
    }

    public Movie deleteMovie(Long id) {
        return movieDb.remove(id);
    }
}
