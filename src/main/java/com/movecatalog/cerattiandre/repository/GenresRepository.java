package com.movecatalog.cerattiandre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.movecatalog.cerattiandre.model.Genre;

public interface GenresRepository extends JpaRepository<Genre, String> {
	
//	@Query("FROM Movie WHERE genres LIKE %:name%")
//	List<Genre> findAllGenre(String genre);
}
