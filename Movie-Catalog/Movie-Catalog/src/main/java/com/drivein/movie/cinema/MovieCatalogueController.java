package com.drivein.movie.cinema;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.drivein.movie.cinema.MovieCatalogue;
import com.drivein.movie.cinema.MovieCatalogueService;
import com.drivein.movie.cinema.MovieNotFoundException;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/moviecatalogue")
public class MovieCatalogueController 
{
	@Autowired
	private MovieCatalogueService movieCatalogueService;
	
	/*
	 * @GetMapping("/") public String home(Model model) { List<MovieCatalogue>
	 * movies = getMovieByTitle(null); model.addAttribute("movies",movies); return
	 * "index"; }
	 */
	
	/*
	 * @RequestMapping("/movie") public String welcomePage() {
	 * System.out.print("Welcome to Movie Catalogue"); return "welcomePage"; }
	 */

	@PostMapping("/addMovie/{title}")
	public void addMovie(@RequestBody MovieCatalogue movieCatalogue)throws MovieNotFoundException
	{
		movieCatalogueService.addMovie(movieCatalogue);
	}
	
	@PutMapping("/updatemovie/{title}")
	public void updateMovie(@PathVariable("title") String title, @RequestBody MovieCatalogue movieCatalogue)throws MovieNotFoundException
	{
		MovieCatalogue existingMovie = movieCatalogueService.getMovieByTitle(title);
		if(existingMovie != null)
		{
			movieCatalogue.setTitle(title);
			movieCatalogueService.updateMovie(movieCatalogue);
		}
	}
	
	@GetMapping("/movie/{title}")
	public MovieCatalogue getMovieByTitle(@PathVariable("title") String title) throws MovieNotFoundException
	{
		MovieCatalogue existingMovie = movieCatalogueService.getMovieByTitle(title);
		if(existingMovie == null)
		{
			throw new MovieNotFoundException("Movie with title " + title + "not found");
		}
		else
		{
		return movieCatalogueService.getMovieByTitle(title);
		}
	}
	
	@GetMapping("/searchmovie/{title}")
	public List<MovieCatalogue> searchMovieByTitle(@RequestParam("title") String title) throws MovieNotFoundException
	{
		return movieCatalogueService.searchMovieByTitle(title);
	}
	
	@DeleteMapping("/deletemovie/{title}")
	public void deleteMovie(@PathVariable("title") String title) throws MovieNotFoundException
	{
		movieCatalogueService.deleteMovie(title);
	}
}
