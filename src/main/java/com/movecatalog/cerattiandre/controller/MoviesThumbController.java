package com.movecatalog.cerattiandre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movecatalog.cerattiandre.model.MovieThumb;
import com.movecatalog.cerattiandre.repository.MovieThumbRepository;

@RestController
@RequestMapping("/movies")
public class MoviesThumbController {
	
	@Autowired
	private MovieThumbRepository movieThumbRepository;
	
	@GetMapping
	public List<MovieThumb> list() {
		return movieThumbRepository.findAll();
	}
}
