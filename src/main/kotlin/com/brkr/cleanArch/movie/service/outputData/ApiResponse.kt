package com.brkr.cleanArch.movie.service.outputData

sealed class ApiResponse {
    data class Success(val movieOutput: MovieOutput) : ApiResponse()
    data class Fail(val movieOutput: MovieOutput) : ApiResponse()
}