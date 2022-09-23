package io.fluffy.moviecatalogservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
	
	@Autowired
	RestTemplate restTemplate;
	
	
	
	@RequestMapping("/movie/{movieId}")//List<CatalogItem>
	public CatalogItem getRatingOfMovie(@PathVariable String movieId){
		RatingsList ratList=restTemplate.getForObject("http://rating-service/rating/movie/"+movieId,RatingsList.class);
		Movie movie= restTemplate.getForObject("http://movie-info-service/movie/" + ratList.getRatings().get(0).getMovieId(),Movie.class);
		double overallRating=ratList.getRatings().stream().map(Rating::getRating).reduce(0.0,(r1,r2)->r1+r2);
		return new CatalogItem( movie.getMovieName(),movie.getMovieGenre(),overallRating/ratList.getRatings().size());
	}
	
	@RequestMapping("/movies/{movieName}")//List<CatalogItem>
	public RatingsList getRatingsByMovieName(@PathVariable String movieName){
		Movie movie=restTemplate.getForObject("http://movie-info-service/movie/name/"+movieName,Movie.class);
		return restTemplate.getForObject("http://rating-service/rating/movie/"+movie.getMovieId(),RatingsList.class);
	}
	
	
	

}
