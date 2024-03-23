package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Movies;
import com.cts.service.MovieService;

@RestController
public class MoviesController {

	@Autowired
	private MovieService movService;
	
	@RequestMapping(value="/movies",method=RequestMethod.GET)
	public List <Movies> fetchMovies()
	{
		return movService.getMovies();
	}
	
	@GetMapping(value="/movies/{yr}")
	public List <Movies> fetchMoviesByYear(@PathVariable int yr)
	{
		return movService.getMoviesByYear(yr);
	}
	
	@GetMapping(value="/moviescoln")
	public List <Movies> fetchMoviesByColn(@RequestParam float coln)
	{
		return movService.getMoviesByCollections(coln);
	}
	
}
