package com.movecatalog.cerattiandre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movecatalog.cerattiandre.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String>{

}
