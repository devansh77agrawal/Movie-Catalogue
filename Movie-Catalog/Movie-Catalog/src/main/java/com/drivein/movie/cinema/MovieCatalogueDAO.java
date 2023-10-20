package com.drivein.movie.cinema;

import java.util.List;

public interface MovieCatalogueDAO 
{	
	void addMovie(MovieCatalogue movieCatalogue);
	void updateMovie(MovieCatalogue movieCatalogue);
	MovieCatalogue getMovieByTitle(String title);
    List<MovieCatalogue> searchMovieByTitle(String title);
	void deleteMovie(String title);	
}
