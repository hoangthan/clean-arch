package com.brkr.cleanArch.movie.data.dataSource

import com.brkr.cleanArch.movie.data.dto.MovieDto
import org.springframework.stereotype.Repository

interface FakeDataSource : DataSource

@Repository
class FakeDataSourceImpl : FakeDataSource {
    override fun insertMovie(movieDto: MovieDto): Boolean {
        print("Inserted")
        return true
    }

    override fun searchMovieByName(name: String): List<MovieDto> {
        val result: ArrayList<MovieDto> = ArrayList()
        result.add(
            MovieDto(
                "1",
                "Titanic",
                20f,
                20f
            )
        )
        print("Searched")
        return result
    }

    override fun deleteMovieById(id: String): Boolean {
        print("Deleted")
        return true
    }

    override fun getMovieById(id: String): MovieDto {
        print("Got by id")
        return MovieDto(
            "1",
            "Titanic",
            20f,
            20f
        )
    }

    override fun updateMovie(movieDto: MovieDto): Boolean {
        print("Updated")
        return true
    }

    override fun getTopPopularMovie(): List<MovieDto> {
        val result: ArrayList<MovieDto> = ArrayList()
        result.add(
            MovieDto(
                "1",
                "Titanic",
                20f,
                20f
            )
        )
        print("Top popular")
        return result
    }
}

