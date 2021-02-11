package com.movecatalog.cerattiandre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movecatalog.cerattiandre.model.Genre;
import com.movecatalog.cerattiandre.model.Movie;
import com.movecatalog.cerattiandre.repository.GenresRepository;
import com.movecatalog.cerattiandre.repository.MovieRepository;


@RestController
@RequestMapping("/searchByGenre")
public class SearchByGenreController {
	
	@Autowired
	private GenresRepository genreRepository;
	
	@Autowired
	private MovieRepository movieRepository;
	
	@GetMapping
	public List<Movie> list(@RequestParam(name = "genre") String request) {
		Genre genre = genreRepository.findByName(request);
		return movieRepository.listByGenre(genre.getName());

	}

}
