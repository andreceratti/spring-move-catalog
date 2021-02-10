package com.movecatalog.cerattiandre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.movecatalog.cerattiandre.model.Genre;

public interface GenresRepository extends JpaRepository<Genre, String> {
	
	Genre findByName(String name);
}
