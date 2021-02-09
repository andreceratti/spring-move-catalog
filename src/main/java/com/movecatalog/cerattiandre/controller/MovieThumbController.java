package com.movecatalog.cerattiandre.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.movecatalog.cerattiandre.model.MovieThumb;
import com.movecatalog.cerattiandre.repository.MovieThumbRepository;

@RestController
@RequestMapping("/movie")
public class MovieThumbController {
	
	@Autowired
	private MovieThumbRepository movieThumbRepository;
	
	@GetMapping
	public Optional<MovieThumb> find(@RequestBody MovieThumb request) {
		String id = request.getSlug();
		Optional<MovieThumb> movieThumb = movieThumbRepository.findById(id);
		return movieThumb;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public MovieThumb save(@RequestBody MovieThumb movieThumb) {
		return movieThumbRepository.save(movieThumb);
	}

}
