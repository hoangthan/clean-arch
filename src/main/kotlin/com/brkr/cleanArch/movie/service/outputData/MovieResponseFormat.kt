package com.brkr.cleanArch.movie.service.outputData

data class MovieResponseFormat(
    val movieId: String,
    val name: String,
    val cost: Float,
    val discountRate: Float
)