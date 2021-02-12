package com.movecatalog.cerattiandre.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.movecatalog.cerattiandre.model.Genre;
import com.movecatalog.cerattiandre.model.Movie;
import com.movecatalog.cerattiandre.repository.GenresRepository;
import com.movecatalog.cerattiandre.repository.MovieRepository;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private GenresRepository genresRepository;
	
	@GetMapping
	public Optional<Movie> find(@RequestBody Movie request) {
		String id = request.getId();
		Optional<Movie> movieThumb = movieRepository.findById(id);
		return movieThumb;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Movie save(@RequestBody Movie request) {
//		for (String genre: request.getGenres()) {
//			if (genresRepository.findByName(genre) == null) {
//				Genre newGenre = new Genre();
//				newGenre.setName(genre);
//				genresRepository.save(newGenre);
//			}
//		}
		Movie movie = request;
		return movieRepository.save(movie);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void delete(@RequestBody Movie request) {
		String id = request.getId();
		movieRepository.deleteById(id);
	}

}
