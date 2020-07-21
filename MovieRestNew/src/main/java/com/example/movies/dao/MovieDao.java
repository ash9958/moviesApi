package com.example.movies.dao;

import java.util.List;

import com.example.movies.exception.MovieNotFoundException;
import com.example.movies.model.Movie;

public interface MovieDao {
	List<Movie> getMovieListCustomer();

	void modifyMovie(Movie movie);

	Movie getMovie(long id) throws MovieNotFoundException;
}
