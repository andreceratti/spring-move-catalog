package com.movecatalog.cerattiandre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movecatalog.cerattiandre.model.Cast;

public interface CastRepository extends JpaRepository<Cast, String> {
	
	Cast findByName(String name);

}
