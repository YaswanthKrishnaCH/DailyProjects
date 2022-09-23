package com.movie.movieratingservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/rating")
public class RatingController {

	@Autowired
	RatingService service;
	
	@RequestMapping("/user/{userId}")
	public List<Rating> getMovieRatingsOfUser(@PathVariable String userId) {
		return service.getMovieRatingsOfUser(userId);
		
	}
	
	
	@RequestMapping("/movie/{movieId}")
	public RatingsList getRatingOfMovie(@PathVariable String movieId) {
		return service.getRatingOfMovie(movieId);
		
	}
}
