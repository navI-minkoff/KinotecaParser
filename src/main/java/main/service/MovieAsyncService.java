package main.service;

import main.entity.Movie;

import java.util.List;

public interface MovieAsyncService {

    void saveIfNotSaved(List<Movie> movieList);

    void saveIfNotSaved(Movie movie);
}