package com.springmvc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Entidade implements Serializable{
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@NotNull
	@Size(min=2, max=30)
	private String inputTag;
	
	
	
	// ----- Getters and Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getInputTag() {
		return inputTag;
	}
	public void setInputTag(String inputTag) {
		this.inputTag = inputTag;
	}
	

}
