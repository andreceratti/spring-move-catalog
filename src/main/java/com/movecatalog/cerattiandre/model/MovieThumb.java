package com.movecatalog.cerattiandre.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class MovieThumb {
	
	@Id
	String slug; // External ID key;
	@Column(nullable = true)
	String poster; // Poster URL
	@Column(nullable = false)
	String title; // Movie's title
	
		
}
