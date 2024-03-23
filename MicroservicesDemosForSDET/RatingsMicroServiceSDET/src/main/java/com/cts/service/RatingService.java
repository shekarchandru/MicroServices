package com.cts.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.model.Movies;
import com.cts.model.Rating;
import com.cts.model.User;

@Service
public class RatingService {

	List <User> users;
	List <Movies> movies ;
	List <Rating> ratings;
	
	public RatingService() {
		super();
		
		users = new ArrayList<User>();
		User u1 = new User("U001","Harsha","har@gmail.com");
		User u2 = new User("U002","Kiran","kir@gmail.com");
		User u3 = new User("U003","Mahesh","mah@gmail.com");
		User u4 = new User("U004","Suman","sum@gmail.com");
		User u5 = new User("U005","Suman","sum@gmail.com");
		User u6 = new User("U006","Suman","sum@gmail.com");
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		
		ratings = new ArrayList<Rating>();
		Rating r1 = new Rating(u1,3);
		Rating r2 = new Rating(u2,2);
		Rating r3 = new Rating(u3,4);
		Rating r4 = new Rating(u4,3);
		
		Rating r5 = new Rating(u1,5);
		Rating r6 = new Rating(u2,2);
		Rating r7 = new Rating(u5,4);
		Rating r8 = new Rating(u4,2);
		
		Rating r9 = new Rating(u1,3);
		Rating r10 = new Rating(u2,4);
		Rating r11 = new Rating(u3,4);
		Rating r12 = new Rating(u6,5);
		
		Rating r13 = new Rating(u5,3);
		Rating r14 = new Rating(u6,2);
		Rating r15  = new Rating(u3,4);
		Rating r16 = new Rating(u4,3);
		
		Rating[] rating1 = {r1,r2,r3,r4};
		Rating[] rating2 = {r5,r6,r7,r8};
		Rating[] rating3 = {r9,r10,r11,r12};
		Rating[] rating4 = {r13,r14,r15,r16};
		
		ratings.add(r1);
		ratings.add(r2);
		ratings.add(r3);
		ratings.add(r4);
		
		ratings.add(r5);
		ratings.add(r6);
		ratings.add(r7);
		ratings.add(r8);
		
		ratings.add(r9);
		ratings.add(r10);
		ratings.add(r11);
		ratings.add(r12);
		
		ratings.add(r13);
		ratings.add(r14);
		ratings.add(r15);
		ratings.add(r16);
		
		movies = new ArrayList<Movies>();
		Movies m1 = new Movies("M001","JFKK",23455.56f,2000,rating1);
		Movies m2 = new Movies("M002","KFJH",330455.56f,2010,rating2);
		Movies m3 = new Movies("M003","ASFG",830455.56f,2015,rating3);
		Movies m4 = new Movies("M004","KGJJ",1230455.56f,2020,rating4);
		Movies m5 = new Movies("M005","ATYR",234455.56f,2015,rating1);
		Movies m6 = new Movies("M006","KJSH",1830455.56f,2016,rating2);
		Movies m7 = new Movies("M007","HSGD",1230455.56f,2017,rating3);
		Movies m8 = new Movies("M008","AHSJ",2304455.56f,2018,rating4);
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		movies.add(m4);
		movies.add(m5);
		movies.add(m6);
		movies.add(m7);
		movies.add(m8);
	}

	public RatingService(List<User> users, List<Movies> movies, List<Rating> ratings) {
		super();
		this.users = users;
		this.movies = movies;
		this.ratings = ratings;
	}
	
	/* 
	 * 
	 * movies/ratings/users/{uid} -- Get Movies rated by the user
	 * /ratings/{movid}  -- get the ratings for the movie id
	 * /movies/rating/{rating} get all movies with that rating
	 * 
	 * */
	public List <Movies> getMoviesRatedByUserID(String userId)
	{
		List <Movies> moviesRatedByUser = new ArrayList<Movies>();
		Iterator <Movies> movieIter = movies.iterator();
		while(movieIter.hasNext())
		{
			Movies movie =movieIter.next();
			
			Rating[] mRating = movie.getRatings();
			for(Rating r:mRating)
			{
				User user = r.getUserID();
				if(user.getUserId().equals(userId))
				{
					moviesRatedByUser.add(movie);
				}
			}
			
		}
		return moviesRatedByUser;
	}
	
}
