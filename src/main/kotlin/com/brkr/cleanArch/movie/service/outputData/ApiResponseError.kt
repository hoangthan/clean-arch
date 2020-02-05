package com.brkr.cleanArch.movie.service.outputData

sealed class ErrorBody

object EmptyError : ErrorBody()

data class ApiResponseError(
    val message: String?,
    val errorCode: Int?
) : ErrorBody()