package com.brkr.cleanArch.movie.service.outputData

data class MovieOutput(
    val status: String,
    val message: String,
    val error: ErrorBody,
    val movieResponseFormat: MovieResponseFormat
)