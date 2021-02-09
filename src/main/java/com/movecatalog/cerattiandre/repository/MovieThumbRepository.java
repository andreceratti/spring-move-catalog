package com.movecatalog.cerattiandre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movecatalog.cerattiandre.model.MovieThumb;

@Repository
public interface MovieThumbRepository extends JpaRepository<MovieThumb, String>{

}
