package com.project.SecurityServer;



public class Movie {
	private String movieId;
	private String movieGenre;
	private String movieName;
	
	public Movie() {
		
	}
	public Movie(String movieId, String movieName,String movieGenre) {
		super();
		this.movieId = movieId;
		this.movieGenre=movieGenre;
		this.movieName = movieName;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
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
	

}
