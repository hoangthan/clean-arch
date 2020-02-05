package com.brkr.cleanArch.movie.domain

import com.brkr.cleanArch.movie.domain.entities.Movie
import com.brkr.cleanArch.movie.domain.repositories.MovieRepository
import org.springframework.stereotype.Component

/*Factory is an object that has the sole responsibility to create other objects.*/
interface MovieFactory {
    fun create(
        id: String,
        name: String,
        cost: Float,
        discountRate: Float
    ): Movie
}

@Component
class MovieFactoryImpl(private val movieRepository: MovieRepository) : MovieFactory {

    override fun create(id: String, name: String, cost: Float, discountRate: Float): Movie {
        return movieRepository.getMovieById(id) ?: createMovie(id, name, cost, discountRate)
    }

    fun createMovie(id: String, name: String, cost: Float, discountRate: Float): Movie {
        return Movie(
            id, name, cost, discountRate
        )
    }

}