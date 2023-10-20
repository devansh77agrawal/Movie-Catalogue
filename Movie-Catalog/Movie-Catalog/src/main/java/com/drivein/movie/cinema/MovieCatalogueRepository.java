package com.drivein.movie.cinema;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface MovieCatalogueRepository extends JpaRepository<MovieCatalogue, String>
{
	void addMovie(MovieCatalogue movieCatalogue);
	void updateMovie(MovieCatalogue movieCatalogue);
	MovieCatalogue getMovieByTitle(String title);
    List<MovieCatalogue> searchMovieByTitle(String title);
	void deleteMovie(String title);
	MovieCatalogue findByTitle(String title);
	List<MovieCatalogue> findAllByTitleContaining(String title);
	void deleteByTitle(String title);
}
