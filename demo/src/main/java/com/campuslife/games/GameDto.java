package com.campuslife.games;

import java.util.Date;

public class GameDto {

	public String name;
	public Date dateOfUse;
	public double rating;
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfUse() {
		return dateOfUse;
	}
	public void setDateOfUse(Date dateOfUse) {
		this.dateOfUse = dateOfUse;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	//Empty Constructor
	public GameDto() {	
	}
	
	//To String
	@Override
	public String toString() {
		return "GameDto [name=" + name + ", dateOfUse=" + dateOfUse + ", rating=" + rating + "]";
	}
	
	
	
	
}
