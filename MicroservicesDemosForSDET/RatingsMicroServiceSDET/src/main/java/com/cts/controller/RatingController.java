package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Movies;
import com.cts.service.RatingService;

@RestController
public class RatingController {
	
	@Autowired
	private RatingService rService;
	
	@RequestMapping("movies/ratings/users/{uid}")
	public List <Movies> getMoviesRatedBySpUser(@PathVariable String uid)
	{
		return rService.getMoviesRatedByUserID(uid);
	}

}
