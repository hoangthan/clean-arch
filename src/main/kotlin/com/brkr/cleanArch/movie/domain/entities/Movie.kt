package com.brkr.cleanArch.movie.domain.entities

data class Movie(
        val id: String,
        val name: String,
        val cost: Float,
        val discountRate: Float
) : DomainModel() {
    override fun toString(): String {
        return "Name: $name - Price: $cost"
    }
}
