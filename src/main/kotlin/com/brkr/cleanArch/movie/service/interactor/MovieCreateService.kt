package com.brkr.cleanArch.movie.service.interactor

import com.brkr.cleanArch.movie.domain.MovieFactory
import com.brkr.cleanArch.movie.domain.repositories.MovieRepository
import com.brkr.cleanArch.movie.service.inputData.CreateMovieInput
import com.brkr.cleanArch.movie.service.inputPort.CreateMovie

class MovieCreateService(
    private val movieRepository: MovieRepository,
    private val movieFactory: MovieFactory
) : CreateMovie {
    override fun handle(movieInput: CreateMovieInput): Boolean {
        val movie = movieFactory.create(
            movieInput.id,
            movieInput.name,
            movieInput.price,
            movieInput.discountRate
        )
    }
}