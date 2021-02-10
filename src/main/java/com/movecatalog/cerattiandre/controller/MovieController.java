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
		Optional<Movie> movieThumb = movieRepository.findById(id);
		return movieThumb;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Movie save(@RequestBody Movie request) {
		System.out.println(request.getCast());
		return movieRepository.save(request);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void delete(@RequestBody Movie request) {
		String id = request.getId();
		movieRepository.deleteById(id);
	}

}
