package com.cts.model;

public class Rating {

	User userID;
	int rating;
	
	public Rating() {
		super();
	}

	public Rating(User userID, int rating) {
		super();
		this.userID = userID;
		this.rating = rating;
	}

	public User getUserID() {
		return userID;
	}

	public void setUserID(User userID) {
		this.userID = userID;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	
	
	
	
	
	
	
	
}
