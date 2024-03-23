package com.cts.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.model.Movies;

@Service
public class MovieService {

	List <Movies> movies;

	public MovieService() {
		super();
		movies = new ArrayList<Movies>();
		Movies m1 = new Movies("M001","JFKK",23455.56f,2000);
		Movies m2 = new Movies("M002","KFJH",330455.56f,2010);
		Movies m3 = new Movies("M003","ASFG",830455.56f,2015);
		Movies m4 = new Movies("M004","KGJJ",1230455.56f,2020);
		Movies m5 = new Movies("M005","ATYR",234455.56f,2015);
		Movies m6 = new Movies("M006","KJSH",1830455.56f,2016);
		Movies m7 = new Movies("M007","HSGD",1230455.56f,2017);
		Movies m8 = new Movies("M008","AHSJ",2304455.56f,2018);
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		movies.add(m4);
		movies.add(m5);
		movies.add(m6);
		movies.add(m7);
		movies.add(m8);
	}
	public List <Movies> getMovies()
	{
		return movies;
	}
	
	public List <Movies> getMoviesByYear(int year)
	{
		List <Movies> moviesYr = new ArrayList<Movies>();
		Iterator <Movies> movIter = movies.iterator();
		while(movIter.hasNext())
		{
			Movies movie = movIter.next();
			if(movie.getReleaseYear() == (year))
			{
				moviesYr.add(movie);
			}
		}
		return moviesYr;
	}
	
	public List <Movies> getMoviesByCollections(float collection)
	{
		List <Movies> moviesColn = new ArrayList<Movies>();
		Iterator <Movies> movIter = movies.iterator();
		while(movIter.hasNext())
		{
			Movies movie = movIter.next();
			if(movie.getCollections() >= collection)
			{
				moviesColn.add(movie);
			}
		}
		return moviesColn;
	}
	
	
}
