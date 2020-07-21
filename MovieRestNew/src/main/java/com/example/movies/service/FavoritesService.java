package com.example.movies.service;

import java.util.List;

import com.example.movies.exception.MovieNotFoundException;
import com.example.movies.model.Movie;

public interface FavoritesService {
	void addFavoritesItem(String userId, long movieId) throws MovieNotFoundException;

	List<Movie> getAllFavoritesItems(String userId);

	void removeFavoritesItem(String userId, long movieId) throws MovieNotFoundException;
	
	long getTotal(String userId);
}
