package com.drivein.movie.cinema;

import java.util.List;

public interface MovieCatalogueService
{
	public void addMovie(MovieCatalogue moviecatalogue);
	public void updateMovie(MovieCatalogue moviecatalogue);
	public MovieCatalogue getMovieByTitle(String title);
	public List<MovieCatalogue> searchMovieByTitle(String title);
	public void deleteMovie(String title);
}

