package io.fluffy.moviecatalogservice;

import java.io.Serializable;
import java.util.Objects;

public class RatingKey implements Serializable{
	private String userId;
	private String movieId;
	public RatingKey() {
		
	}
	
	public RatingKey(String userId, String movieId) {
		super();
		this.userId = userId;
		this.movieId = movieId;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(movieId, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RatingKey other = (RatingKey) obj;
		return Objects.equals(movieId, other.movieId) && Objects.equals(userId, other.userId);
	}
	

}
