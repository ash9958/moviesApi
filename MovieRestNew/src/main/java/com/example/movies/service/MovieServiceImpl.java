package com.example.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movies.dao.MovieDao;
import com.example.movies.exception.MovieNotFoundException;
import com.example.movies.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDao movieDao;

	@Override
	public List<Movie> getMovieListCustomer() {
		return movieDao.getMovieListCustomer();
	}

	@Override
	public void modifyMovie(Movie movie) {
		movieDao.modifyMovie(movie);
	}

	@Override
	public Movie getMovie(long id) throws MovieNotFoundException {
		return movieDao.getMovie(id);
	}

}
