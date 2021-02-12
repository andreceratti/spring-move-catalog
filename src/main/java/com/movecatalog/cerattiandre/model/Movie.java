package com.movecatalog.cerattiandre.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "movie")
public class Movie  implements Serializable {
	
	@Column(nullable = true)
	String backdrop;
	
	@ManyToMany
	@JoinTable(name = "movie_cast", joinColumns = {@JoinColumn(name = "movie_id")},
		inverseJoinColumns = {@JoinColumn(name = "cast_id")})
	List<Cast> cast;
	
	@Column(nullable = false)
	String classification;
	
	@Column(nullable = false)
	String director;
	
	@ManyToMany
	@JoinTable(name = "movie_genre", joinColumns = {@JoinColumn(name = "movie_id")},
		inverseJoinColumns = {@JoinColumn(name = "genre_id")})
	@Column(nullable = false)
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

	public String getBackdrop() {
		return backdrop;
	}

	public void setBackdrop(String backdrop) {
		this.backdrop = backdrop;
	}

	public List<Cast> getCast() {
		return cast;
	}

	public void setCast(List<Cast> cast) {
		this.cast = cast;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getImdb_rating() {
		return imdb_rating;
	}

	public void setImdb_rating(float imdb_rating) {
		this.imdb_rating = imdb_rating;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public Date getReleased_on() {
		return released_on;
	}

	public void setReleased_on(Date released_on) {
		this.released_on = released_on;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
