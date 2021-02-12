package com.movecatalog.cerattiandre.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "genre")
public class Genre implements Serializable {
	
	private static final long serialVersionUID = -2713564151631990491L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator"
			)
	String id;
	
	@ManyToMany(mappedBy = "genres")
	List<Movie> name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Movie> getName() {
		return name;
	}

	public void setName(List<Movie> name) {
		this.name = name;
	}

	
}
