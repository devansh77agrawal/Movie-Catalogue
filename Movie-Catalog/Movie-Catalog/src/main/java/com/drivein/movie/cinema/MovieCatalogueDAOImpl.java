package com.drivein.movie.cinema;

import java.util.List;


import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MovieCatalogueDAOImpl implements MovieCatalogueDAO
{
	
	private EntityManager entityManager;
	
	@Override
	public void addMovie(MovieCatalogue movieCatalogue) 
	{
		// TODO Auto-generated method stub
		entityManager.persist(movieCatalogue);
	}

	@Override
	public void updateMovie(MovieCatalogue movieCatalogue) 
	{
		// TODO Auto-generated method stub
		entityManager.merge(movieCatalogue);
	}

	@Override
	public void deleteMovie(String title) 
	{
		// TODO Auto-generated method stub
		MovieCatalogue movie = getMovieByTitle(title);
		entityManager.remove(movie);
	}

	@Override
	public MovieCatalogue getMovieByTitle(String title) 
	{
		// TODO Auto-generated method stub
		return entityManager.find(MovieCatalogue.class, title);
	}

	@Override
	public List<MovieCatalogue> findAllByTitleContaining(String title) 
	{
		// TODO Auto-generated method stub
		String query = "SELECT m FROM MovieCatalogue m WHERE m.tilte LIKE CONCAT('%',:TITLE,'%')";
		return entityManager.createQuery(query, MovieCatalogue.class)
				.setParameter("title", title)
				.getResultList();
	}

	@Override
	public List<MovieCatalogue> searchMovieByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
