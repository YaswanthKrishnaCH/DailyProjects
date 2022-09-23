package io.fluffy.movieinfoservice;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepo extends CrudRepository<Movie,String> {

	Optional<Movie> findByMovieName(String movieName);

}
