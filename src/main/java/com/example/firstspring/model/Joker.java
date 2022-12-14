package com.example.firstspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Joker {
	@Id  //set id as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // set Auto increment
	private Integer id;
	private String name;
	private Float weight;
	private Double footSize;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	public Double getFootSize() {
		return footSize;
	}
	public void setFootSize(Double footSize) {
		this.footSize = footSize;
	}
	@Override
	public String toString() {
		return "Joker [id=" + id + ", name=" + name + ", weight=" + weight + ", footSize=" + footSize + "]";
	}

	
	
	

	
	
}
