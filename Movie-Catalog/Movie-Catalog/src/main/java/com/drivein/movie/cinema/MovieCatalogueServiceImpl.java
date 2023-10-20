package com.drivein.movie.cinema;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drivein.movie.cinema.MovieCatalogue;
import com.drivein.movie.cinema.MovieCatalogueRepository;

@Service
public class MovieCatalogueServiceImpl implements MovieCatalogueService
{
	@Autowired
	private MovieCatalogueRepository movieCatalogueRepository;
	
	@Override
	public void addMovie(MovieCatalogue movieCatalogue)
	{
		movieCatalogueRepository.save(movieCatalogue);
	}
	
	@Override
	public void updateMovie(MovieCatalogue movieCatalogue)
	{
		movieCatalogueRepository.save(movieCatalogue);
	}
	
	@Override
	public MovieCatalogue getMovieByTitle(String title)
	{
		return movieCatalogueRepository.findByTitle(title);
	}

	@Override
	public List<MovieCatalogue> searchMovieByTitle(String title) 
	{
		return movieCatalogueRepository.findAllByTitleContaining(title);
	}

	@Override
	public void deleteMovie(String title)
	{
		movieCatalogueRepository.deleteByTitle(title);
	}
}
