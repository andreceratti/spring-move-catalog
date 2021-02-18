package com.movecatalog.cerattiandre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movecatalog.cerattiandre.model.Genre;

public interface GenresRepository extends JpaRepository<Genre, String> {
	
	Genre findByGenre(String genre);
}
