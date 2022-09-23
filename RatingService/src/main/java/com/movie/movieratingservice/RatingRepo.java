package com.movie.movieratingservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RatingRepo extends CrudRepository<Rating, RatingKey>{

	public List<Rating> findByUserId(String userId);

	public List<Rating> findByMovieId(String movieId);

}
