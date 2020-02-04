package com.brkr.cleanArch.movie.data.repositories

import com.brkr.cleanArch.movie.domain.entities.Movie
import com.brkr.cleanArch.movie.domain.repositories.MovieRepositories
import org.springframework.stereotype.Repository


/*
* This class will communicate directly with database. It can be SQL Server, Postgre, Dynamo, etc...
* */
@Repository
class MovieRepositoryImpl : MovieRepositories {

    override fun insert(movie: Movie): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteMovie(id: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateMovie(movie: Movie): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun searchMovie(name: String): List<Movie> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTopPopular(): List<Movie> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}