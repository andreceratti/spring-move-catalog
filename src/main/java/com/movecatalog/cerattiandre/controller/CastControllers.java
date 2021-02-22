package com.movecatalog.cerattiandre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movecatalog.cerattiandre.model.Cast;
import com.movecatalog.cerattiandre.repository.CastRepository;

@RestController
@RequestMapping("/cast")
public class CastControllers {
	
	@Autowired
	private CastRepository castRepository;
	
	@GetMapping
	public List<Cast> list(){
		return castRepository.findAll();
	}
	
	@PostMapping
	public Cast save(@RequestBody Cast request) {
		return castRepository.save(request);
	}

}
