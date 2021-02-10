package com.movecatalog.cerattiandre.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
public class Movie {
	
	@Column(nullable = true)
	String backdrop;
	@Column(nullable = false)
	String[] cast;
	@Column(nullable = false)
	String classification;
	@Column(nullable = false)
	String director;
	@Column(nullable = false)
	String[] genres;
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator"
			)
	@Column(nullable = false)
	String id;
	@Column(nullable = false)
	float imdb_rating;
	@Column(nullable = false)
	String length;
	@Column(nullable = false)
	String overview;
	@Column(nullable = false)
	Date released_on;
	@Column(nullable = false)
	String slug; // External ID key;
	@Column(nullable = false)
	String poster; // Poster URL
	@Column(nullable = false)
	String title; // Movie's title
	
		
}
