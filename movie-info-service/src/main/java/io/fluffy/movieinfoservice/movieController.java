package io.fluffy.movieinfoservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/movie")
public class movieController {
	@Autowired
	MovieService service;
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId) {
		return service.getMovieInfo(movieId);
	}
	@RequestMapping("/name/{movieName}")
	public Movie getMoviesInfoByName(@PathVariable String movieName) {
		return service.getMoviesInfoByName(movieName);
	}
	
	@GetMapping("/getall")
    public List<Movie> movieRating() {
        return service.getAllMovies();
    }

}
