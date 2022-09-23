package io.fluffy.movieinfoservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	@Autowired
	MovieRepo repo;
	
	public Movie getMovieInfo(String movieId) {
		return repo.findById(movieId).get();
	}

	public Movie getMoviesInfoByName(String movieName) {
		return repo.findByMovieName(movieName).get();
	}
	
	public List<Movie> getAllMovies(){
        List<Movie> movie = new ArrayList<>();
        repo.findAll().forEach(movie::add);
        return movie;
    }

}
