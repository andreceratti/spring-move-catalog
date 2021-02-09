package com.movecatalog.cerattiandre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movecatalog.cerattiandre.model.Genre;
import com.movecatalog.cerattiandre.repository.GenresRepository;

@RestController
@RequestMapping("/genres")
public class GenresController {
	
	@Autowired
	private GenresRepository genreRepository;
	
	@GetMapping
	public List<Genre> list() {
		return genreRepository.findAll();
	}
	
	@PostMapping
	public Genre save(@RequestBody Genre request) {
		return genreRepository.save(request);
	}
}
