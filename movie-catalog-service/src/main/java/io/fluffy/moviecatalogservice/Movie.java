package io.fluffy.moviecatalogservice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
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
		this.movieGenre =  movieGenre;;
	}
	

}
