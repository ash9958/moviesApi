package com.example.movies.dao;

import java.util.List;

import com.example.movies.exception.MovieNotFoundException;
import com.example.movies.model.Movie;

public interface FavoritesDao {
	void addFavoritesItem(String userId, long movieId) throws MovieNotFoundException;

	List<Movie> getAllFavoritesItems(String userId);

	void removeFavoritesItem(String userId, long movieId) throws MovieNotFoundException;

	long getTotal(String userId);
}
