package com.example.kinopoisk.viewmodel

import com.example.kinopoisk.model.Film

sealed class AppState {
data class Success(val filmData: Film) : AppState()
data class Error(val error: Throwable) : AppState()
object Loading : AppState()
}

