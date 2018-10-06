package com.template.ie.model;

/**
 * 与数据库表相对应的实体类
 * @author Clyde
 */
public class Country {
	
	private Long id;
	private String countryname;
	private String countrycode;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
}