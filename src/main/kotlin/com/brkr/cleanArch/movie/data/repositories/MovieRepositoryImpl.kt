package com.brkr.cleanArch.movie.data.repositories

import com.brkr.cleanArch.movie.data.dataSource.DataSource
import com.brkr.cleanArch.movie.data.dto.MovieDto
import com.brkr.cleanArch.movie.domain.entities.Movie
import com.brkr.cleanArch.movie.domain.repositories.MovieRepository
import org.springframework.stereotype.Component


/*
* This class is not communicate directly with database.
* It just use datasource api to get data and then mapping from DTO => Domain Object.
* */
@Component
class MovieRepositoryImpl(
    private val dataSource: DataSource
) : MovieRepository {

    override fun insert(movie: Movie): Boolean {
        val movieDto = convertToMovieDto(movie)
        return dataSource.insertMovie(movieDto)
    }

    override fun deleteMovie(id: String): Boolean {
        return dataSource.deleteMovieById(id)
    }

    override fun updateMovie(movie: Movie): Boolean {
        val movieDto = convertToMovieDto(movie)
        return dataSource.updateMovie(movieDto)
    }

    override fun searchMovie(name: String): List<Movie> {
        val result = dataSource.searchMovieByName(name)
        return result.map {
            convertToMovieDomain(it)
        }
    }

    override fun getTopPopular(): List<Movie> {
        val topPopular = dataSource.getTopPopularMovie()
        return topPopular.map {
            convertToMovieDomain(it)
        }
    }

    override fun getMovieById(id: String): Movie? {
        val movie = dataSource.getMovieById(id)
        return convertToMovieDomain(movie)
    }

    fun convertToMovieDomain(movieDto: MovieDto): Movie {
        return Movie(
            movieDto.id,
            movieDto.name,
            movieDto.cost,
            movieDto.discountRate
        )
    }

    fun convertToMovieDto(movie: Movie): MovieDto {
        return MovieDto(
            movie.id,
            movie.name,
            movie.cost,
            movie.discountRate
        )
    }
}
