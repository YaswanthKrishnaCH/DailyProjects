package com.project.SecurityServer;

import java.util.List;

public class RatingsList {
	private List<Rating> ratings;
	public RatingsList() {
		
	}
	public RatingsList(List<Rating> ratings) {
		super();
		this.ratings = ratings;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	
	

}
