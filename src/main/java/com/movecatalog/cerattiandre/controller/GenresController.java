package com.movecatalog.cerattiandre.controller;

import java.util.List;
import java.util.Optional;

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
	
	@GetMapping("/all")
	public List<Genre> list() {
		return genreRepository.findAll();
	}
	
	@GetMapping
	public Optional<Genre> find(@RequestBody Genre request){
		Optional<Genre> genre = genreRepository.findById(request.getId());
		if (genre.isEmpty()) {
			throw new RuntimeException("ID not found");
		}
		return genre;
	}
	
	@PostMapping
	public Genre save(@RequestBody Genre request) {
		return genreRepository.save(request);
	}
	
	
	
}
