package com.movie.movieratingservice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(RatingKey.class)
public class Rating {
	@Id
	private String userId;
	@Id
	private String movieId;
	private double rating;
	public Rating() {
		
	}
	public Rating(String userId,String movieId ,double rating) {
		super();
		this.userId=userId;
		this.movieId = movieId;
		this.rating = rating;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	
	

}
