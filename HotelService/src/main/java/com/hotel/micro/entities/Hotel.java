package com.hotel.micro.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="hotels")
public class Hotel {

	@Id
	@Column(name="Id")
	private String id;
	@Column(name="NAME",length=15)
	private String name;
	@Column(name="LOCATION")
	private String location;
	@Column(name="ABOUT")
	private String about;
}
