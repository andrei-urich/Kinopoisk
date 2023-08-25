package com.example.kinopoisk.model

class RepositoryImpl : Repository {
    override fun getFilmFromServer(): Film {
        return Film()
    }

    override fun getFilmFromLocalStorage(): Film {
        return Film()
    }
}