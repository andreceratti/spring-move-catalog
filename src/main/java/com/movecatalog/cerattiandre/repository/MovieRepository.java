package com.movecatalog.cerattiandre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.movecatalog.cerattiandre.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String>{
	
	@Query("FROM Movie WHERE genres LIKE ?1")
	List<Movie> listByGenre(String genre);
}
