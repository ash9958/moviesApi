package com.example.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movies.dao.FavoritesDao;
import com.example.movies.exception.MovieNotFoundException;
import com.example.movies.model.Movie;

@Service
public class FavoritesServiceImpl implements FavoritesService {

	@Autowired
	FavoritesDao favoritesDao;

	@Override
	public void addFavoritesItem(String userId, long movieId) throws MovieNotFoundException {
		favoritesDao.addFavoritesItem(userId, movieId);
	}

	@Override
	public List<Movie> getAllFavoritesItems(String userId) {
		return favoritesDao.getAllFavoritesItems(userId);
	}

	@Override
	public void removeFavoritesItem(String userId, long movieId) throws MovieNotFoundException {
		favoritesDao.removeFavoritesItem(userId, movieId);
	}

	@Override
	public long getTotal(String userId) {
		return favoritesDao.getTotal(userId);
	}

}
