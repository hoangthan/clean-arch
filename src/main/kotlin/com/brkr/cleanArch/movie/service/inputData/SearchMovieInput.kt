package com.brkr.cleanArch.movie.service.inputData

import jdk.internal.util.xml.impl.Input

data class SearchMovieInput(
    val keyword: String
) : Input()