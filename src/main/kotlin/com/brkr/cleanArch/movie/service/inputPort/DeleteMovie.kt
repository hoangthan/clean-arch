package com.brkr.cleanArch.movie.service.inputPort

interface DeleteMovie {
    fun handle(id: String)
}