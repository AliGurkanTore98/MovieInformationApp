package com.codingurkan.movieinformationapp

import java.io.Serializable

data class InformationItem(
    val filmListesi : String,
    val filmGorselleri : Int,
    val yilListesi : Int,
    val basrolOyuncu :String,
    val imdbScore : Int
): Serializable
