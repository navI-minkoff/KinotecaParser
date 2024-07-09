package main.service.implement;

import main.entity.Movie;
import main.repository.MovieRepository;
import main.service.MovieAsyncService;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class MovieAsyncServiceImplement implements MovieAsyncService {

    private MovieRepository movieRepository;

    @Async
    @Override
    public void saveIfNotSaved(List<Movie> movieList) {
        List<Long> movieIds = movieList.stream().map(Movie::getId).toList();
        List<Long> existingMovieIds = movieRepository.findByIdIn(movieIds).stream().map(Movie::getId).toList();
        List<Movie> moviesToSave = movieList.stream().filter(movie -> !existingMovieIds.contains(movie.getId())).toList();
        movieRepository.saveAll(moviesToSave);
    }

    @Async
    @Override
    public void saveIfNotSaved(Movie movie) {
        if (!movieRepository.existsById(movie.getId())) {
            movieRepository.save(movie);
        }
    }
}
