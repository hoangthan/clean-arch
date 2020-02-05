package com.brkr.cleanArch.movie.data.dataSource

import com.brkr.cleanArch.movie.data.dto.MovieDto

interface DataSource {
    fun insertMovie(movieDto: MovieDto): Boolean
    fun searchMovieByName(name: String): List<MovieDto>
    fun deleteMovieById(id: String): Boolean
    fun getMovieById(id: String): MovieDto
    fun updateMovie(movieDto: MovieDto): Boolean
    fun getTopPopularMovie(): List<MovieDto>
}