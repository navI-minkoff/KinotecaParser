package main.service;

import main.entity.Movie;

import java.util.List;

public interface MovieService {

    Movie getById(Long id);

    List<Movie> getByPage(int page, int limit);

    Movie getByName(String name);

    List<Movie> getByPageByName(int page, int limit, String name);
}
