/*
 * package com.drivein.movie.cinema; import static
 * org.junit.jupiter.api.Assertions.assertEquals; import static
 * org.mockito.Mockito.when; import java.util.ArrayList; import java.util.List;
 * 
 * import org.junit.jupiter.api.BeforeEach; import org.junit.jupiter.api.Test;
 * import org.mockito.InjectMocks; import org.mockito.Mock; import
 * org.mockito.MockitoAnnotations; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity;
 * 
 * import com.drivein.movie.*
 * 
 *  
 * 
 * @SpringBootTest public class MovieCatalogueApplicationTests {    
 * 
 * @Mock private MovieCatalogueService movieCatalogueService;
 * 
 * @InjectMocks private MovieCatalogueController movieCatalogueController;
 * 
 * @BeforeEach public void setUp() { MockitoAnnotations.openMocks(this);     }
 * 
 * @Test public void testGetAllMovies() throws MovieNotFoundException {
 * 
 *         List<MovieCatalogue> movies = new ArrayList<>();
 * 
 *         movies.add(new MovieCatalogue(1, "RRR", "Action Movie", "Action",
 * 8.5));
 * 
 *         movies.add(new MovieCatalogue(1, "Avatar: The Way of Water",
 * "Avatar is science fiction film", "Sci-fi/Action", 9.5));
 * 
 *  
 * 
 *         when(movieServiceInterface.getAllMovies()).thenReturn(movies);
 * 
 *  
 * 
 *         ResponseEntity<List<MovieCatalogue>> responseEntity =
 * movieCatalogueController.getAllMovies();
 * 
 *  
 * 
 *         assert responseEntity.getStatusCode() == HttpStatus.OK;
 * 
 *         assert responseEntity.getBody() == movies;
 * 
 *     }
 * 
 *  
 * 
 *    
 * 
 * @Test
 * 
 *     public void testGetMovieByTitle() throws MovieNotFoundException {
 * 
 *         MovieCatalogue movie = new MovieCatalogue(1, "RRR", "Action Movie",
 * "Action", 8.5);
 * 
 *  
 * 
 *        
 * when(movieServiceInterface.getMovieByTitle(movie.getTitle())).thenReturn(
 * movie);
 * 
 *  
 * 
 *         ResponseEntity<MovieCatalogue> responseEntity =
 * movieCatalogueController.getMovieByTitle(movie.getTitle());
 * 
 *  
 * 
 *         assert responseEntity.getStatusCode() == HttpStatus.OK;
 * 
 *         assert responseEntity.getBody() == movie;
 * 
 *     }
 * 
 *  
 * 
 *    
 * 
 * @Test
 * 
 *     public void testUpdateMovieDetails() throws MovieNotFoundException {
 * 
 *         MovieCatalogue movie = new MovieCatalogue(1, "RRR", "Action Movie",
 * "Action", 8.5);
 * 
 *         MovieCatalogue updatedMovie = new MovieCatalogue(1, "Avatar",
 * "Action Movie", "Action", 9.5);
 * 
 *  
 * 
 *         when(movieServiceInterface.updateMovieDetails(movie.getTitle(),
 * updatedMovie)).thenReturn(updatedMovie);
 * 
 *  
 * 
 *         ResponseEntity<MovieCatalogue> responseEntity =
 * movieCatalogueController.updateMovieDetails(movie.getTitle(),
 * 
 *                 updatedMovie);
 * 
 *  
 * 
 *         assert responseEntity.getStatusCode() == HttpStatus.OK;
 * 
 *         assert responseEntity.getBody() == updatedMovie;
 * 
 *     }
 * 
 *  
 * 
 *    
 * 
 * @Test
 * 
 *     public void testDeleteMovieByTitle() throws MovieNotFoundException {
 * 
 *         String title = "RRR";
 * 
 *  
 * 
 *         when(movieServiceInterface.deleteMovieByTitle(title)).
 * thenReturn("Movie deleted successfully");
 * 
 *  
 * 
 *         ResponseEntity<String> responseEntity =
 * movieCatalogueController.deleteMovieByTitle(title);
 * 
 *  
 * 
 *         assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
 * 
 *         assertEquals("Movie deleted successfully", responseEntity.getBody());
 * 
 *     }
 * 
 *  
 * 
 *    
 * 
 * @Test
 * 
 *     public void testAddMovie() throws MovieNotFoundException {
 * 
 *         MovieCatalogue movie = new MovieCatalogue(2, "Pathan",
 * "Action Movie", "Action", 8.5);
 * 
 *         when(movieServiceInterface.addMovie(movie)).thenReturn(movie);
 * 
 *  
 * 
 *         ResponseEntity<MovieCatalogue> responseEntity =
 * movieCatalogueController.addMovie(movie);
 * 
 *  
 * 
 *         assert responseEntity.getStatusCode() == HttpStatus.OK;
 * 
 *         assert responseEntity.getBody() == movie;
 * 
 *     }
 * 
 *  
 * 
 * }
 */