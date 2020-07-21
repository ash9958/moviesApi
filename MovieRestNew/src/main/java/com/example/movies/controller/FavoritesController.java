package com.example.movies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movies.exception.MovieNotFoundException;
import com.example.movies.model.Movie;
import com.example.movies.service.FavoritesService;

@RestController
@RequestMapping("/favorites")
public class FavoritesController {

	@Autowired
	FavoritesService favoritesService;

	@PostMapping("/{userId}/{movieId}")
	void addCartItem(@PathVariable String userId, @PathVariable long movieId) throws MovieNotFoundException {
		favoritesService.addFavoritesItem(userId, movieId);
	}

	@GetMapping("/{userId}")
	List<Movie> getAllCartItems(@PathVariable String userId) {
		return favoritesService.getAllFavoritesItems(userId);
	}

	@DeleteMapping("/{userId}/{movieId}")
	void removeCartItem(@PathVariable String userId, @PathVariable long movieId) throws MovieNotFoundException {
		favoritesService.removeFavoritesItem(userId, movieId);
	}

	@GetMapping("/favlist/{userId}")
	long getTotalFav(@PathVariable String userId) {
		return favoritesService.getTotal(userId);
	}

}
