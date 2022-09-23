package com.movie.movieratingservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {
	@Autowired
	RatingRepo repo;
	
	public List<Rating> getMovieRatingsOfUser(String userId) {
		List<Rating> rating=repo.findByUserId(userId);
		return rating;
	}

	public RatingsList getRatingOfMovie(String movieId) {
		RatingsList ratList=new RatingsList();
		ratList.setRatings(repo.findByMovieId(movieId));
		return ratList;
	}

}
