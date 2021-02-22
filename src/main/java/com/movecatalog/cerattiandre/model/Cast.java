package com.movecatalog.cerattiandre.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name = "fullcast")
public class Cast{
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator"
			)
	String id;
	
	@Column
	String name;
	
	@ManyToMany(mappedBy = "cast", cascade = CascadeType.PERSIST)
	List<Movie> movies;
	
	public Cast() {
		
	}

	
	
}
