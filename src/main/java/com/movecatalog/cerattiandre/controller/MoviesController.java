package com.movecatalog.cerattiandre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movecatalog.cerattiandre.model.Movie;
import com.movecatalog.cerattiandre.repository.MovieRepository;

@RestController
@RequestMapping("/movies")
public class MoviesController {
	
	@Autowired
	private MovieRepository movieThumbRepository;
	
	@GetMapping
	public List<Movie> list() {
		return movieThumbRepository.findAll();
	}
}
