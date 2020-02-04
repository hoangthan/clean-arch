package com.brkr.cleanArch.movie.data.dto

data class MovieDto(
        val id: String,
        val name: String,
        val cost: Float,
        val discountRate: Float
) : DtoModel() {
    override fun toString(): String {
        return "[MovieDTO]Name: $name - Price: $cost"
    }
}