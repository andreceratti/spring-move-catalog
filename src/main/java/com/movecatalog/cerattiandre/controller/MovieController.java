package com.movecatalog.cerattiandre.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.movecatalog.cerattiandre.model.Movie;
import com.movecatalog.cerattiandre.repository.MovieRepository;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@GetMapping
	public Optional<Movie> find(@RequestBody Movie request) {
		String id = request.getId();
		Optional<Movie> movie = movieRepository.findById(id);
		if (movie.isEmpty()) {
			throw new RuntimeException("Movie ID not found");
		}
		return movie;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Movie save(@RequestBody Movie request) {
		Movie movie = request;
		return movieRepository.save(movie);
	}
	
	@DeleteMapping("/del")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void delete(@RequestBody Movie request) {
		String id = request.getId();
		Optional<Movie> movie = movieRepository.findById(id);
		System.out.println(movie);
		if (movie.isEmpty() ) {
			throw new RuntimeException("Movie ID not found");
		}
		movieRepository.deleteById(id);
	}
	
	@GetMapping("/all")
	public List<Movie> list() {
		return movieRepository.findAll();
	}
	
	@PatchMapping
	public Movie alter(@RequestBody Movie request) {
		Optional<Movie> movie = movieRepository.findById(request.getId());
		if (movie.isEmpty()) {
			throw new RuntimeException("Movie ID not found");
		}
		return movieRepository.save(request);
		
	}
	
	

}
