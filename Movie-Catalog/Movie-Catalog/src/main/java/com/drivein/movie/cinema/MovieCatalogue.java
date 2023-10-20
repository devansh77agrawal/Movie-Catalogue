package com.drivein.movie.cinema;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class MovieCatalogue 
{
	@Id
	private String title;
	private String description;
	private String genre;
	private Double imdbRating;
	
	public MovieCatalogue()
	{
		
	}
	public MovieCatalogue(String title, String description, String genre, Double imdbRating) 
	{
		super();
		this.title = title;
		this.description = description;
		this.genre = genre;
		this.imdbRating = imdbRating;
	}
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	public String getGenre() 
	{
		return genre;
	}
	public void setGenre(String genre) 
	{
		this.genre = genre;
	}
	public Double getImdbRating() 
	{
		return imdbRating;
	}
	public void setImdbRating(Double imdbRating) 
	{
		this.imdbRating = imdbRating;
	}
}
