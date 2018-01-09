package com.springmvc.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.springmvc.validator.Password;
import com.springmvc.validator.TextArea;

@Entity
public class Entidade implements Serializable{
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@NotNull
	@Size(min=2, max=30)
	private String inputTag;
	
	private Boolean checkboxSingleTag;
	
	private List<String> checkboxMultipleTag;
	
	private String optionsTag;
	
	private String selectTag;
	
	@Password
	private String passwordTag;
	
	private String radiobuttonsTag;
	
	@TextArea
	private String textareaTag;
	
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
	public Boolean getCheckboxSingleTag() {
		return checkboxSingleTag;
	}
	public void setCheckboxSingleTag(Boolean checkboxSingleTag) {
		this.checkboxSingleTag = checkboxSingleTag;
	}
	public List<String> getCheckboxMultipleTag() {
		return checkboxMultipleTag;
	}
	public void setCheckboxMultipleTag(List<String> checkboxMultipleTag) {
		this.checkboxMultipleTag = checkboxMultipleTag;
	}
	public String getOptionsTag() {
		return optionsTag;
	}
	public void setOptionsTag(String optionsTag) {
		this.optionsTag = optionsTag;
	}
	public String getSelectTag() {
		return selectTag;
	}
	public void setSelectTag(String selectTag) {
		this.selectTag = selectTag;
	}
	public String getPasswordTag() {
		return passwordTag;
	}
	public void setPasswordTag(String passwordTag) {
		this.passwordTag = passwordTag;
	}
	public String getRadiobuttonsTag() {
		return radiobuttonsTag;
	}
	public void setRadiobuttonsTag(String radiobuttonsTag) {
		this.radiobuttonsTag = radiobuttonsTag;
	}
	public String getTextareaTag() {
		return textareaTag;
	}
	public void setTextareaTag(String textareaTag) {
		this.textareaTag = textareaTag;
	}
	

}
