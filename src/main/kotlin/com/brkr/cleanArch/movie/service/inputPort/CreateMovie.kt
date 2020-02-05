package com.brkr.cleanArch.movie.service.inputPort

import com.brkr.cleanArch.movie.service.inputData.CreateMovieInput

interface CreateMovie {
    fun handle(movieInput: CreateMovieInput): Boolean
}