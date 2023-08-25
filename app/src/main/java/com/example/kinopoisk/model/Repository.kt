package com.example.kinopoisk.model

interface Repository {
    fun getFilmFromServer(): Film
    fun getFilmFromLocalStorage(): Film
}