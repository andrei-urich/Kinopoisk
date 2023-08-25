package com.example.kinopoisk.model

data class Film(
    val id: Int = getDefaultID(),
    val rating: Double = 0.0,
    val type: String = "tv-series",
    val name: String = "Офис",
    val description: String = "Сериал о трудовых буднях небольшого регионального офиса крупной компании, обитатели которого целыми днями должны терпеть закидоны своего непутевого босса.",
    val year: Int = 2005,
    val backdrop: String = "",
    val poster: String = "",
    val logo: String = "",
    val genres: String = "",
    val countries: String = ""
)

fun getDefaultID(): Int = 12345
