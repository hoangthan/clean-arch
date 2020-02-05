package com.brkr.cleanArch.movie.service.inputData

data class CreateMovieInput(
    val id: String,
    val name: String,
    val price: Float,
    val discountRate: Float
) : InputModel()