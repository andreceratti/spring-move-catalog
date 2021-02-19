package com.movecatalog.cerattiandre.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name = "movie")
@JsonIgnoreProperties("inspection")
public class Movie {
	
	@Column(nullable = true)
	String backdrop;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name = "movie_cast", joinColumns = {@JoinColumn(name = "movie_id")},
		inverseJoinColumns = {@JoinColumn(name = "cast_id")})
	@JsonBackReference()
	List<Cast> cast;
	
	@Column(nullable = false)
	String classification;
	
	@Column(nullable = false)
	String director;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name = "movie_genre", joinColumns = {@JoinColumn(name = "movie_id")},
		inverseJoinColumns = {@JoinColumn(name = "genre_id")})
	@Column(nullable = false)
	@JsonBackReference(value="genreReference")
	List<Genre> genres;
	
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
	String slug;
	
	@Column(nullable = false)
	String poster;
	
	@Column(nullable = false)
	String title;
	
	public Movie() {
		
	}
	
	
	
}
