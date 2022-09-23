package com.project.SecurityServer;

public class CatalogItem {
	private String movieName;
	private String movieGenre;
	private double rating;
	public CatalogItem() {
		
	}
	public CatalogItem(String movieName, String movieGenre, double rating) {
		super();
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.rating = rating;
	}
	
	
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	

}
