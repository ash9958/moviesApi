package com.example.movies.service;

import java.util.List;

import com.example.movies.exception.MovieNotFoundException;
import com.example.movies.model.Movie;

public interface MovieService {
	List<Movie> getMovieListCustomer();

	void modifyMovie(Movie movie);

	Movie getMovie(long id) throws MovieNotFoundException;
}
