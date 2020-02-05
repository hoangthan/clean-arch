package com.brkr.cleanArch.movie.service.inputPort

interface SearchMovie {
    fun handle(keyword: String)
}