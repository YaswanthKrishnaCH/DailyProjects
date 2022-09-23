package com.project.SecurityServer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//@CrossOrigin(origins="http://127.0.0.1:5500", allowedHeaders = "*", allowCredentials = "true")
@CrossOrigin(origins="http://127.0.0.1:5500", allowedHeaders = "*",allowCredentials = "true")
@RestController
public class SecurityController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/getAll")
    public List<Movie> getAllMovies(){
       return restTemplate.getForObject("http://movie-info-service/movie/getall",List.class);
    }
    
	
	@RequestMapping("/movies/{movieName}")//List<CatalogItem>
	public RatingsList getRatingsByMovieName(@PathVariable String movieName){
		return restTemplate.getForObject("http://movie-catalog-service/catalog/movies/"+movieName,RatingsList.class);
	}
	
	@RequestMapping("/movie/{movieId}")//List<CatalogItem>
	public CatalogItem getOverallRatingOfMovie(@PathVariable String movieId){
		return restTemplate.getForObject("http://movie-catalog-service/catalog/movie/"+movieId,CatalogItem.class);
		}
	
	@GetMapping("/user/{userId}")//List<CatalogItem>
	public List<Rating> getRatingOfUser(@PathVariable String userId){
		return restTemplate.getForObject("http://rating-service/rating/user/"+userId,List.class);
	}
}
