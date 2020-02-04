package com.brkr.cleanArch.movie.domain.factories

import com.brkr.cleanArch.movie.domain.entities.Movie
import com.brkr.cleanArch.movie.domain.repositories.MovieRepositories
import com.brkr.cleanArch.utils.extension.normalizeString
import org.springframework.stereotype.Component

interface MovieFactory {
    fun searchMovieByName(name: String): List<Movie>
    fun getTopPopularMovie(): List<Movie>
    fun createOrUpdateMovie(movie: Movie): Boolean
    fun deleteMovie(movieId: String): Boolean
}


/*
* This class is not interact directly with database. It communicate via movie repository interface.
* It handle the database logic, not business logic
*/
@Component
class MovieFactoryImpl(private val movieRepositories: MovieRepositories) : MovieFactory {
    override fun searchMovieByName(name: String): List<Movie> {
        val result = movieRepositories.searchMovie(name)
        return if (result.isNullOrEmpty()) {
            movieRepositories.searchMovie(name.normalizeString())
        } else movieRepositories.searchMovie(name)
    }

    override fun getTopPopularMovie(): List<Movie> = movieRepositories.getTopPopular()

    override fun createOrUpdateMovie(movie: Movie): Boolean = movieRepositories.insert(movie)

    override fun deleteMovie(movieId: String): Boolean = movieRepositories.deleteMovie(movieId)
}
