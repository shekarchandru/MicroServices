package com.cts.model;

public class Movies {

	String movieId;
	String movieName;
	float collections;
	int releaseYear;
	
	public Movies() {
		super();
	}

	public Movies(String movieId, String movieName, float collections, int releaseYear) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.collections = collections;
		this.releaseYear = releaseYear;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public float getCollections() {
		return collections;
	}

	public void setCollections(float collections) {
		this.collections = collections;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	
	
	
	
}
